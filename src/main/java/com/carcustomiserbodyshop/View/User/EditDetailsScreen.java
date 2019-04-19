/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.User;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Personal
 */
public class EditDetailsScreen extends LayoutFunctions{
     JButton backButton = new JButton("Back");
    JButton logoutButton = new JButton("Logout");
    JLabel screenLabel = new JLabel("Edit My Details");
    JLabel enterInfoLabel = new JLabel("Enter your information below:");
    JLabel firstnameLabel = new JLabel("First Name:");
    JTextField firstnameTextField = new JTextField();
    JLabel lastnameLabel = new JLabel("Last Name:");
    JTextField lastnameTextField = new JTextField();
    JLabel usernameLabel = new JLabel("Username:");
    JTextField usernameTextField = new JTextField();
    JLabel passwordLabel = new JLabel("Password:");
    JTextField passwordTextField = new JTextField();
    JLabel retypePasswordLabel = new JLabel("Re-type Password:");
    JTextField retypePasswordTextField = new JTextField();
    JLabel addressLine1Label = new JLabel("Address Line 1:");
    JTextField addressLine1TextField = new JTextField();
    JLabel addressLine2Label = new JLabel("Address Line 2:");
    JTextField addressLine2TextField = new JTextField();
    JLabel cityLabel = new JLabel("City:");
    JTextField cityTextField = new JTextField();
    JLabel postcodeLabel = new JLabel("Postcode:");
    JTextField postcodeTextField = new JTextField();
    JButton saveButton = new JButton("Save");

    public EditDetailsScreen() {
        panel.setLayout(layout);
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,0,20,135);
        panel.add(backButton, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 0;
        gridBagConst.gridwidth = 2;
        gridBagConst.insets = new Insets(0,160,10,160);
        panel.add(screenLabel, gridBagConst);

        gridBagConst.gridx = 3;
        gridBagConst.gridy = 0;
        gridBagConst.gridwidth = 0;
        gridBagConst.insets = new Insets(0,110,20,0);
        panel.add(logoutButton, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 1;
        gridBagConst.gridwidth = 2;
        gridBagConst.insets = new Insets(30,0,10,0);
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
        gridBagConst.insets = new Insets(10,0,40,0);
        panel.add(postcodeLabel, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 10;
        gridBagConst.insets = new Insets(10,20,40,0);
        panel.add(postcodeTextField, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 11;
        gridBagConst.gridwidth = 2;
        gridBagConst.fill = GridBagConstraints.NONE;
        saveButton.setPreferredSize(new Dimension(100, 25));
        gridBagConst.insets = new Insets(0,0,25,0);
        panel.add(saveButton, gridBagConst);

    }
    /*
     public static void main(String[] args) {
        EditDetailsScreen screen = new EditDetailsScreen();
        screen.setTitle("Custom Car Autos LTD: Edit My Details");
        screen.setSize(800, 600);
        screen.setVisible(true);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(EXIT_ON_CLOSE);
        screen.setLocation((GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x) - (screen.getWidth() / 2),
                (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y) - (screen.getHeight() / 2));
        screen.add(screen.panel);
        String s = "gd";
        s = s.substring(0, (s.length()-1));
         System.out.println("s string: "+s);
    }
    */
    @Override
    public void setUpContainer(JFrame frame, JPanel panel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
