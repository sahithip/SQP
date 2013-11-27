/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.exception;

/**
 *
 * @author PC
 */
public class NotFoundException extends Exception{

    private long id;

    public NotFoundException(long id, String string) {
        super(string);
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
