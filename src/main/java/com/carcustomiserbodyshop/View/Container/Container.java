/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.Container;

import javax.swing.JFrame;
import com.carcustomiserbodyshop.View.Admin.*;
import com.carcustomiserbodyshop.View.Receptionist.*;
import com.carcustomiserbodyshop.View.User.UserLoginScreen;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author Personal
 */
public class Container{
    CardLayout cLayout;
    JPanel mainPanel;
    JFrame frame;
    UserLoginScreen userLoginScreen;
    AdminHomeScreen adminHomeScreen;
    AdminViewAmendScreen adminViewAmendScreen;
    AdminCreateEmployeeScreen adminCreateEmployeeScreen;
    ReceptionistHomeScreen receptionistHomeScreen;
    ReceptionistCreateCustomerScreen receptionistCreateCustomerScreen;
    ReceptionistEditJobScreen receptionistEditJobScreen;
    ReceptionistManageCustJobsScreen receptionistManageCustJobsScreen;
    
    public static final String USER_LOGIN_SCREEN = "userLoginScreen";
    public static final String RECEPTIONIST_HOME_SCREEN = "receptionistHomeScreen";
    public static final String RECEPTIONIST_CREATE_CUSTOMER_SCREEN = "receptionistCreateCustomerScreen";
    public static final String ADMIN_HOME_SCREEN = "adminHomeScreen";
    public static final String ADMIN_CREATE_EMPLOYEE_SCREEN = "adminCreateEmployeeScreen";
    public static final String ADMIN_VIEW_AMEND_SCREEN = "adminViewAmendScreen";
    public static final String RECEPTIONIST_EDIT_JOB_SCREEN = "receptionistEditJobScreen";
    public static final String RECEPTIONIST_MANAGE_CUST_JOBS_SCREEN = "receptionistManageCustJobsScreen";
            
    public Container(){
        frame = new JFrame();
        cLayout = new CardLayout();
        mainPanel = new JPanel();
        mainPanel.setLayout(cLayout);
        
        userLoginScreen = new UserLoginScreen();
        adminHomeScreen = new AdminHomeScreen();
        adminViewAmendScreen = new AdminViewAmendScreen();
        adminCreateEmployeeScreen = new AdminCreateEmployeeScreen();
        receptionistHomeScreen = new ReceptionistHomeScreen();
        receptionistCreateCustomerScreen = new ReceptionistCreateCustomerScreen();
        receptionistEditJobScreen = new ReceptionistEditJobScreen();
        receptionistManageCustJobsScreen = new ReceptionistManageCustJobsScreen();
        
        mainPanel.add(userLoginScreen.getPanel(),USER_LOGIN_SCREEN);
        //---------------------------ADMIN SCREENS------------------------------/
        mainPanel.add(adminHomeScreen.getPanel(),ADMIN_HOME_SCREEN);
        mainPanel.add(adminCreateEmployeeScreen.getPanel(), ADMIN_CREATE_EMPLOYEE_SCREEN);
        mainPanel.add(adminViewAmendScreen.getPanel(), ADMIN_VIEW_AMEND_SCREEN);
        
        //-----------------------------RECEPTIONIST SCREENS---------------------/
        mainPanel.add(receptionistHomeScreen.getPanel(), RECEPTIONIST_HOME_SCREEN);
        mainPanel.add(receptionistCreateCustomerScreen.getPanel(), RECEPTIONIST_CREATE_CUSTOMER_SCREEN);
        mainPanel.add(receptionistEditJobScreen.getPanel(), RECEPTIONIST_EDIT_JOB_SCREEN);
        mainPanel.add(receptionistManageCustJobsScreen.getPanel(), RECEPTIONIST_MANAGE_CUST_JOBS_SCREEN);
        
        cLayout.show(mainPanel, USER_LOGIN_SCREEN);
        userLoginScreen.setUpContainer(frame, mainPanel);
    }

    public ReceptionistHomeScreen getReceptionistHomeScreen() {
        return receptionistHomeScreen;
    }

    public ReceptionistCreateCustomerScreen getReceptionistCreateCustomerScreen() {
        return receptionistCreateCustomerScreen;
    }

    public ReceptionistEditJobScreen getReceptionistEditJobScreen() {
        return receptionistEditJobScreen;
    }

    public ReceptionistManageCustJobsScreen getReceptionistManageCustJobsScreen() {
        return receptionistManageCustJobsScreen;
    }
    
    public void switchScreen(String screenName){
        this.cLayout.show(mainPanel, screenName);
    }
    public JFrame getFrame() {
        return frame;
    }

    public UserLoginScreen getUserLoginScreen() {
        return userLoginScreen;
    }

    public AdminHomeScreen getAdminHomeScreen() {
        return adminHomeScreen;
    }

    public AdminViewAmendScreen getAdminViewAmendScreen() {
        return adminViewAmendScreen;
    }

    public AdminCreateEmployeeScreen getAdminCreateEmployeeScreen() {
        return adminCreateEmployeeScreen;
    }
    
    public CardLayout getcLayout() {
        return cLayout;
    }

    public void setcLayout(CardLayout cLayout) {
        this.cLayout = cLayout;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }
}
