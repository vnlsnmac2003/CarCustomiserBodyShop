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
public class Admin extends User{

    public Admin(int id, String username, String password, String firstname, String lastname) {
        
        this.id = id;
        this.username = username;
        this.password = password;
        this.firstName = firstname;
        this.lastName = lastname;
        this.position = AllUsers.ADMIN_POSITION;
        this.isActive = true;
    }
    
    
    
    @Override
    public void deactivate(){}

    public int createEmployee(String firstname, String lastname, String username, String password, String addressLine1, 
            String addressLine2, String city, String postcode, String position) throws SQLException{
            int rowCountAfterInsert = 0;
            String insertQuery = "INSERT INTO users (firstname, lastname, username, password, addressLine1, addressLine2,city,"
                    + "postcode,position, isActive) VALUES ('"+firstname+"','"+lastname+"','"+username+"','"+password+"','"
                    +addressLine1+"','"+addressLine2+"','"+city+"','"+postcode+"','"+position+"',"+1+")";
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
    
    public void enableEmployee(int id){
        Connection db = SqlUserFunctions.getDB();
        Employee employee = (Employee) AllUsers.allUsers.get(id); 
        if(!(employee.isActive())){
            try{
                String update = "Update users SET isActive = 1 where id ="+id;
                Statement statement = db.createStatement();
                statement.executeUpdate(update);
                employee.setIsActive(true);
            }
            catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
    
    public void disableEmployee(int id){
        Connection db = SqlUserFunctions.getDB();
        Employee employee = (Employee) AllUsers.allUsers.get(id); 
        if(employee.isActive()){
            try{
                String update = "Update users SET isActive = 0 where id ="+id;
                Statement statement = db.createStatement();
                statement.executeUpdate(update);
                employee.setIsActive(false);
            }
            catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}
