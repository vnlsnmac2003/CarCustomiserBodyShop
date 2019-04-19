/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.model.Users;

/**
 *
 * @author Personal
 */
public class Receptionist extends Employee{
    
   public Receptionist(int id, String firstname, String lastname, String username, String password, String addressLine1, 
            String addressLine2, String city, String postCode, boolean isActive){
       this.id = id;
       this.firstName = firstname;
       this.lastName = lastname;
       this.username = username;
       this.password = password;
       this.addressLine1 = addressLine1;
       this.addressLine2 = addressLine2;
       this.city = city;
       this.postCode = postCode;
       this.position = AllUsers.RECEPTIONIST_POSITION;
       this.isActive = isActive;
   }
   
   public void createCustomer(){}

   
    
    
}
