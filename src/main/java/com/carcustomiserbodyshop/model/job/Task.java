/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.model.job;

/**
 *
 * @author Personal
 */
public class Task {
    private String name;
    private boolean isComplete;
    
    public Task(String name){
        this.name = name;
        this.isComplete = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsComplete() {
        return isComplete;
    }

    public void setIsComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }
    
    
}
