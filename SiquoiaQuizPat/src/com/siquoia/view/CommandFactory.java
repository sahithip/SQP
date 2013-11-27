/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.view;

import com.siquoia.command.*;
import java.util.HashMap;

/**
 *
 * @author PC
 */
public class CommandFactory {
    private static CommandFactory instance;
    private HashMap<String, Command> commands;
    private HashMap<String, AjaxCommand> ajaxcommands;
    
    private CommandFactory(){
        commands = new HashMap<String, Command>();
        ajaxcommands = new HashMap<String, AjaxCommand>();
        setupCommands();
        setupAjaxCommands();
    }
    
    public static CommandFactory getInstance(){
        if(instance == null)
            instance = new CommandFactory();
        return instance;
    }
    
    private void setupCommands(){
        commands.put(null, new ConnectCommand("login.jsp"));
        commands.put("index", new TargetCommand("login.jsp"));
        commands.put("login", new LoginCommand("home.jsp"));
        commands.put("logout", new LogoutCommand("login.jsp"));
        commands.put("home", new TargetCommand("home.jsp"));
        commands.put("profile", new ProfileCommand("profile.jsp"));
    }
    
    private void setupAjaxCommands(){
        ajaxcommands.put("saveprofile", new SaveProfileAjaxCommand());
    }
    
    public Command findCommand(String name){
        return commands.get(name);
    }
    
    public AjaxCommand findAjaxCommand(String name) throws NullPointerException{
        AjaxCommand command = ajaxcommands.get(name);
        if(command == null)
            throw new NullPointerException();
        return command;
    }
    
}
