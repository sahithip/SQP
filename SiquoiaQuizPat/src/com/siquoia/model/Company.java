/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.model;

/**
 *
 * @author PC
 */
public class Company extends User{
    private String companyName;
    
    public Company(String companyName, String userName, String password, String email, long userId){
        super(userName, password, email, userId);
        this.companyName = companyName;
    }
}
