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
public class MoneyTransfer {
    
    private String moneyTransferId;
    private String status;
    private String direction;
    private Creditor creditor;
    private Debtor debtor;
    private String cro;
    private String uri;
    private String trn;
    private String createdDatetime;
    private String accountedDatetime;
    private String debtorValueDate;
    private String creditorValueDate;
    private Amount amount;
    private boolean isUrgent;
    private boolean isInstant;
    private String feeType;
    private String feeAccountId;
    private List<Fee> fees;
    private TaxRelief taxRelief;

    /**
     * @return the moneyTransferId
     */
    public String getMoneyTransferId() {
        return moneyTransferId;
    }

    /**
     * @param moneyTransferId the moneyTransferId to set
     */
    public void setMoneyTransferId(String moneyTransferId) {
        this.moneyTransferId = moneyTransferId;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

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
     * @return the debtor
     */
    public Debtor getDebtor() {
        return debtor;
    }

    /**
     * @param debtor the debtor to set
     */
    public void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }

    /**
     * @return the cro
     */
    public String getCro() {
        return cro;
    }

    /**
     * @param cro the cro to set
     */
    public void setCro(String cro) {
        this.cro = cro;
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
     * @return the trn
     */
    public String getTrn() {
        return trn;
    }

    /**
     * @param trn the trn to set
     */
    public void setTrn(String trn) {
        this.trn = trn;
    }

    /**
     * @return the createdDatetime
     */
    public String getCreatedDatetime() {
        return createdDatetime;
    }

    /**
     * @param createdDatetime the createdDatetime to set
     */
    public void setCreatedDatetime(String createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    /**
     * @return the accountedDatetime
     */
    public String getAccountedDatetime() {
        return accountedDatetime;
    }

    /**
     * @param accountedDatetime the accountedDatetime to set
     */
    public void setAccountedDatetime(String accountedDatetime) {
        this.accountedDatetime = accountedDatetime;
    }

    /**
     * @return the debtorValueDate
     */
    public String getDebtorValueDate() {
        return debtorValueDate;
    }

    /**
     * @param debtorValueDate the debtorValueDate to set
     */
    public void setDebtorValueDate(String debtorValueDate) {
        this.debtorValueDate = debtorValueDate;
    }

    /**
     * @return the creditorValueDate
     */
    public String getCreditorValueDate() {
        return creditorValueDate;
    }

    /**
     * @param creditorValueDate the creditorValueDate to set
     */
    public void setCreditorValueDate(String creditorValueDate) {
        this.creditorValueDate = creditorValueDate;
    }

    /**
     * @return the amount
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Amount amount) {
        this.amount = amount;
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
     * @return the fees
     */
    public List<Fee> getFees() {
        return fees;
    }

    /**
     * @param fees the fees to set
     */
    public void setFees(List<Fee> fees) {
        this.fees = fees;
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
