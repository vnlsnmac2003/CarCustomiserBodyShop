/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.model.Users;

import com.carcustomiserbodyshop.SQL.SqlUserFunctions;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author Personal
 */
public abstract class User {
    
    protected int id;
    protected String username;
    protected String password;
    protected String firstName;
    protected String lastName;
    protected boolean isActive;
    protected String position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }
    
    
    public void deactivate(){
       if(this.isActive)
            this.isActive = false;
    }
    
    public void activate(){
        if(!this.isActive)
            this.isActive = true;
    }
    
}
