/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.Admin;

import com.carcustomiserbodyshop.View.User.LayoutFunctions;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Personal
 */
public class AdminViewAmendScreen extends LayoutFunctions{
    
    JButton backButton = new JButton("Back");
    JButton logoutButton = new JButton("Logout");
    //JButton disableButton = new JButton("Disable");
    JButton activateDeactivateButton = new JButton("Deactivate");
    JLabel windowLabel = new JLabel("Select employee below to view information and/or amend account status:");
    JTextArea textArea = new JTextArea();
    JScrollPane textAreaScrollPane = new JScrollPane(textArea);
    JComboBox<String> employeeDropDownBox;
    //ConcurrentHashMap employees = new ConcurrentHashMap<>();
    
    public AdminViewAmendScreen(){
        
        this.frameTitle = "Custom Car Autos LTD: View / Amend employees";
        this.frameWidth = 700;
        this.frameHeight = 500;
        panel.setLayout(layout);
        employeeDropDownBox = new JComboBox();
        employeeDropDownBox.setPreferredSize(new Dimension(250, 25));
        textAreaScrollPane.setPreferredSize(new Dimension(450, 300));
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 0;
        panel.add(backButton, gridBagConst);
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,0,20,0);
        panel.add(windowLabel, gridBagConst);
        
        gridBagConst.gridx = 2;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,0,0,0);
        panel.add(logoutButton, gridBagConst);
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 1;
        panel.add(employeeDropDownBox, gridBagConst);
        
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 2;
        gridBagConst.gridheight = 2;
        gridBagConst.fill = GridBagConstraints.VERTICAL;
        gridBagConst.insets = new Insets(80,40,0,40);
        panel.add(textAreaScrollPane, gridBagConst);
        
        
        gridBagConst.gridx = 2;
        gridBagConst.gridy = 2;
        gridBagConst.gridheight = 1;
        gridBagConst.fill = GridBagConstraints.NONE;
        gridBagConst.insets = new Insets(175,0,0,0);
        panel.add(activateDeactivateButton, gridBagConst);
        
        
//        gridBagConst.gridx = 2;
//        gridBagConst.gridy = 3;
//        //gridBagConst.fill = GridBagConstraints.NONE;
//        gridBagConst.insets = new Insets(0,0,75,0);
//        panel.add(disableButton, gridBagConst);
        
    }

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

//    public JButton getDisableButton() {
//        return disableButton;
//    }

    public JButton getActivateDeactivateButton() {
        return activateDeactivateButton;
    }

    public JTextArea getTextArea() {
        return textArea;
    }

    public JScrollPane getTextAreaScrollPane() {
        return textAreaScrollPane;
    }

    public JComboBox<String> getEmployeeDropDownBox() {
        return employeeDropDownBox;
    }

    @Override
    public void clear() {
        employeeDropDownBox.removeAllItems();
        
    }
    
    
    
}
