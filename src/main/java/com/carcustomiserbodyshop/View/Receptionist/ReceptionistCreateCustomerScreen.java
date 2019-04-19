/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.Receptionist;

import com.carcustomiserbodyshop.View.User.LayoutFunctions;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Personal
 */
public class ReceptionistCreateCustomerScreen extends LayoutFunctions{
    
 JButton backButton = new JButton("Back");
    JButton logoutButton = new JButton("Logout");
    JLabel screenLabel = new JLabel("Create Customer Account");
    JLabel enterInfoLabel = new JLabel("Enter the customer's information below:");
    JLabel firstnameLabel = new JLabel("First Name:*");
    JTextField firstnameTextField = new JTextField();
    JLabel lastnameLabel = new JLabel("Last Name:*");
    JTextField lastnameTextField = new JTextField();
    JLabel usernameLabel = new JLabel("Username:*");
    JTextField usernameTextField = new JTextField();
    JLabel passwordLabel = new JLabel("Password:*");
    JTextField passwordTextField = new JTextField();
    JLabel retypePasswordLabel = new JLabel("Re-type Password:*");
    JTextField retypePasswordTextField = new JTextField();
    JLabel addressLine1Label = new JLabel("Address Line 1:*");
    JTextField addressLine1TextField = new JTextField();
    JLabel addressLine2Label = new JLabel("Address Line 2:");
    JTextField addressLine2TextField = new JTextField();
    JLabel cityLabel = new JLabel("City:*");
    JTextField cityTextField = new JTextField();
    JLabel postcodeLabel = new JLabel("Postcode:*");
    JTextField postcodeTextField = new JTextField();
    JButton createButton = new JButton("Create");

    public ReceptionistCreateCustomerScreen() {
        
        this.frameTitle = "Custom Car Autos LTD: Create Employee Account";
        this.frameWidth = 800;
        this.frameHeight = 600;
        panel.setLayout(layout);
        /*
        SET THE SIZE WHEN THE 'FILL' VALUE IS EQUAL TO GridBagConstraints.NONE
        positionComboBox.setPreferredSize(new Dimension(150, 22));
        firstnameTextField.setPreferredSize(new Dimension(150, 22));
        lastnameTextField.setPreferredSize(new Dimension(150, 22));
        usernameTextField.setPreferredSize(new Dimension(150, 22));
        passwordTextField.setPreferredSize(new Dimension(150, 22));
        retypePasswordTextField.setPreferredSize(new Dimension(150, 22));
        addressLine1TextField.setPreferredSize(new Dimension(150, 22));
        addressLine2TextField.setPreferredSize(new Dimension(150, 22));
        cityTextField.setPreferredSize(new Dimension(150, 22));
        postcodeTextField.setPreferredSize(new Dimension(150, 22));
        */
        //usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,0,20,135);
        panel.add(backButton, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 0;
        gridBagConst.gridwidth = 2;
        gridBagConst.insets = new Insets(0,125,20,125);
        panel.add(screenLabel, gridBagConst);

        gridBagConst.gridx = 3;
        gridBagConst.gridy = 0;
        gridBagConst.gridwidth = 0;
        gridBagConst.insets = new Insets(0,110,20,0);
        panel.add(logoutButton, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 1;
        gridBagConst.gridwidth = 2;
        gridBagConst.insets = new Insets(30,0,20,0);
        panel.add(enterInfoLabel, gridBagConst);
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 2;
        gridBagConst.gridwidth = 1;
        gridBagConst.insets = new Insets(20,0,10,0);
        gridBagConst.fill = GridBagConstraints.HORIZONTAL;
        panel.add(firstnameLabel, gridBagConst);
        
        gridBagConst.gridx = 2;
        gridBagConst.gridy = 2;
        gridBagConst.insets = new Insets(30,20,10,0);
        panel.add(firstnameTextField, gridBagConst);
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 3;
        gridBagConst.insets = new Insets(10,0,10,0);
        panel.add(lastnameLabel, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 3;
        gridBagConst.insets = new Insets(10,20,10,0);
        panel.add(lastnameTextField, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 4;
        gridBagConst.insets = new Insets(10,0,10,0);
        panel.add(usernameLabel, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 4;
        gridBagConst.insets = new Insets(10,20,10,0);
        panel.add(usernameTextField, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 5;
        gridBagConst.insets = new Insets(10,0,10,0);
        panel.add(passwordLabel, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 5;
        gridBagConst.insets = new Insets(10,20,10,0);
        panel.add(passwordTextField, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 6;
        gridBagConst.insets = new Insets(10,0,10,0);
        panel.add(retypePasswordLabel, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 6;
        gridBagConst.insets = new Insets(10,20,10,0);
        panel.add(retypePasswordTextField, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 7;
        gridBagConst.insets = new Insets(10,0,10,0);
        panel.add(addressLine1Label, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 7;
        gridBagConst.insets = new Insets(10,20,10,0);
        panel.add(addressLine1TextField, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 8;
        gridBagConst.insets = new Insets(10,0,10,0);
        panel.add(addressLine2Label, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 8;
        gridBagConst.insets = new Insets(10,20,10,0);
        panel.add(addressLine2TextField, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 9;
        gridBagConst.insets = new Insets(10,0,10,0);
        panel.add(cityLabel, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 9;
        gridBagConst.insets = new Insets(10,20,10,0);
        panel.add(cityTextField, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 10;
        gridBagConst.insets = new Insets(10,0,10,0);
        panel.add(postcodeLabel, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 10;
        gridBagConst.insets = new Insets(10,20,10,0);
        panel.add(postcodeTextField, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 11;
        gridBagConst.gridwidth = 2;
        gridBagConst.fill = GridBagConstraints.NONE;
        createButton.setPreferredSize(new Dimension(100, 25));
        panel.add(createButton, gridBagConst);
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 12;
        gridBagConst.gridwidth = 2;
        gridBagConst.insets = new Insets(5,20,5,0);
        panel.add(errorLabel, gridBagConst);
        errorLabel.setForeground(Color.RED);

    }

    public JButton getBackButton() {
        return backButton;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public JTextField getFirstnameTextField() {
        return firstnameTextField;
    }

    public JTextField getLastnameTextField() {
        return lastnameTextField;
    }

    public JTextField getUsernameTextField() {
        return usernameTextField;
    }

    public JTextField getPasswordTextField() {
        return passwordTextField;
    }

    public JTextField getRetypePasswordTextField() {
        return retypePasswordTextField;
    }

    public JTextField getAddressLine1TextField() {
        return addressLine1TextField;
    }

    public JTextField getAddressLine2TextField() {
        return addressLine2TextField;
    }

    public JTextField getCityTextField() {
        return cityTextField;
    }

    public JTextField getPostcodeTextField() {
        return postcodeTextField;
    }

    public JButton getCreateButton() {
        return createButton;
    }

    @Override
    public void clear() {
        firstnameTextField.setText("");
        lastnameTextField.setText("");
        usernameTextField.setText("");
        passwordTextField.setText("");
        retypePasswordTextField.setText("");
        addressLine1TextField.setText("");
        addressLine2TextField.setText("");
        cityTextField.setText("");
        postcodeTextField.setText("");
        errorLabel.setText("");
    }
}