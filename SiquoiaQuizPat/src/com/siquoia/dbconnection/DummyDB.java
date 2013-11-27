/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.dbconnection;

import com.siquoia.model.Player;
import com.siquoia.model.User;
import java.util.HashMap;

/**
 *
 * @author PC
 */
public class DummyDB {
    private HashMap<Long, User> users;
    private static DummyDB instance;
    
    public static DummyDB getInstance(){
        if(instance == null)
            instance = new DummyDB();
        return instance;
    }
    
    private DummyDB(){
        users = new HashMap<Long, User>();
        setup();
    }
    
    private void setup(){
        users.put(0L, new Player("player0", "password0", "player0@email.com", 0, "paying", "Patrick", "Grønbæch", "Christensen"));
        users.put(1L, new Player("player1", "password1", "player1@email.com", 0, "paying", "Shravan", null, "Papanaidu"));
        users.put(2L, new Player("player2", "password2", "player2@email.com", 0, "paying", "Sahithi", null,  "Patibandla"));
        users.put(3L, new Player("player3", "password3", "player3@email.com", 0, "paying", "Bhavi", null,  "Joshi"));
        users.put(4L, new Player("player4", "password4", "player4@email.com", 0, "paying", "David", null,  "Berino"));
        users.put(5L, new Player("player5", "password5", "player5@email.com", 0, "paying", "Gibran", null,  "Salami"));
    }
    
    public User getUser(long id){
        return users.get(id);
    }
    
    public User getUser(String userName){
        for(User user : users.values()){
            if(user.getUserName().equalsIgnoreCase(userName))
                return user;
        }
        return null;
    }
}
