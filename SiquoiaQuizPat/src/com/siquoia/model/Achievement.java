/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siquoia.model;

/**
 *
 * @author PC
 */
public class Achievement {
    private long numberPlayedQuizzes;
    private long numberCorrectAnswers;
    private long statusLevel;
    private long rewardPoints;
    
    public Achievement(long numberPlayedQuizzes, long numberCorrectAnswers, long statusLevel, long rewardPoints){
        this.numberPlayedQuizzes = numberPlayedQuizzes;
        this.numberCorrectAnswers = numberCorrectAnswers;
        this.statusLevel = statusLevel;
        this.rewardPoints = rewardPoints;
    }
}
