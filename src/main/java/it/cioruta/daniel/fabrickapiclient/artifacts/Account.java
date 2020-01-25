/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cioruta.daniel.fabrickapiclient.artifacts;

/**
 *
 * @author Daniel C.
 */

public class Account {
    
    private String accountCode;
    private String bicCode;

    /**
     * @return the accountCode
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * @param accountCode the accountCode to set
     */
    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    /**
     * @return the bicCode
     */
    public String getBicCode() {
        return bicCode;
    }

    /**
     * @param bicCode the bicCode to set
     */
    public void setBicCode(String bicCode) {
        this.bicCode = bicCode;
    }
    
}
