/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.Controller;

import com.carcustomiserbodyshop.SQL.SqlUserFunctions;
import com.carcustomiserbodyshop.View.Admin.*;
import com.carcustomiserbodyshop.View.Container.*;
import com.carcustomiserbodyshop.View.Receptionist.*;
import com.carcustomiserbodyshop.View.User.*;
import com.carcustomiserbodyshop.model.Users.*;
import com.carcustomiserbodyshop.model.guiValidation.guiValidation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

/**
 *
 * @author Personal
 */
public class Controller{
    
    
    UserLoginScreen loginScreen;
    User currentUser;
    Container allViews;
    Admin admin;
    Receptionist receptionist;
    ValidationBox validationBox;
    
    public static void main(String[] args) {
        //User selectedUser = AllUsers.allUsers.get(1);
        String output = "";
        output += "Name: \t\t Virgil Nelson";//+selectedUser.getFirstName();
        System.out.println(output);
    }
    
    public Controller(ConcurrentHashMap users, Container allViews){
        this.validationBox = new ValidationBox();
        this.allViews = allViews;
        this.loginScreen = allViews.getUserLoginScreen();
        this.loginScreen.getLoginButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            currentUser = SqlUserFunctions.login(loginScreen.getUsernameTextField().getText().trim(), loginScreen.getPasswordTextField().getText().trim());
            if(currentUser != null){
                System.out.println("User  "+currentUser.getFirstName()+" "+currentUser.getLastName()+" has logged in successfully..");
                if(currentUser.getPosition().equalsIgnoreCase("admin")){
                    admin = (Admin) currentUser;
                    allViews.switchScreen("adminHomeScreen");
                    allViews.getAdminHomeScreen().setWelcomeLabelText(currentUser.getFirstName());
                    allViews.getAdminHomeScreen().setUpContainer(allViews.getFrame(), allViews.getMainPanel());
                }
                else if(currentUser.getPosition().equalsIgnoreCase("receptionist")){
                    receptionist = (Receptionist) currentUser;
                    allViews.switchScreen("receptionistHomeScreen");
                    allViews.getReceptionistHomeScreen().setWelcomeLabelText(receptionist.getFirstName());
                    allViews.getReceptionistHomeScreen().setUpContainer(allViews.getFrame(), allViews.getMainPanel());
                }
            }
            else{
                System.err.println("Incorrect Username and/or Password. Please re-enter a valid login.");
            }
           }
       });
        //----------------------------------ADMIN HOME SCREEN-------------------------------------//
        allViews.getAdminHomeScreen().getCreateEmpButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               allViews.switchScreen("adminCreateEmployeeScreen");
               for(String position: AllUsers.EMPLOYEE_POSITIONS)
                    allViews.getAdminCreateEmployeeScreen().getPositionComboBox().addItem(position);
               
               allViews.getAdminCreateEmployeeScreen().setUpContainer(allViews.getFrame(), allViews.getMainPanel());
           }
       });
        
        allViews.getAdminHomeScreen().getViewAmendEmpButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               AdminViewAmendScreen thisScreen =  allViews.getAdminViewAmendScreen();
               //SHOW AND POPULATE VIEW EMPLOYEE SCREEN
               allViews.switchScreen("adminViewAmendScreen");
               thisScreen.setUpContainer(allViews.getFrame(), allViews.getMainPanel());
               //ADD USERS TO DROPDOWN
               TreeMap<Integer,User> sortedUsers = new TreeMap<>();
               sortedUsers.putAll(AllUsers.allUsers);
               for(User user: sortedUsers.values()){
                   if(user instanceof Employee){
                        String userIdentity = user.getId()+": "+user.getFirstName()+" "+user.getLastName();
                        thisScreen.getEmployeeDropDownBox().addItem(userIdentity);
                   }
               }
               displayEmployeeData();
               setActivateDeactivateButtonText();
           }
       });
        
         allViews.getAdminHomeScreen().getLogoutButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               logout();
           }
       });
         
        //--------------------------------ADMIN VIEW AMEND EMPLOYEE SCREEN-------------------------------//
            allViews.getAdminViewAmendScreen().getBackButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               allViews.getAdminViewAmendScreen().clear();
               allViews.switchScreen("adminHomeScreen");
                allViews.getAdminHomeScreen().setUpContainer(allViews.getFrame(), allViews.getMainPanel());
           }
       });
        
        allViews.getAdminViewAmendScreen().getEmployeeDropDownBox().addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
                displayEmployeeData();
                setActivateDeactivateButtonText();
           }
        
        });
        
        allViews.getAdminViewAmendScreen().getActivateDeactivateButton().addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            //get the current selected user
            JComboBox combobox = allViews.getAdminViewAmendScreen().getEmployeeDropDownBox();
            if(combobox.getItemCount()>0){
               int selectedUserId = Integer.parseInt(combobox.getSelectedItem().toString().substring(0, 1));
               Employee selectedUser = (Employee) AllUsers.allUsers.get(selectedUserId);
                    if(selectedUser.isActive()){
                        SqlUserFunctions.updateTableWhere("isActive", "users", false, "id="+selectedUserId);
                        selectedUser.setIsActive(false);
                        allViews.getAdminViewAmendScreen().getActivateDeactivateButton().setText("Activate");
                                
                    }
                    else{
                        SqlUserFunctions.updateTableWhere("isActive", "users", true, "id="+selectedUserId);
                        selectedUser.setIsActive(true);
                        allViews.getAdminViewAmendScreen().getActivateDeactivateButton().setText("Deactivate");
                    }
                    SqlUserFunctions.updateUsers();
                    displayEmployeeData();
               }
       }
       });
            
        allViews.getAdminViewAmendScreen().getLogoutButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               allViews.getAdminViewAmendScreen().clear();
               logout();
           }
       });
       
        //-------------------------------ADMIN CREATE EMPLOYEE SCREEN----------------------------------//
        allViews.getAdminCreateEmployeeScreen().getBackButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               allViews.switchScreen("adminHomeScreen");
                allViews.getAdminHomeScreen().setUpContainer(allViews.getFrame(), allViews.getMainPanel());
           }
       });
        
        allViews.getAdminCreateEmployeeScreen().getCreateButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String error = "";
               boolean errorDetected = false;
               AdminCreateEmployeeScreen thisScreen = allViews.getAdminCreateEmployeeScreen();
               if(!(guiValidation.doPasswordsMatch(thisScreen.getPasswordTextField().getText(),thisScreen.getRetypePasswordTextField().getText()))){
                   //System.out.println("Passwords do not match. Please specify two matching passwords.");
                   errorDetected = true;
                   thisScreen.setErrorLabelText("Passwords do not match. Please specify two matching passwords.");
                   return;
                }
               if(guiValidation.isEmpty(thisScreen.getUsernameTextField().getText()) ||
                       guiValidation.isEmpty(thisScreen.getPasswordTextField().getText()) || 
                       guiValidation.isEmpty(thisScreen.getRetypePasswordTextField().getText())
                   || guiValidation.isEmpty(thisScreen.getPostcodeTextField().getText())
                       ||guiValidation.isEmpty(thisScreen.getAddressLine1TextField().getText())){
                   errorDetected = true;
                   thisScreen.setErrorLabelText("Empty mandatory field detected");
                   return;
                   
               }
               if(guiValidation.isEmptyOrContainsNumbers(thisScreen.getFirstnameTextField().getText()) ||
                       guiValidation.isEmptyOrContainsNumbers(thisScreen.getLastnameTextField().getText()) ||
                       guiValidation.isEmptyOrContainsNumbers(thisScreen.getCityTextField().getText()) ||
                       guiValidation.isEmptyOrContainsNumbers(thisScreen.getPositionComboBox().getSelectedItem().toString())){
                   thisScreen.setErrorLabelText("A field is empty or wrongfully contains numbers. Please check input.");
                   return;
               }
               try{
                admin.createEmployee(thisScreen.getFirstnameTextField().getText().trim(), thisScreen.getLastnameTextField().getText().trim(), 
                         thisScreen.getUsernameTextField().getText().trim(),thisScreen.getPasswordTextField().getText().trim(), 
                         thisScreen.getAddressLine1TextField().getText().trim(), thisScreen.getAddressLine2TextField().getText().trim(), 
                         thisScreen.getCityTextField().getText().trim(), thisScreen.getPostcodeTextField().getText().trim(), 
                         thisScreen.getPositionComboBox().getSelectedItem().toString());
               }
               catch(SQLException ex){
                   if(ex instanceof SQLIntegrityConstraintViolationException){
                      error = "Username already exists please enter another"; 
                   }else{
                      error = ex.getMessage(); 
                   }
                   ex.printStackTrace();
                   thisScreen.setErrorLabelText(error);
                   return;
               }
                thisScreen.clear();
                new ValidationBox().setUp("Employee Created!");
           }
       });
        
        allViews.getAdminCreateEmployeeScreen().getLogoutButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               logout();
           }
       });

    //-----------------------------------RECEPTIONIST HOME SCREEN------------------------------------//
    
    allViews.getReceptionistHomeScreen().getLogoutButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               logout();
           }
       });
    
    allViews.getReceptionistHomeScreen().getCreateCustomerButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                allViews.getReceptionistCreateCustomerScreen().setUpContainer(allViews.getFrame(), allViews.getMainPanel());
                allViews.switchScreen(Container.RECEPTIONIST_CREATE_CUSTOMER_SCREEN);
            }
        
    });
    
    allViews.getReceptionistHomeScreen().getViewAmendCustButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                allViews.getReceptionistCreateCustomerScreen().setUpContainer(allViews.getFrame(), allViews.getMainPanel());
                allViews.switchScreen();
            }
        
    });
    
    //-------------------------------------RECEPTIONIST CREATE CUSTOMER SCREEN --------------------------------//
    allViews.getReceptionistCreateCustomerScreen().getCreateButton().addActionListener(new ActionListener(){
            @Override
             public void actionPerformed(ActionEvent e) {
               String error = "";
               boolean errorDetected = false;
               ReceptionistCreateCustomerScreen thisScreen = allViews.getReceptionistCreateCustomerScreen();
               if(!(guiValidation.doPasswordsMatch(thisScreen.getPasswordTextField().getText(),thisScreen.getRetypePasswordTextField().getText()))){
                   errorDetected = true;
                   thisScreen.setErrorLabelText("Passwords do not match. Please specify two matching passwords.");
                   return;
                }
               if(guiValidation.isEmpty(thisScreen.getUsernameTextField().getText()) ||
                       guiValidation.isEmpty(thisScreen.getPasswordTextField().getText()) || 
                       guiValidation.isEmpty(thisScreen.getRetypePasswordTextField().getText())
                   || guiValidation.isEmpty(thisScreen.getPostcodeTextField().getText())
                       ||guiValidation.isEmpty(thisScreen.getAddressLine1TextField().getText())){
                   errorDetected = true;
                   thisScreen.setErrorLabelText("Empty mandatory field detected");
                   return;
                   
               }
               if(guiValidation.isEmptyOrContainsNumbers(thisScreen.getFirstnameTextField().getText()) ||
                       guiValidation.isEmptyOrContainsNumbers(thisScreen.getLastnameTextField().getText()) ||
                       guiValidation.isEmptyOrContainsNumbers(thisScreen.getCityTextField().getText())){
                   thisScreen.setErrorLabelText("A field is empty or wrongfully contains numbers. Please check input.");
                   return;
               }
               try{
                receptionist.createCustomer(thisScreen.getFirstnameTextField().getText().trim(), thisScreen.getLastnameTextField().getText().trim(), 
                         thisScreen.getUsernameTextField().getText().trim(),thisScreen.getPasswordTextField().getText().trim(), 
                         thisScreen.getAddressLine1TextField().getText().trim(), thisScreen.getAddressLine2TextField().getText().trim(), 
                         thisScreen.getCityTextField().getText().trim(), thisScreen.getPostcodeTextField().getText().trim());
               }
               catch(SQLException ex){
                   if(ex instanceof SQLIntegrityConstraintViolationException){
                      error = "Username already exists please enter another"; 
                   }else{
                      error = ex.getMessage(); 
                   }
                   ex.printStackTrace();
                   thisScreen.setErrorLabelText(error);
                   return;
               }
                thisScreen.clear();
                new ValidationBox().setUp("Customer Created!");
           }
       });
    
    allViews.getReceptionistCreateCustomerScreen().getBackButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               allViews.switchScreen(Container.RECEPTIONIST_HOME_SCREEN);
           }
       });
    
    allViews.getReceptionistCreateCustomerScreen().getLogoutButton().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               logout();
           }
       });
    
    }
    
    
    public void setActivateDeactivateButtonText(){
        JComboBox empDropdown = allViews.getAdminViewAmendScreen().getEmployeeDropDownBox();
            Employee selectedUser;
            if(empDropdown.getItemCount()>0){
                 int selectedUserId = Integer.parseInt(empDropdown.getSelectedItem().toString().substring(0, 1));
                 selectedUser = (Employee) AllUsers.allUsers.get(selectedUserId);
                 if(selectedUser.isActive()){
                     allViews.getAdminViewAmendScreen().getActivateDeactivateButton().setText("Deactivate");
                 }
                 else{
                     allViews.getAdminViewAmendScreen().getActivateDeactivateButton().setText("Activate");
                 }
                 
            }
    }
    
    public void displayEmployeeData(){
            //DISPLAY SELECTED USERS INFORMATION
            String output = "";
            JComboBox combobox = allViews.getAdminViewAmendScreen().getEmployeeDropDownBox();
            JTextArea textArea = allViews.getAdminViewAmendScreen().getTextArea();
            if(combobox.getItemCount()>0){
               int selectedUserId = Integer.parseInt(combobox.getSelectedItem().toString().substring(0, 1));
               Employee selectedUser = (Employee) AllUsers.allUsers.get(selectedUserId);
               output += "\n\n\n     Name: \t"+selectedUser.getFirstName()+" "+selectedUser.getLastName();
               output += "\n     Address: \t"+ selectedUser.getAddressLine1()+",";
               if((selectedUser.getAddressLine2() != null)){
                   if (!(selectedUser.getAddressLine2().isEmpty())){
                   output += selectedUser.getAddressLine2()+",";
                    }
               }
               output += selectedUser.getCity()+", "+ selectedUser.getPostCode();
               output += "\n     Position: \t"+selectedUser.getPosition();
               output += "\n     Active: \t";
               if(selectedUser.isActive()){
                   output += "YES";
               }
               else{
                   output += "NO";
               }
               textArea.setText(output);
            }
        }
    
   public void logout(){
        allViews.switchScreen("userLoginScreen");
        allViews.getUserLoginScreen().setUpContainer(allViews.getFrame(), allViews.getMainPanel());
   }
   public class Listener implements ActionListener{

       public Listener(){}
       
        @Override
        public void actionPerformed(ActionEvent e) {
            
            //if(currentUser != null)
            //    loginScreen.dispose();
        }
       
   }
    
}
