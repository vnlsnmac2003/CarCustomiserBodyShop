/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.Customer;

import com.carcustomiserbodyshop.View.VinylWrapper.VinylWrapperHomeScreen;
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

/**
 *
 * @author Personal
 */
public class CustomerHomeScreen extends LayoutFunctions{
       JLabel welcomeLabel;
    JButton logoutButton = new JButton("Logout");
    JButton viewAmendButton = new JButton("View My Jobs");
    JButton myDetailsButton = new JButton("My Details");
    
    public CustomerHomeScreen(String customerName){
        panel.setLayout(layout);
        //myDetailsButton.setPreferredSize(new Dimension(250, 25));
        welcomeLabel = new JLabel("WelcomeEEEEEEEEEEE "+customerName);
        panel.add(welcomeLabel);
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,240,100,110);
        panel.add(welcomeLabel, gridBagConst);
        
        gridBagConst.fill = GridBagConstraints.NONE;
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(10,75,100,30);
        panel.add(logoutButton, gridBagConst);
        
        gridBagConst.fill = GridBagConstraints.HORIZONTAL;
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 1;
        gridBagConst.insets = new Insets(10,175,25,40);
        panel.add(viewAmendButton, gridBagConst);
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 2;
        gridBagConst.insets = new Insets(0,175,140,40);
        panel.add(myDetailsButton, gridBagConst);
        
    }
    /*
    public static void main(String[] args) {
        CustomerHomeScreen screen = new CustomerHomeScreen("Juliette");
        screen.setTitle("Custom Car Autos LTD: Customer - Home");
        screen.setSize(600, 400);
        screen.setVisible(true);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(EXIT_ON_CLOSE);
        screen.setLocation((GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x) - (screen.getWidth()/2),
                (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y) - (screen.getHeight()/2));
        screen.getContentPane().add(screen.panel);
        
        //Calling the method pack stop the screen from starting with things showing outside of it. Also
        //it allows you to get the coordinates of the components within it which usually don't show
        screen.pack();
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
