/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cioruta.daniel.fabrickapiclient.core;

import it.cioruta.daniel.fabrickapiclient.artifacts.AccountBalanceResponse;
import it.cioruta.daniel.fabrickapiclient.artifacts.AccountTransactionsResponse;
import it.cioruta.daniel.fabrickapiclient.artifacts.MoneyTransferRequest;
import it.cioruta.daniel.fabrickapiclient.artifacts.MoneyTransferResponse;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedHashMap;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

/**
 *
 * @author Daniel C.
 */
public class SandboxServiceImplementation implements SandboxService {

    private static final boolean DEBUG = false;

    private String apiKey;
    private String accountId;
    private Client client;

    public SandboxServiceImplementation() {

    }

    public SandboxServiceImplementation(Client client) {
        this.setClient(client);
    }

    @Override
    public AccountBalanceResponse readAccountBalance() {
        StringBuilder endPoint = new StringBuilder();
        endPoint.append(BASEURL)
                .append("/api/gbs/banking/v4.0/accounts/")
                .append(getAccountId())
                .append("/balance");

        WebTarget wt = getClient().target(endPoint.toString());

        Response response = wt.request()
                .accept(MediaType.APPLICATION_JSON)
                .headers(this.getDefaultHttpHeaders())
                .get();
        int responseCode = response.getStatus();
        if (responseCode != 200) {
            System.out.println("WARNING: HTTP " + responseCode);
            System.out.println("URL: " + wt.getUri());
        }

        if (!DEBUG) {
            return response.readEntity(AccountBalanceResponse.class);
        } else {
            System.out.println("URL: " + wt.getUri());
            System.out.println("Response status code: " + responseCode);
            System.out.println("-------------- RESPONSE HEADERS --------------");
            response.getHeaders().forEach((key, value) -> System.out.println(key + " - " + value));
            String resp = response.readEntity(String.class);
            System.out.println("--------------  RESPONSE  BODY  --------------");
            System.out.println(resp);
        }
        return null;
    }

    @Override
    public AccountTransactionsResponse readAccountTransactions(String fromDate, String toDate) {
        StringBuilder endPoint = new StringBuilder();
        endPoint.append(BASEURL)
                .append("/api/gbs/banking/v4.0/accounts/")
                .append(getAccountId())
                .append("/transactions");

        WebTarget wt = getClient()
                .target(endPoint.toString())
                .queryParam("fromAccountingDate", fromDate)
                .queryParam("toAccountingDate", toDate);

        Response response = wt.request()
                .accept(MediaType.APPLICATION_JSON)
                .headers(this.getDefaultHttpHeaders())
                .get();
        int responseCode = response.getStatus();
        if (responseCode != 200) {
            System.out.println("WARNING: HTTP " + responseCode);
            System.out.println("URL: " + wt.getUri());
        }

        if (!DEBUG) {
            return response.readEntity(AccountTransactionsResponse.class);
        } else {
            System.out.println("URL: " + wt.getUri());
            System.out.println("Response status code: " + responseCode);
            System.out.println("-------------- RESPONSE HEADERS --------------");
            response.getHeaders().forEach((key, value) -> System.out.println(key + " - " + value));
            String resp = response.readEntity(String.class);
            System.out.println("--------------  RESPONSE  BODY  --------------");
            System.out.println(resp);
        }
        return null;
    }

    @Override
    public MoneyTransferResponse transferMoney(MoneyTransferRequest mtr) {
        StringBuilder endPoint = new StringBuilder();
        endPoint.append(BASEURL)
                .append("/api/gbs/banking/v4.0/accounts/")
                .append(getAccountId())
                .append("/payments/money-transfers");

        WebTarget wt = getClient()
                .target(endPoint.toString());

        Response response = wt.request()
                .accept(MediaType.APPLICATION_JSON)
                .headers(this.getDefaultHttpHeaders())
                .post(Entity.entity(mtr, MediaType.APPLICATION_JSON));

        int responseCode = response.getStatus();
        if (responseCode != 200) {
            System.out.println("WARNING: HTTP " + responseCode);
            System.out.println("URL: " + wt.getUri());
        }

        if (!DEBUG) {
            return response.readEntity(MoneyTransferResponse.class);
        } else {
            System.out.println("URL: " + wt.getUri());
            System.out.println("Response status code: " + responseCode);
            System.out.println("-------------- RESPONSE HEADERS --------------");
            response.getHeaders().forEach((key, value) -> System.out.println(key + " - " + value));
            String resp = response.readEntity(String.class);
            System.out.println("--------------  RESPONSE  BODY  --------------");
            System.out.println(resp);
        }
        return null;
    }

    private MultivaluedMap<String, Object> getDefaultHttpHeaders() {
        MultivaluedMap<String, Object> httpHeaders = new MultivaluedHashMap();
        httpHeaders.add("Auth-Schema", "S2S");
        httpHeaders.add("Api-Key", getApiKey());
        httpHeaders.add("X-Time-Zone", "Europe/Rome");
        return httpHeaders;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the apiKey
     */
    public String getApiKey() {
        return apiKey;
    }

    /**
     * @param apiKey the apiKey to set
     */
    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * @return the accountId
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * @param accountId the accountId to set
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

}
