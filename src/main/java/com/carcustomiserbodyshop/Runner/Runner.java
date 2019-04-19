/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carcustomiserbodyshop.Runner;

import com.carcustomiserbodyshop.Controller.Controller;
import com.carcustomiserbodyshop.SQL.SqlUserFunctions;
import com.carcustomiserbodyshop.View.Container.Container;
import com.carcustomiserbodyshop.model.Users.AllUsers;

/**
 *
 * @author Personal
 */
public class Runner {
    
    public static void main(String[] args) {
        
        new SqlUserFunctions();
        SqlUserFunctions.loadUsersFromDB();
        Container container = new Container();
        Controller controller = new Controller(AllUsers.allUsers, container);
    }
    
}
