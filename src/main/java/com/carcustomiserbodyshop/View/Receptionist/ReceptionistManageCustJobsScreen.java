/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.Receptionist;

import com.carcustomiserbodyshop.model.Users.Employee;
import com.carcustomiserbodyshop.View.User.LayoutFunctions;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.concurrent.ConcurrentHashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 *
 * @author Personal
 */
public class ReceptionistManageCustJobsScreen extends LayoutFunctions {
    
    JButton backButton = new JButton("Back");
    JLabel titleLabel = new JLabel("Manage Customer Jobs");
    JButton logoutButton = new JButton("Logout");
    JTable customerJobsTable;
    JLabel statusLabel = new JLabel("Status: ");
    JButton editButton = new JButton("Edit");
    JButton cancelButton = new JButton("Cancel");
    JButton createJob = new JButton("Create Job");
    JTextArea textArea;
    JScrollPane scrollingTextArea;
    
    public ReceptionistManageCustJobsScreen(/*ConcurrentHashMap<Integer, Employee> customers*/){
        panel.setLayout(layout);
        
        customerJobsTable = new JTable(/*customer names, job id*/);
        textArea = new JTextArea(/*jobdata*/);
        scrollingTextArea = new JScrollPane(textArea);
        textArea.setPreferredSize(new Dimension(450, 300));
        scrollingTextArea.setPreferredSize(new Dimension(450, 425));
        customerJobsTable.setPreferredSize(new Dimension(300, 425));
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,0,0,10);
        panel.add(backButton, gridBagConst);
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 0;
        gridBagConst.gridwidth = 2;
        //gridBagConst.fill = GridBagConstraints.HORIZONTAL;
        //gridBagConst.insets = new Insets(0,0,0,50);
        panel.add(titleLabel, gridBagConst);
        
        gridBagConst.gridx = 3;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,35,0,0);
        panel.add(logoutButton, gridBagConst);
        
        gridBagConst.fill = GridBagConstraints.NONE;
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 1;
        gridBagConst.gridheight = 4;
        gridBagConst.gridwidth = 1;
        gridBagConst.insets = new Insets(80,0,75,10);
        panel.add(customerJobsTable, gridBagConst);
        
        gridBagConst.gridx = 2;
        gridBagConst.gridy = 1;
        gridBagConst.insets = new Insets(80,10,75,0);
        panel.add(scrollingTextArea, gridBagConst);
        
        gridBagConst.fill = GridBagConstraints.HORIZONTAL;
        gridBagConst.gridx = 3;
        gridBagConst.gridy = 1;
        gridBagConst.gridwidth = 1;
        gridBagConst.gridheight = 1;
        gridBagConst.insets = new Insets(80,10,0,0);
        panel.add(statusLabel, gridBagConst);
        
        gridBagConst.gridx = 3;
        gridBagConst.gridy = 2;
        gridBagConst.insets = new Insets(150,10,0,0);
        panel.add(editButton, gridBagConst);
        
        gridBagConst.gridx = 3;
        gridBagConst.gridy = 3;
        gridBagConst.insets = new Insets(0,10,0,0);
        panel.add(cancelButton, gridBagConst);
        
        gridBagConst.gridx = 3;
        gridBagConst.gridy = 4;
        gridBagConst.insets = new Insets(0,10,255,0);
        panel.add(createJob, gridBagConst);
        
        
        
    }
    /*
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Employee> customers = new ConcurrentHashMap<>();
        ReceptionistManageCustJobsScreen screen = new ReceptionistManageCustJobsScreen(customers);
        screen.setTitle("Custom Car Autos LTD: Create Employee Account");
        screen.setSize(975, 650);
        screen.setVisible(true);
        screen.setResizable(false);
        screen.setDefaultCloseOperation(EXIT_ON_CLOSE);
        screen.setLocation((GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x) - (screen.getWidth() / 2),
                (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y) - (screen.getHeight() / 2));
        screen.add(screen.panel);
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
