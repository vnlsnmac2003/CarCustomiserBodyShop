/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.User;

import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Personal
 */
public class MyDetailsScreen extends LayoutFunctions{
    
    JButton backButton = new JButton("Back");
    JButton logoutButton = new JButton("Logout");
    JTextArea textArea;
    JScrollPane scrollingTextArea;
    JLabel titleLabel = new JLabel("My Details");
    JButton editButton = new JButton("Edit");
    
    public MyDetailsScreen(){
        
        this.frameTitle = "Custom Car Autos LTD: My Details";
        this.frameWidth = 800;
        this.frameHeight = 600;
        panel.setLayout(layout);
        textArea = new JTextArea("description details");
        scrollingTextArea = new JScrollPane(textArea);
        scrollingTextArea.setPreferredSize(new Dimension(600, 420));
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 0;
        panel.add(backButton, gridBagConst);

        gridBagConst.gridx = 1;
        gridBagConst.gridy = 0;
        panel.add(titleLabel, gridBagConst);

        gridBagConst.gridx = 2;
        gridBagConst.gridy = 0;
        panel.add(logoutButton, gridBagConst);
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 1;
        gridBagConst.insets = new Insets(45,25,10,25);
        panel.add(scrollingTextArea, gridBagConst);
        
        gridBagConst.gridx = 1;
        gridBagConst.gridy = 2;
        gridBagConst.insets = new Insets(15,0,20,0);
        panel.add(editButton, gridBagConst);

    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
