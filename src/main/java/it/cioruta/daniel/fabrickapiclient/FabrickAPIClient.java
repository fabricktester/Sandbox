/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cioruta.daniel.fabrickapiclient;

/**
 *
 * @author Daniel C.
 *
 */
import it.cioruta.daniel.fabrickapiclient.artifacts.Account;
import it.cioruta.daniel.fabrickapiclient.artifacts.AccountBalance;
import it.cioruta.daniel.fabrickapiclient.artifacts.AccountBalanceResponse;
import it.cioruta.daniel.fabrickapiclient.artifacts.AccountTransactions;
import it.cioruta.daniel.fabrickapiclient.artifacts.AccountTransactionsResponse;
import it.cioruta.daniel.fabrickapiclient.artifacts.Creditor;
import it.cioruta.daniel.fabrickapiclient.artifacts.MoneyTransferRequest;
import it.cioruta.daniel.fabrickapiclient.artifacts.MoneyTransferResponse;
import it.cioruta.daniel.fabrickapiclient.artifacts.Transaction;
import it.cioruta.daniel.fabrickapiclient.core.PersistenceUtil;
import it.cioruta.daniel.fabrickapiclient.core.SandboxServiceImplementation;
import it.cioruta.daniel.fabrickapiclient.core.TransactionsRepository;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.persistence.EntityManager;
import javax.ws.rs.client.Client;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.JerseyClientBuilder;

public class FabrickAPIClient {

    private static final boolean SAVE_TRANSACTIONS_TO_DB = true;

    //could get this info from a properties file
    static String apiKey = "FXOVVXXHVCPVPBZXIJOBGUGSKHDNFRRQJP"; //default
    static String accountId = "14537780"; //default

    public static void main(String[] args) {
        checkAccountBalance();
        checkAccountTransactions();
        transferMoney();
    }

    static void checkAccountBalance() {
        Client client = getNewClient();
        if (client == null) {
            System.out.println("Bad things happened... Unable to build JerseyClient.");
            return;
        }

        SandboxServiceImplementation service = new SandboxServiceImplementation(client);
        service.setAccountId(accountId);
        service.setApiKey(apiKey);

        AccountBalanceResponse abr = service.readAccountBalance();
        if (abr != null) {
            System.out.println("Reading account balance: " + abr.getStatus());
        } else {
            return;
        }

        if ("OK".equals(abr.getStatus())) {
            AccountBalance ab = abr.getPayload();
            System.out.println("Account balance " + ab.getCurrency() + " at " + ab.getDate()
                    + "\nBalance: " + ab.getBalance()
                    + "\nAvailableBalance: " + ab.getAvailableBalance());
        } else {
            abr.getErrors().forEach(error -> System.out.println(error.getCode() + " - " + error.getParams() + " - " + error.getDescription()));
        }
    }

    static void checkAccountTransactions() {

        Client client = getNewClient();
        if (client == null) {
            System.out.println("Bad things happened... Unable to build JerseyClient.");
            return;
        }

        String fromDate = "2019-01-01";
        String toDate = "2019-12-01";

        SandboxServiceImplementation service = new SandboxServiceImplementation(client);
        service.setAccountId(accountId);
        service.setApiKey(apiKey);

        AccountTransactionsResponse atr = service.readAccountTransactions(fromDate, toDate);

        if (atr != null) {
            System.out.println("Reading account transactions: " + atr.getStatus());
        } else {
            return;
        }

        if ("OK".equals(atr.getStatus())) {
            AccountTransactions at = atr.getPayload();

            at.getList().forEach(transaction -> System.out.println(
                    "date: " + transaction.getAccountingDate()
                    + " id: " + transaction.getTransactionId()
                    + " currency: " + transaction.getCurrency()
                    + " ammount: " + transaction.getAmount()
                    + " description " + transaction.getDescription()
            ));

            if (SAVE_TRANSACTIONS_TO_DB) {
                saveTransactionsToDB(at.getList());
            }

        } else {
            atr.getErrors().forEach(error -> System.out.println(error.getCode() + " - " + error.getParams() + " - " + error.getDescription()));
        }

    }

    static void saveTransactionsToDB(List<Transaction> list) {
        EntityManager entityManager = PersistenceUtil.getEntityManager();
        TransactionsRepository tr = new TransactionsRepository(entityManager);

        list.forEach(transaction -> {

            if (!tr.findById(transaction.getTransactionId()).isPresent()) {
                tr.save(transaction);
                System.out.println("Transaction saved: " + transaction.getTransactionId());
            }

        });
        entityManager.close();
        PersistenceUtil.getEntityManagerFactory().close();
    }

    static void transferMoney() {

        MoneyTransferRequest mtreq = new MoneyTransferRequest();

        Creditor cr = new Creditor();
        cr.setName("Mario Rossi");
        Account acc = new Account();
        acc.setAccountCode("IT1234567890");
        cr.setAccount(acc);
        mtreq.setCreditor(cr);
        mtreq.setAmount(0.1);
        mtreq.setCurrency("EUR");
        mtreq.setDescription("test Fabrick Daniel C.");

        Client client = getNewClient();
        if (client == null) {
            System.out.println("Bad things happened... Unable to build JerseyClient.");
            return;
        }

        SandboxServiceImplementation service = new SandboxServiceImplementation(client);
        service.setAccountId(accountId);
        service.setApiKey(apiKey);

        

        MoneyTransferResponse mtresp = service.transferMoney(mtreq);
        if (mtresp != null) {
            System.out.println("Reading account balance: " + mtresp.getStatus());
        } else {
            return;
        }

        if ("OK".equals(mtresp.getStatus())) {
            //MoneyTransfer mt = mtresp.getPayload();
            //Output: Stato dell’operazione, il bonifco avrà esito KO per una limitazione del conto di prova.
        } else {
            mtresp.getErrors().forEach(error -> System.out.println(error.getCode() + " - " + error.getParams() + " - " + error.getDescription()));
        }

    }

    static Client getNewClient() {

        try {
            //to accept all certificates, comment/uncomment the appropriate lines in JerseyClientBuilder
            SSLContext sslcontext = SSLContext.getInstance("SSL");
            sslcontext.init(null, new TrustManager[]{new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }}, new java.security.SecureRandom());

            ClientConfig config = new ClientConfig();
            //config.property(ClientProperties.PROXY_URI, "addProxyHere");
            //config.property(ClientProperties.PROXY_USERNAME, "addProxyUserHere");
            //config.property(ClientProperties.PROXY_PASSWORD, "addProxyPasswordHere");
            config.connectorProvider(new ApacheConnectorProvider());

            Client client = JerseyClientBuilder.newBuilder()
                    .withConfig(config)
                    //.sslContext(sslcontext)
                    //.hostnameVerifier((s1, s2) -> true)
                    .build();
            return client;
        } catch (NoSuchAlgorithmException | KeyManagementException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

}
