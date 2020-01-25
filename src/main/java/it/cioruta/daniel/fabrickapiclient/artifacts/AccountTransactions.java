/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cioruta.daniel.fabrickapiclient.artifacts;

import java.util.List;

/**
 *
 * @author Daniel C.
 */
public class AccountTransactions {
    private List<Transaction> list;

    /**
     * @return the list
     */
    public List<Transaction> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<Transaction> list) {
        this.list = list;
    }
    
}
