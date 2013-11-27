package com.siquoia.exception;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class CommandException extends Exception{
    private String errorTarget;

    public CommandException(String errorTarget, String message, Throwable cause){
      super(message, cause);
      this.errorTarget = errorTarget;
    }
    
    public CommandException(String errorTarget){
        this.errorTarget = errorTarget;
    }
    
    public CommandException(){
    }

    public String getErrorTarget(){
      return errorTarget;
    }
    
}
