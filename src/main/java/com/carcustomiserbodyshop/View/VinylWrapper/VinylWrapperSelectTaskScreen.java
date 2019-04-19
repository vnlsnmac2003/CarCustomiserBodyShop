/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.VinylWrapper;

import com.carcustomiserbodyshop.model.Users.Employee;
import com.carcustomiserbodyshop.View.Receptionist.ReceptionistManageCustJobsScreen;
import com.carcustomiserbodyshop.View.User.LayoutFunctions;
import java.awt.BorderLayout;
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
public class VinylWrapperSelectTaskScreen extends LayoutFunctions {
    JButton backButton = new JButton("Back");
    JLabel titleLabel = new JLabel("Select a Job Task");
    JButton logoutButton = new JButton("Logout");
    JTable customerJobsTable;
    JLabel statusLabel = new JLabel("Status: ");
    JButton editButton = new JButton("Edit");
    JButton selectButton;
    JButton createJob = new JButton("Create Job");
    JTextArea textArea;
    JScrollPane scrollingTextArea;
    
    public VinylWrapperSelectTaskScreen(ConcurrentHashMap<Integer, Employee> customers){
        panel.setLayout(layout);
        
        customerJobsTable = new JTable(/*customer names, job id*/);
        textArea = new JTextArea(/*jobdata*/);
        scrollingTextArea = new JScrollPane(textArea);
        textArea.setPreferredSize(new Dimension(450, 300));
        selectButton = new JButton();
        selectButton.setLayout(new BorderLayout());
        JLabel topLine = new JLabel("Mark as Complete");
        topLine.setHorizontalAlignment(SwingConstants.CENTER);
        JLabel bottomLine = new JLabel("/ Uncomplete");
        bottomLine.setHorizontalAlignment(SwingConstants.CENTER);
        selectButton.add(BorderLayout.NORTH,topLine);
        selectButton.add(BorderLayout.SOUTH,bottomLine);
        //selectButton = new JButton("Mark as Complete \r\n Uncomplete");
        //selectButton.setPreferredSize(new Dimension(150, 75));
        customerJobsTable.setPreferredSize(new Dimension(475, 425));
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,0,30,35);
        panel.add(backButton, gridBagConst);
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 0;
        gridBagConst.gridwidth = 2;
        gridBagConst.insets = new Insets(0,0,30,0);
        panel.add(titleLabel, gridBagConst);
        
        gridBagConst.gridx = 3;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(0,70,30,0);
        panel.add(logoutButton, gridBagConst);
        
        gridBagConst.fill = GridBagConstraints.NONE;
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 1;
        gridBagConst.gridheight = 4;
        gridBagConst.gridwidth = 1;
        gridBagConst.insets = new Insets(30,45,50,15);
        panel.add(customerJobsTable, gridBagConst);
        
        gridBagConst.fill = GridBagConstraints.HORIZONTAL;
        gridBagConst.gridx = 3;
        gridBagConst.gridy = 1;
        gridBagConst.gridwidth = 1;
        gridBagConst.gridheight = 1;
        gridBagConst.insets = new Insets(80,0,0,0);
        panel.add(statusLabel, gridBagConst);
        
        gridBagConst.gridx = 3;
        gridBagConst.gridy = 3;
        gridBagConst.insets = new Insets(120,0,0,0);
        panel.add(selectButton, gridBagConst);
        
    }
    /*
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, Employee> customers = new ConcurrentHashMap<>();
        VinylWrapperSelectTaskScreen screen = new VinylWrapperSelectTaskScreen(customers);
        screen.setTitle("Custom Car Autos LTD: Select a Job Task");
        screen.setSize(800, 600);
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
