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
public class ReceptionistEditJobScreen extends LayoutFunctions {
    
    JButton backButton = new JButton("Back");
    JButton logoutButton = new JButton("Logout");
    JLabel screenLabel;
    JLabel dateLabel = new JLabel("Date: ");
    JLabel dateValueLabel;
    JLabel statusLabel = new JLabel("Status:");
    JLabel statusValueLabel;
    JLabel AssignedEmpLabel = new JLabel("Assigned Employees:");
    JButton addAssignedEmpButton = new JButton("+");
    JComboBox assignedEmp1;
    JComboBox assignedEmp2;
    JLabel tasksLabel = new JLabel("Tasks: ");
    JButton addTaskButton = new JButton("+");
    JComboBox task1;
    JComboBox task2;
    JComboBox task3;
    JComboBox task4;
    JLabel carRegLabel = new JLabel("Car Registration: ");
    JTextField carRegTextField = new JTextField();
    JLabel carMakeLabel = new JLabel("Car Make: ");
    JTextField carMakeTextField = new JTextField();
    JLabel carModelLabel = new JLabel("Car Model: ");
    JTextField carModelTextField = new JTextField();
    JButton saveButton = new JButton("Save");

    public ReceptionistEditJobScreen() {
        panel.setLayout(layout);
        screenLabel =  new JLabel("Edit job: ");
        dateValueLabel = new JLabel("Date value goes here");
        statusValueLabel = new JLabel("Status value goes here");
        assignedEmp1 = new JComboBox();
        assignedEmp2 = new JComboBox();
        task1 = new JComboBox();
        task2 = new JComboBox();
        task3 = new JComboBox();
        task4 = new JComboBox();
        carModelTextField.setPreferredSize(new Dimension(200, 25));
        assignedEmp1.setPreferredSize(new Dimension(200, 25));
        assignedEmp2.setPreferredSize(new Dimension(200, 25));
        task1.setPreferredSize(new Dimension(200, 25));
        task2.setPreferredSize(new Dimension(200, 25));
        task3.setPreferredSize(new Dimension(200, 25));
        task4.setPreferredSize(new Dimension(200, 25));
        carRegTextField.setPreferredSize(new Dimension(200, 25));
        carMakeTextField.setPreferredSize(new Dimension(200, 25));
        carModelTextField.setPreferredSize(new Dimension(200, 25));
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(5,0,35,0);
        panel.add(backButton, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 0;
        gridBagConst.gridwidth = 2;
        gridBagConst.insets = new Insets(0,300,30,300);
        panel.add(screenLabel, gridBagConst);

        gridBagConst.gridx = 3;
        gridBagConst.gridy = 0;
       gridBagConst.insets = new Insets(0,0,30,0);
        panel.add(logoutButton, gridBagConst);
        
        gridBagConst.fill = GridBagConstraints.NONE;
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 1;
        gridBagConst.gridwidth = 1;
        
        gridBagConst.insets = new Insets(20,100,5,10);
        panel.add(dateLabel, gridBagConst);
        
        gridBagConst.gridx = 2;
        gridBagConst.gridy = 1;
        gridBagConst.gridwidth = 1;
        gridBagConst.insets = new Insets(20,10,5,0);
        
        panel.add(dateValueLabel, gridBagConst);
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 2;
        gridBagConst.insets = new Insets(5,100,5,10);
        panel.add(statusLabel, gridBagConst);
        
        gridBagConst.gridx = 2;
        gridBagConst.gridy = 2;
        gridBagConst.insets = new Insets(5,10,5,0);
        panel.add(statusValueLabel, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 3;
        gridBagConst.insets = new Insets(5,100,5,10);
        panel.add(AssignedEmpLabel, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 3;
        gridBagConst.insets = new Insets(5,10,5,0);
        //panel.add(addAssignedEmpButton, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 3;
        gridBagConst.insets = new Insets(5,0,5,10);
        panel.add(assignedEmp1, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 4;
        gridBagConst.insets = new Insets(5,0,20,10);
        panel.add(assignedEmp2, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 6;
        gridBagConst.insets = new Insets(5,100,5,10);
        panel.add(tasksLabel, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 6;
        gridBagConst.insets = new Insets(5,10,5,0);
        //panel.add(addTaskButton, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 6;
        gridBagConst.insets = new Insets(5,0,5,10);
        panel.add(task1, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 7;
        gridBagConst.insets = new Insets(5,0,5,10);
        panel.add(task2, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 8;
        gridBagConst.insets = new Insets(5,0,5,10);
        panel.add(task3, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 9;
        gridBagConst.insets = new Insets(5,0,20,10);
        panel.add(task4, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 11;
        gridBagConst.insets = new Insets(0,100,5,0);
        panel.add(carRegLabel, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 11;
        gridBagConst.insets = new Insets(5,0,5,5);
        panel.add(carRegTextField, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 12;
        gridBagConst.insets = new Insets(0,100,0,0);
        panel.add(carMakeLabel, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 12;
        gridBagConst.insets = new Insets(5,0,5,5);
        panel.add(carMakeTextField, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 13;
        gridBagConst.insets = new Insets(0,100,20,0);
        panel.add(carModelLabel, gridBagConst);
        
        gridBagConst.gridx = 2;
        gridBagConst.gridy = 13;
        gridBagConst.insets = new Insets(5,0,20,5);
        panel.add(carModelTextField, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 14;
        gridBagConst.gridwidth = 2;
        gridBagConst.fill = GridBagConstraints.NONE;
        gridBagConst.insets = new Insets(25,10,25,0);
        saveButton.setPreferredSize(new Dimension(100, 25));
        panel.add(saveButton, gridBagConst);

    }
    /*
     public static void main(String[] args) {
        ReceptionistEditJobScreen screen = new ReceptionistEditJobScreen();
        screen.setTitle("Custom Car Autos LTD: Edit Job");
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
