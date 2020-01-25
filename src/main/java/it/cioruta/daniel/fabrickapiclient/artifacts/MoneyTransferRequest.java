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
public class MoneyTransferRequest {
    
    private Creditor creditor;
    private String executionDate;
    private String uri;
    private String description;
    private Double amount;
    private String currency;
    private boolean isUrgent;
    private boolean isInstant;
    private String feeType;
    private String feeAccountId;
    private TaxRelief taxRelief;

    /**
     * @return the creditor
     */
    public Creditor getCreditor() {
        return creditor;
    }

    /**
     * @param creditor the creditor to set
     */
    public void setCreditor(Creditor creditor) {
        this.creditor = creditor;
    }

    /**
     * @return the executionDate
     */
    public String getExecutionDate() {
        return executionDate;
    }

    /**
     * @param executionDate the executionDate to set
     */
    public void setExecutionDate(String executionDate) {
        this.executionDate = executionDate;
    }

    /**
     * @return the uri
     */
    public String getUri() {
        return uri;
    }

    /**
     * @param uri the uri to set
     */
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the amount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * @return the isUrgent
     */
    public boolean isIsUrgent() {
        return isUrgent;
    }

    /**
     * @param isUrgent the isUrgent to set
     */
    public void setIsUrgent(boolean isUrgent) {
        this.isUrgent = isUrgent;
    }

    /**
     * @return the isInstant
     */
    public boolean isIsInstant() {
        return isInstant;
    }

    /**
     * @param isInstant the isInstant to set
     */
    public void setIsInstant(boolean isInstant) {
        this.isInstant = isInstant;
    }

    /**
     * @return the feeType
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * @param feeType the feeType to set
     */
    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    /**
     * @return the feeAccountId
     */
    public String getFeeAccountId() {
        return feeAccountId;
    }

    /**
     * @param feeAccountId the feeAccountId to set
     */
    public void setFeeAccountId(String feeAccountId) {
        this.feeAccountId = feeAccountId;
    }

    /**
     * @return the taxRelief
     */
    public TaxRelief getTaxRelief() {
        return taxRelief;
    }

    /**
     * @param taxRelief the taxRelief to set
     */
    public void setTaxRelief(TaxRelief taxRelief) {
        this.taxRelief = taxRelief;
    }
    
}
