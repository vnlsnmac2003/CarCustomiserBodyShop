/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.SQL;
import com.carcustomiserbodyshop.model.Users.Admin;
import com.carcustomiserbodyshop.model.Users.AllUsers;
import com.carcustomiserbodyshop.model.Users.Employee;
import com.carcustomiserbodyshop.model.Users.Receptionist;
import com.carcustomiserbodyshop.model.Users.User;
import com.carcustomiserbodyshop.model.Users.VinylWrapper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.ConcurrentHashMap;
/**
 *
 * @author Personal
 */
public class SqlUserFunctions {
    
    public static Connection con = null;

    public SqlUserFunctions() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/car_customizer", "root", "Reloman1");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void setDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/car_customizer", "root", "Reloman1");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    public static Connection getDB(){
        return con;
        
    }
    
    public static ResultSet selectFromTable(String field, String table){
        ResultSet results = null;
        try {
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery("SELECT "+field+" FROM "+table);
            results = result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return results;
    }
    
    public static ResultSet selectFromTableWhere(String field, String table, String whereCondition){
         ResultSet results = null;
        try {
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery("SELECT "+field+" FROM "+table+" WHERE "+whereCondition);
            results = result;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return results;
    }
    
    public static void updateTableWhere(String field, String table, boolean value, String whereCondition){
        try {
            Statement statement = con.createStatement();
            statement.executeUpdate("Update "+table+" SET "+field+"="+value+" WHERE "+whereCondition);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void loadUsersFromDB(){
        Connection db = getDB();
        ResultSet result = selectFromTable("*", "users");
        try {
            while(result.next()){
                boolean isActive = result.getString("isActive").equals("0") ? false : true;
                if(result.getString("position").equals(AllUsers.RECEPTIONIST_POSITION)){
                    System.out.println(result.getString("firstname")+"isActive: "+result.getString("isActive"));
                    System.out.println("Found Receptionist: "+result.getInt("id"));
                    Receptionist r = new Receptionist(result.getInt("id"), result.getString("firstname"), result.getString("lastname"), 
                            result.getString("username"), result.getString("password"), result.getString("addressLine1"), 
                            result.getString("addressLine2"), result.getString("city"), result.getString("postcode"),
                            isActive);
                    AllUsers.allUsers.put(result.getInt("id"), r);
                }
                else if(result.getString("position").equals(AllUsers.VINYL_WRAPPER_POSITION)){
                    System.out.println(result.getString("firstname")+"isActive: "+result.getString("isActive"));
                    System.out.println("Found Vinyl Wrapper: "+result.getInt("id"));
                    VinylWrapper v = new VinylWrapper(result.getInt("id"), result.getString("firstname"), result.getString("lastname"), 
                            result.getString("username"), result.getString("password"), result.getString("addressLine1"), 
                            result.getString("addressLine2"), result.getString("city"), result.getString("postcode"), 
                            isActive);
                    AllUsers.allUsers.put(result.getInt("id"), v);
                }
                else if(result.getString("position").equals(AllUsers.ADMIN_POSITION)){
                    System.out.println("Found Admin: "+result.getInt("id"));
                    Admin a = new Admin(result.getInt("id"), result.getString("username"), result.getString("password"),
                            result.getString("firstname"), result.getString("lastname"));
                    AllUsers.allUsers.put(result.getInt("id"), a);
                }
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void updateUsers(){
        Connection db = getDB();
        ResultSet result = selectFromTable("*", "users");
        ConcurrentHashMap<Integer,User> newUsers = new ConcurrentHashMap<>();
        try {
            while(result.next()){
                boolean isActive = result.getString("isActive").equals("0") ? false : true;
                if(result.getString("position").equals(AllUsers.RECEPTIONIST_POSITION)){
                    System.out.println("Found Receptionist: "+result.getInt("id"));
                    Receptionist r = new Receptionist(result.getInt("id"), result.getString("firstname"), result.getString("lastname"), 
                            result.getString("username"), result.getString("password"), result.getString("addressLine1"), 
                            result.getString("addressLine2"), result.getString("city"), result.getString("postcode"),
                            isActive);
                    newUsers.put(result.getInt("id"), r);
                }
                else if(result.getString("position").equals(AllUsers.VINYL_WRAPPER_POSITION)){
                    System.out.println("Found Vinyl Wrapper: "+result.getInt("id"));
                    VinylWrapper v = new VinylWrapper(result.getInt("id"), result.getString("firstname"), result.getString("lastname"), 
                            result.getString("username"), result.getString("password"), result.getString("addressLine1"), 
                            result.getString("addressLine2"), result.getString("city"), result.getString("postcode"),
                            isActive);
                    newUsers.put(result.getInt("id"), v);
                }
                else if(result.getString("position").equals(AllUsers.ADMIN_POSITION)){
                    System.out.println("Found Admin: "+result.getInt("id"));
                    Admin a = new Admin(result.getInt("id"), result.getString("username"), result.getString("password"),
                            result.getString("firstname"), result.getString("lastname"));
                    newUsers.put(result.getInt("id"), a);
                }
            }
            AllUsers.setAllUsers(newUsers);
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public static User login(String username, String password){
        User currentUser = null;
        for(User user : AllUsers.allUsers.values()){
            if(user.getUsername().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password)){
                currentUser = user;
            }
        }
        /*
        Connection db = SqlUserFunctions.getDB();
        int id = 0;
        try {
            Statement statement = db.createStatement();
            ResultSet result = statement.executeQuery("SELECT id FROM users WHERE username = '"+username+"' AND password = '"+password+"'");
            while(result.next()){
                if(result.getInt("id") != 0){
                    id = result.getInt("id");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return id;  
        */
        return currentUser;
    }
        
    //public static getStringFieldValuesFromResultSet(ResultSet results, String field){ }
         
    //public static getStringFieldValuesFromResultSet(ResultSet results, String field){ }
 
    public static void main (String args[]) {
            
            SqlUserFunctions.loadUsersFromDB();
            System.out.println("Number of Employees: "+ AllUsers.allUsers.size());
    }
}
