/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.model;

/**
 *
 * @author PC
 */
public class Payment {
    private String paymentType;
    private long itemId;
    
    public Payment(String paymentType, long itemId){
        this.paymentType = paymentType;
        this.itemId = itemId;
    }
}
