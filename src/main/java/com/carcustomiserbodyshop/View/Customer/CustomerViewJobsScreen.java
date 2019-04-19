/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.Customer;

import com.carcustomiserbodyshop.View.User.LayoutFunctions;
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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Personal
 */
public class CustomerViewJobsScreen extends LayoutFunctions{
     
    JButton backButton = new JButton("Back");
    JButton logoutButton = new JButton("Logout");
    JButton disableButton = new JButton("Disable");
    JButton enableButton = new JButton("Enable");
    JLabel windowLabel = new JLabel("Job History");
    JTextArea textArea = new JTextArea();
    JScrollPane textAreaScrollPane = new JScrollPane(textArea);
    JComboBox<String> employeeDropDownBox;
    //ConcurrentHashMap employees = new ConcurrentHashMap<>();
    
    public CustomerViewJobsScreen(/*ConcurrentHashMap employees*/){
        panel.setLayout(layout);
        //this.employees = employees;
        employeeDropDownBox = new JComboBox();
        employeeDropDownBox.setPreferredSize(new Dimension(200, 25));
        textAreaScrollPane.setPreferredSize(new Dimension(550, 500));
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,0,20,155);
        panel.add(backButton, gridBagConst);
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,150,20,0);
        panel.add(windowLabel, gridBagConst);
        
        gridBagConst.gridx = 2;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,255,20,0);
        panel.add(logoutButton, gridBagConst);
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 1;
        gridBagConst.insets = new Insets(0,0,0,20);
        panel.add(employeeDropDownBox, gridBagConst);
        
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 1;
        gridBagConst.gridheight = 2;
        gridBagConst.gridwidth = 2;
        gridBagConst.fill = GridBagConstraints.VERTICAL;
        gridBagConst.insets = new Insets(0,0,0,0);
        panel.add(textAreaScrollPane, gridBagConst);
        
        
        gridBagConst.gridx = 2;
        gridBagConst.gridy = 2;
        gridBagConst.gridheight = 1;
        gridBagConst.fill = GridBagConstraints.NONE;
        //gridBagConst.insets = new Insets(175,0,0,0);
       // panel.add(enableButton, gridBagConst);
        
        
        gridBagConst.gridx = 2;
        gridBagConst.gridy = 3;
        //gridBagConst.fill = GridBagConstraints.NONE;
        //gridBagConst.insets = new Insets(0,0,75,0);
       // panel.add(disableButton, gridBagConst);
        
    }
    
    /*
    public static void main(String[] args) {
        //ConcurrentHashMap employees = new ConcurrentHashMap<>();
        CustomerViewJobsScreen screen = new CustomerViewJobsScreen();
        screen.setTitle("Custom Car Autos LTD: Job History");
        screen.setSize(800, 600);
        screen.setVisible(true);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(EXIT_ON_CLOSE);
        screen.setLocation((GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x) - (screen.getWidth()/2),
                (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y) - (screen.getHeight()/2));
        screen.add(screen.panel);
        //screen.pack();
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
