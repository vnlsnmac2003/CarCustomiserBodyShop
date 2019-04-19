/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.model.Users;

import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Personal
 */
public abstract class AllUsers {
    
    public static final String[] ALL_POSITIONS = {"Receptionist","Vinyl Wrapper", "Admin", "Customer"};
    public static final String[] EMPLOYEE_POSITIONS = {"Receptionist","Vinyl Wrapper"};
    public static final String RECEPTIONIST_POSITION = "Receptionist";
    public static final String VINYL_WRAPPER_POSITION = "Vinyl Wrapper";
    public static final String ADMIN_POSITION = "Admin";
    public static final String CUSTOMER_POSITION = "Customer";
    public static ConcurrentHashMap<Integer,User> allUsers = new ConcurrentHashMap<>();
    
    public static void addUser(int id, String firstname, String lastname, String username, String password, String addressLine1,
    String addressLine2, String city, String postcode, String position, boolean isActive){
        if(position.equals(AllUsers.RECEPTIONIST_POSITION)){
            Receptionist r = new Receptionist(id, firstname, lastname, username, password, addressLine1,
            addressLine2, city, postcode, isActive);
            allUsers.put(id, r);
        }
        else if(position.equals(AllUsers.VINYL_WRAPPER_POSITION)){
            VinylWrapper v = new VinylWrapper(id, firstname, lastname, username, password, addressLine1, 
            addressLine2, city, postcode, isActive);
            allUsers.put(id, v);
        }
        else if(position.equals(AllUsers.ADMIN_POSITION)){
            Admin a = new Admin(id, username, password, firstname, lastname);
            allUsers.put(id, a);
        }
    }
    
    public static void setAllUsers(ConcurrentHashMap<Integer,User> newUsers){
        allUsers = newUsers;
    }
}
