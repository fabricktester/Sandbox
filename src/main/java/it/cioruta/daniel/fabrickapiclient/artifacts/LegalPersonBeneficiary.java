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
public class LegalPersonBeneficiary {
    
    private String fiscalCode;
    private String legalRepresentativeFiscalCode;

    /**
     * @return the fiscalCode
     */
    public String getFiscalCode() {
        return fiscalCode;
    }

    /**
     * @param fiscalCode the fiscalCode to set
     */
    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    /**
     * @return the legalRepresentativeFiscalCode
     */
    public String getLegalRepresentativeFiscalCode() {
        return legalRepresentativeFiscalCode;
    }

    /**
     * @param legalRepresentativeFiscalCode the legalRepresentativeFiscalCode to set
     */
    public void setLegalRepresentativeFiscalCode(String legalRepresentativeFiscalCode) {
        this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
    }
    
    
    
}
