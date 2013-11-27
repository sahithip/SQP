/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.command;

import com.siquoia.exception.CommandException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author PC
 */
public interface Command {
    
    public String execute(HttpServletRequest req) throws CommandException;
}
