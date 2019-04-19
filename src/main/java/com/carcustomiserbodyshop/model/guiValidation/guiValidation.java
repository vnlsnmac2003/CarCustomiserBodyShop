/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.model.guiValidation;

/**
 *
 * @author Personal
 */
public abstract class guiValidation {
    
        public static boolean isEmptyOrContainsNumbers(String input){
        boolean valid = false;
        if(input.trim().isEmpty()) {
            valid = true;
        }
        for(char letter : input.toCharArray()){
            if(Character.isDigit(letter)){
                valid = true;
                break;
            }
        }
        return valid;
    }
    
    public static boolean isEmpty(String input){
        boolean valid = false;
        if(input.trim().isEmpty()) {
            valid = true;
        }
        return valid;
    }
    
    public static boolean doPasswordsMatch(String password1, String password2){
        boolean match = false;
        if(password1.compareToIgnoreCase(password2) == 0){
            match = true;
        }
        return match;
    }
    
    public static boolean isStringArrayValid(String list[]){
        boolean valid = true;
        for(String item : list){
            if(isEmptyOrContainsNumbers(item)){
                valid = false;
            }
        }
        return valid;
    }
}
