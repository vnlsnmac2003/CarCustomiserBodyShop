/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.model.Users;

import com.carcustomiserbodyshop.model.job.Job;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * @author Personal
 */
public class Customer extends User{
    
    protected String addressLine1;
    protected String addressLine2;
    protected String city;
    protected String postCode;

    /**
     *
     */
    protected ConcurrentHashMap<Integer, Job> jobs;
    
    public Customer(int id, String firstname, String lastname, String username, String password, String addressLine1, String addressLine2, String city, 
            String postCode, ConcurrentHashMap<Integer, Job> jobs, boolean isActive){
        this.id = id;
        this.firstName = firstname;
        this.lastName = lastname;
        this.username = username;
        this.password = password;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.postCode = postCode;
        this.jobs = jobs;
        this.position = AllUsers.CUSTOMER_POSITION;
        this.isActive = isActive;
    }
   
    public void payForJob(int jobId){
        try{
            this.jobs.get(jobId).setPaidFor(true);
        }
        catch(NullPointerException n){
            System.err.println("This customer is not associated with this job.");
                    
        }
    }
    
}
