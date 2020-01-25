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
public class Amount {

    private Double debtorAmount;
    private String debtorCurrency;
    private Double creditorAmount;
    private String creditorCurrency;
    private String creditorCurrencyDate;
    private Double exchangeRate;

    /**
     * @return the debtorAmount
     */
    public Double getDebtorAmount() {
        return debtorAmount;
    }

    /**
     * @param debtorAmount the debtorAmount to set
     */
    public void setDebtorAmount(Double debtorAmount) {
        this.debtorAmount = debtorAmount;
    }

    /**
     * @return the debtorCurrency
     */
    public String getDebtorCurrency() {
        return debtorCurrency;
    }

    /**
     * @param debtorCurrency the debtorCurrency to set
     */
    public void setDebtorCurrency(String debtorCurrency) {
        this.debtorCurrency = debtorCurrency;
    }

    /**
     * @return the creditorAmount
     */
    public Double getCreditorAmount() {
        return creditorAmount;
    }

    /**
     * @param creditorAmount the creditorAmount to set
     */
    public void setCreditorAmount(Double creditorAmount) {
        this.creditorAmount = creditorAmount;
    }

    /**
     * @return the creditorCurrency
     */
    public String getCreditorCurrency() {
        return creditorCurrency;
    }

    /**
     * @param creditorCurrency the creditorCurrency to set
     */
    public void setCreditorCurrency(String creditorCurrency) {
        this.creditorCurrency = creditorCurrency;
    }

    /**
     * @return the creditorCurrencyDate
     */
    public String getCreditorCurrencyDate() {
        return creditorCurrencyDate;
    }

    /**
     * @param creditorCurrencyDate the creditorCurrencyDate to set
     */
    public void setCreditorCurrencyDate(String creditorCurrencyDate) {
        this.creditorCurrencyDate = creditorCurrencyDate;
    }

    /**
     * @return the exchangeRate
     */
    public Double getExchangeRate() {
        return exchangeRate;
    }

    /**
     * @param exchangeRate the exchangeRate to set
     */
    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
