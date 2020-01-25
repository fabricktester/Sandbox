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
public class TaxRelief {
    
    private String taxReliefId;
    private boolean isCondoUpgrade;
    private String creditorFiscalCode;
    private String beneficiaryType;
    private NaturalPersonBeneficiary naturalPersonBeneficiary;
    private LegalPersonBeneficiary legalPersonBeneficiary;

    /**
     * @return the taxReliefId
     */
    public String getTaxReliefId() {
        return taxReliefId;
    }

    /**
     * @param taxReliefId the taxReliefId to set
     */
    public void setTaxReliefId(String taxReliefId) {
        this.taxReliefId = taxReliefId;
    }

    /**
     * @return the isCondoUpgrade
     */
    public boolean isIsCondoUpgrade() {
        return isCondoUpgrade;
    }

    /**
     * @param isCondoUpgrade the isCondoUpgrade to set
     */
    public void setIsCondoUpgrade(boolean isCondoUpgrade) {
        this.isCondoUpgrade = isCondoUpgrade;
    }

    /**
     * @return the creditorFiscalCode
     */
    public String getCreditorFiscalCode() {
        return creditorFiscalCode;
    }

    /**
     * @param creditorFiscalCode the creditorFiscalCode to set
     */
    public void setCreditorFiscalCode(String creditorFiscalCode) {
        this.creditorFiscalCode = creditorFiscalCode;
    }

    /**
     * @return the beneficiaryType
     */
    public String getBeneficiaryType() {
        return beneficiaryType;
    }

    /**
     * @param beneficiaryType the beneficiaryType to set
     */
    public void setBeneficiaryType(String beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }

    /**
     * @return the naturalPersonBeneficiary
     */
    public NaturalPersonBeneficiary getNaturalPersonBeneficiary() {
        return naturalPersonBeneficiary;
    }

    /**
     * @param naturalPersonBeneficiary the naturalPersonBeneficiary to set
     */
    public void setNaturalPersonBeneficiary(NaturalPersonBeneficiary naturalPersonBeneficiary) {
        this.naturalPersonBeneficiary = naturalPersonBeneficiary;
    }

    /**
     * @return the legalPersonBeneficiary
     */
    public LegalPersonBeneficiary getLegalPersonBeneficiary() {
        return legalPersonBeneficiary;
    }

    /**
     * @param legalPersonBeneficiary the legalPersonBeneficiary to set
     */
    public void setLegalPersonBeneficiary(LegalPersonBeneficiary legalPersonBeneficiary) {
        this.legalPersonBeneficiary = legalPersonBeneficiary;
    }
    
}
