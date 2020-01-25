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

/**
 *
 * @author Daniel C.
 */
public interface SandboxService {
    
    public static final String BASEURL = "https://sandbox.platfr.io";
    
    
    public AccountBalanceResponse readAccountBalance();
    
    public AccountTransactionsResponse readAccountTransactions(String fromDate, String toDate);
    
    public MoneyTransferResponse transferMoney(MoneyTransferRequest mtr);
    
}
