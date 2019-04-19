/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.Receptionist;

import com.carcustomiserbodyshop.View.User.LayoutFunctions;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Personal
 */
public class ReceptionistHomeScreen extends LayoutFunctions{
    
    JLabel welcomeLabel;
    JButton logoutButton = new JButton("Logout");
    JButton createCustomerButton = new JButton("Create Customer");
    JButton viewAmendCustButton = new JButton("View / Amend Customer");
    JButton manageCustJobsButton = new JButton("Manage Customer Jobs");
    JButton myDetailsButton = new JButton("My Details");
    
    
    public ReceptionistHomeScreen(){
        panel.setLayout(layout);
        welcomeLabel = new JLabel("Welcome _receptionist name_");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        createCustomerButton.setPreferredSize(new Dimension(250, 25));
        viewAmendCustButton.setPreferredSize(new Dimension(250, 25));
        manageCustJobsButton.setPreferredSize(new Dimension(250, 25));
        myDetailsButton.setPreferredSize(new Dimension(250, 25));
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 0;
        gridBagConst.fill = GridBagConstraints.HORIZONTAL;
        gridBagConst.insets = new Insets(0,200,140,0);
        panel.add(welcomeLabel, gridBagConst);
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,150,140,0);
        panel.add(logoutButton, gridBagConst);
        
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 1;
        gridBagConst.insets = new Insets(0,200,30,0);
        panel.add(viewAmendCustButton, gridBagConst);
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 2;
        gridBagConst.insets = new Insets(0,200,30,0);
        panel.add(manageCustJobsButton, gridBagConst);
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 4;
        gridBagConst.insets = new Insets(0,200,100,0);
        panel.add(myDetailsButton, gridBagConst);
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 3;
        gridBagConst.insets = new Insets(0,200,30,0);
        panel.add(createCustomerButton, gridBagConst);
        
    }

    public JLabel getWelcomeLabel() {
        return welcomeLabel;
    }

    public JButton getLogoutButton() {
        return logoutButton;
    }

    public JButton getCreateCustomerButton() {
        return createCustomerButton;
    }

    public JButton getViewAmendCustButton() {
        return viewAmendCustButton;
    }

    public JButton getManageCustJobsButton() {
        return manageCustJobsButton;
    }

    public JButton getMyDetailsButton() {
        return myDetailsButton;
    }
    
    public void setWelcomeLabelText(String name) {
        this.welcomeLabel.setText("Welcome "+name);
    }

    @Override
    public void setUpContainer(JFrame frame, JPanel panel) {
        frame.setTitle("Custom Car Autos LTD: Receptionist Home Screen");
        frame.setSize(700, 500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocation((GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x) - (frame.getWidth() / 2),
                (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y) - (frame.getHeight() / 2));
        frame.add(panel);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
