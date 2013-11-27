/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.model;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Category extends QuizComponent{
    private String name;
    private ArrayList<QuizComponent> components;
    
    public Category(){
        components = new ArrayList<QuizComponent>();
        
    }
}
