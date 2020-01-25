/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cioruta.daniel.fabrickapiclient.artifacts;

import javax.persistence.Embeddable;

/**
 *
 * @author Daniel C.
 */
@Embeddable
public class TransactionType {
    
    private String enumeration;
    private String value;

    /**
     * @return the enumeration
     */
    public String getEnumeration() {
        return enumeration;
    }

    /**
     * @param enumeration the enumeration to set
     */
    public void setEnumeration(String enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
    
}
