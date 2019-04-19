/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.Container;

import com.carcustomiserbodyshop.View.User.LayoutFunctions;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Personal
 */
public class ValidationBox extends LayoutFunctions{
    JLabel text;
    JFrame frame;
    JButton okButton;
    
    public ValidationBox(){
        frame = new JFrame();
        text = new JLabel();
        okButton = new JButton("OK");
        panel.setLayout(layout);
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 0;
        gridBagConst.insets = new Insets(10,20,10,20);
        panel.add(text, gridBagConst);
        
        gridBagConst.gridx = 0;
        gridBagConst.gridy = 1;
        gridBagConst.insets = new Insets(10,20,10,20);
        panel.add(okButton, gridBagConst);
        
        this.okButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    public JButton getOkButton() {
        return okButton;
    }
    
    public void setUp(String message){
        text.setText(message);
        setUpContainer(frame, panel);
    }
    
    
    
    @Override
    public void setUpContainer(JFrame frame, JPanel panel) {
        frame.setSize(text.getText().length() * 20, 150);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setLocation((GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x) - (frame.getWidth() / 2),
                (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y) - (frame.getHeight() / 2));
        frame.add(panel);
    }

    @Override
    public void clear() {}

    
}
