/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.View.User;

import com.carcustomiserbodyshop.IView.IView;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Personal
 */
public abstract class LayoutFunctions implements IView{
    
    protected JPanel panel = new JPanel();
    protected GridBagLayout layout = new GridBagLayout();
    protected GridBagConstraints gridBagConst = new GridBagConstraints();
    protected String frameTitle;
    protected int frameWidth;
    protected int frameHeight;
    public JLabel errorLabel = new JLabel();
    
    public void addListener(JButton component, ActionListener listener){
        component.addActionListener(listener);
    }

    public JPanel getPanel() {
        return panel;
    }
   
    public void setUpContainer(JFrame frame, JPanel panel){
        frame.setTitle(this.frameTitle);
        frame.setSize(this.frameWidth, this.frameHeight);//700w 500h
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLocation((GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x) - (frame.getWidth() / 2),
                (GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y) - (frame.getHeight() / 2));
        frame.add(panel);
    }
    
    public void setScreenLabel(JLabel label, String message){
        label = new JLabel(message);
    }
    
    public JLabel getErrorLabel() {
        return errorLabel;
    }

    public void setErrorLabelText(String text) {
        this.errorLabel.setText(text);
        
    }
    protected static void setGridBagConstPos(GridBagConstraints gridBagConst, int xpos, int ypos){
        gridBagConst.gridx = xpos;
        gridBagConst.gridy = ypos;
    }
    
    protected static void setGridBagConstPosFill(GridBagConstraints gridBagConst, int xpos, int ypos, int fill){
        gridBagConst.gridx = xpos;
        gridBagConst.gridy = ypos;
        gridBagConst.fill = fill;
    }
    
    protected static void setGridBagConstPosInset(GridBagConstraints gridBagConst, int xpos, int ypos, 
            int insetTop, int insetLeft, int insetBottom, int insetRight){
        gridBagConst.gridx = xpos;
        gridBagConst.gridy = ypos;
        gridBagConst.insets = new Insets(insetTop, insetLeft, insetBottom, insetRight);
    }
    
    protected static void setGridBagConstPosFillInset(GridBagConstraints gridBagConst, int xpos, int ypos, int fill, 
            int insetTop, int insetLeft, int insetBottom, int insetRight){
        gridBagConst.gridx = xpos;
        gridBagConst.gridy = ypos;
        gridBagConst.fill = fill;
        gridBagConst.insets = new Insets(insetTop, insetLeft, insetBottom, insetRight);
    }
    
    protected static void setGridBagConstPosWidth(GridBagConstraints gridBagConst, int xpos, int ypos, int width){
        gridBagConst.gridx = xpos;
        gridBagConst.gridy = ypos;
        gridBagConst.gridwidth = width;
    }
    
    protected static void setGridBagConstPosWidthFill(GridBagConstraints gridBagConst, int xpos, int ypos, int width, int fill){
        gridBagConst.gridx = xpos;
        gridBagConst.gridy = ypos;
        gridBagConst.gridwidth = width;
        gridBagConst.fill = fill;
    }
    
    protected static void setGridBagConstPosWidthFillInset(GridBagConstraints gridBagConst, int xpos, int ypos, int width, int fill, 
            int insetTop, int insetLeft, int insetBottom, int insetRight){
        gridBagConst.gridx = xpos;
        gridBagConst.gridy = ypos;
        gridBagConst.gridwidth = width;
        gridBagConst.fill = fill;
        gridBagConst.insets = new Insets(insetTop, insetLeft, insetBottom, insetRight);
    }
    
    protected static void setGridBagConstPosHeight(GridBagConstraints gridBagConst, int xpos, int ypos, int height, int fill){
        gridBagConst.gridx = xpos;
        gridBagConst.gridy = ypos;
        gridBagConst.gridheight = height;
        gridBagConst.fill = fill;
    }
    
    protected static void setGridBagConstPosHeightFill(GridBagConstraints gridBagConst, int xpos, int ypos, int height){
        gridBagConst.gridx = xpos;
        gridBagConst.gridy = ypos;
        gridBagConst.gridheight = height;
    }
    
    protected static void setGridBagConstPosHeightFillInset(GridBagConstraints gridBagConst, int xpos, int ypos, int height, int fill, 
            int insetTop, int insetLeft, int insetBottom, int insetRight){
        gridBagConst.gridx = xpos;
        gridBagConst.gridy = ypos;
        gridBagConst.gridheight = height;
        gridBagConst.fill = fill;
        gridBagConst.insets = new Insets(insetTop, insetLeft, insetBottom, insetRight);
    }
    
    protected static void setGridBagConstPosWidthHeight(GridBagConstraints gridBagConst, int xpos, int ypos, int width, int height){
        gridBagConst.gridx = xpos;
        gridBagConst.gridy = ypos;
        gridBagConst.gridwidth = width;
        gridBagConst.gridheight = height;
    }
    
    protected static void setGridBagConstPosWidthHeightFillInset(GridBagConstraints gridBagConst, int xpos, int ypos, int width, int height, int fill, 
            int insetTop, int insetLeft, int insetBottom, int insetRight){
        gridBagConst.gridx = xpos;
        gridBagConst.gridy = ypos;
        gridBagConst.gridheight = height;
        gridBagConst.gridwidth = width;
        gridBagConst.fill = fill;
        gridBagConst.insets = new Insets(insetTop, insetLeft, insetBottom, insetRight);
    }
}
