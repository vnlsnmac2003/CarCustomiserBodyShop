/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.User;

import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.*;

/**
 *
 * @author Personal
 */
public class UserLoginScreen extends LayoutFunctions{
    
    JLabel welcomeLabel = new JLabel("Welcome to the Custom Car Autos login page");
    JLabel loginLabel = new JLabel("Login");
    JLabel usernameLabel = new JLabel("Username:");
    JLabel passwordLabel = new JLabel("Password:");
    JTextField usernameTextField = new JTextField(20);
    JTextField passwordTextField = new JTextField(20);
    JButton loginButton = new JButton("OK");
    
    public UserLoginScreen(){
        
        this.frameTitle = "Login";
        this.frameWidth = 600;
        this.frameHeight = 400;
        
        panel.setLayout(layout);
        
        setGridBagConstPosFillInset(gridBagConst, 1, 0, GridBagConstraints.HORIZONTAL, 0, 0, 50, 0);
        panel.add(welcomeLabel, gridBagConst);
        
        setGridBagConstPosFillInset(gridBagConst, 1, 2, GridBagConstraints.NONE, 4, 0, 4, 0);
        panel.add(usernameLabel, gridBagConst);
        
        setGridBagConstPosFill(gridBagConst, 1, 3, GridBagConstraints.HORIZONTAL);
        panel.add(usernameTextField, gridBagConst);
        
        setGridBagConstPosFill(gridBagConst, 1, 4, GridBagConstraints.NONE);
        panel.add(passwordLabel, gridBagConst);
        
        setGridBagConstPosFill(gridBagConst, 1, 5, GridBagConstraints.HORIZONTAL);
        panel.add(passwordTextField, gridBagConst);
        
        setGridBagConstPosFillInset(gridBagConst, 1, 6,GridBagConstraints.NONE, 30, 0, 0, 0);
        panel.add(loginButton, gridBagConst);
        
    }
    
    public JLabel getWelcomeLabel() {
        return welcomeLabel;
    }

    public void setWelcomeLabel(JLabel welcomeLabel) {
        this.welcomeLabel = welcomeLabel;
    }

    public JLabel getLoginLabel() {
        return loginLabel;
    }

    public void setLoginLabel(JLabel loginLabel) {
        this.loginLabel = loginLabel;
    }

    public JLabel getUsernameLabel() {
        return usernameLabel;
    }

    public void setUsernameLabel(JLabel usernameLabel) {
        this.usernameLabel = usernameLabel;
    }

    public JLabel getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(JLabel passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public JTextField getUsernameTextField() {
        return usernameTextField;
    }

    public void setUsernameTextField(JTextField usernameTextField) {
        this.usernameTextField = usernameTextField;
    }

    public JTextField getPasswordTextField() {
        return passwordTextField;
    }

    public void setPasswordTextField(JTextField passwordTextField) {
        this.passwordTextField = passwordTextField;
    }

    public JButton getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(JButton loginButton) {
        this.loginButton = loginButton;
    }

    @Override
    public void clear() {
        
    }
}
