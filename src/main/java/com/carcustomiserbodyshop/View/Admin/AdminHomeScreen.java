/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.Admin;


import com.carcustomiserbodyshop.View.User.LayoutFunctions;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 *
 * @author Personal
 */
public class AdminHomeScreen extends LayoutFunctions{
    
    JLabel welcomeLabel;
    JButton logoutButton = new JButton("Logout");
    JButton createEmpButton = new JButton("Create Employee");
    JButton viewAmendEmpButton = new JButton("View/Amend Employee");
    JButton testButton = new JButton("test");
    String adminName = "";
    
    
    public AdminHomeScreen(){
        
        this.frameTitle = "Custom Car Autos LTD: Admin - Home";
        this.frameWidth = 600;
        this.frameHeight = 400;
                
        panel.setLayout(layout);
        
        welcomeLabel = new JLabel("Welcome");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 0;
        gridBagConst.fill = GridBagConstraints.HORIZONTAL;
        gridBagConst.insets = new Insets(0,175,100,40);
        panel.add(welcomeLabel, gridBagConst);
        
        gridBagConst.fill = GridBagConstraints.NONE;
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,75,100,0);
        panel.add(logoutButton, gridBagConst);
        
        gridBagConst.ipadx = 50;
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 1;
        gridBagConst.fill = GridBagConstraints.HORIZONTAL;
        gridBagConst.insets = new Insets(0,175,25,40);
        panel.add(createEmpButton, gridBagConst);
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 2;
        gridBagConst.insets = new Insets(0,175,100,40);
        panel.add(viewAmendEmpButton, gridBagConst);
        
    }

    public void setWelcomeLabelText(String name) {
        this.welcomeLabel.setText("Welcome "+name);
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public JButton getCreateEmpButton() {
        return createEmpButton;
    }

    public JButton getViewAmendEmpButton() {
        return viewAmendEmpButton;
    }

    public JButton getTestButton() {
        return testButton;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    @Override
    public void clear() {
       
    }
}
