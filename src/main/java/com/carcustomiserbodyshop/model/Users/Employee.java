/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.model.Users;

import com.carcustomiserbodyshop.SQL.SqlUserFunctions;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Personal
 */
public abstract class Employee extends User{
    
    protected String addressLine1;
    protected String addressLine2;
    protected String city;
    protected String postCode;

    
    public int createCustomer(String firstname, String lastname, String username, String password, String addressLine1, 
            String addressLine2, String city, String postcode) throws SQLException{
            int rowCountAfterInsert = 0;
            String insertQuery = "INSERT INTO users (firstname, lastname, username, password, addressLine1, addressLine2,city,"
                    + "postcode,position, isActive) VALUES ('"+firstname+"','"+lastname+"','"+username+"','"+password+"','"
                    +addressLine1+"','"+addressLine2+"','"+city+"','"+postcode+"','Customer',"+1+")";
            try{
                Connection db = SqlUserFunctions.getDB();
                Statement statement = db.createStatement();
                rowCountAfterInsert = statement.executeUpdate(insertQuery);
                System.out.println("Row count after insert: "+ rowCountAfterInsert);
                SqlUserFunctions.updateUsers();
            }
            catch(SQLException ex){
                throw ex;
            }
        return rowCountAfterInsert;
    }
    
    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
}
