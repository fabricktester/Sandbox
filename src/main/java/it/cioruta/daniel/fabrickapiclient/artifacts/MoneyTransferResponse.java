/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cioruta.daniel.fabrickapiclient.artifacts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

/**
 *
 * @author Daniel C.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MoneyTransferResponse {
    private String status;
    private List<Error> errors;
    private MoneyTransfer payload;

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
     * @return the errors
     */
    public List<Error> getErrors() {
        return errors;
    }

    /**
     * @param errors the errors to set
     */
    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    /**
     * @return the payload
     */
    public MoneyTransfer getPayload() {
        return payload;
    }

    /**
     * @param payload the payload to set
     */
    public void setPayload(MoneyTransfer payload) {
        this.payload = payload;
    }
}