/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.carcustomiserbodyshop.SQL.SqlUserFunctions;
import com.carcustomiserbodyshop.View.Admin.AdminCreateEmployeeScreen;
import com.carcustomiserbodyshop.model.Users.Admin;
import com.carcustomiserbodyshop.model.Users.AllUsers;
import com.carcustomiserbodyshop.model.guiValidation.guiValidation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ConcurrentHashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Personal
 */
public class AdminUserTest {
    //Connection con;
    Admin admin = new Admin();
    public AdminUserTest() {
        new SqlUserFunctions();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test 
     public void login() {
         assertEquals(1000, SqlUserFunctions.login("admin", "pass"));
     }
    /* 
     @Test
     public void createEmployee() throws SQLException{
         assertEquals(1, admin.createEmployee(SqlUserFunctions.getDB(), "John", "Mcguiver", "user", "pass", "6 Hampfield Drive", "", 
                 "London", "w3 0pr", AllEmployees.RECEPTIONIST_POSITION,true));
     }
*/
     
     @Test
     public void disableEmployee(){
         SqlUserFunctions.loadUsersFromDB();
         admin.disableEmployee(1);
         assertEquals(false, AllUsers.allUsers.get(1).isActive());
     }
     
     @Test
     public void EnableEmployee(){
         SqlUserFunctions.loadUsersFromDB();
         admin.enableEmployee(1);
         assertEquals(true,AllUsers.allUsers.get(1).isActive());
     }
     
     @Test
     public void verifyFieldNotAllowingEmptyInputAndNumbers1(){
         assertEquals(true, guiValidation.isEmptyOrContainsNumbers(""));
     }
     @Test
     public void verifyFieldNotAllowingEmptyInputAndNumbers2(){
         assertEquals(true, guiValidation.isEmptyOrContainsNumbers(" "));
     }
     
     @Test
     public void verifyFieldNotAllowingEmptyInputAndNumbers3(){
         assertEquals(false, guiValidation.isEmptyOrContainsNumbers("James"));
     }
     
     @Test
     public void verifyFieldNotAllowingEmptyInput(){
         assertEquals(false, guiValidation.isEmpty("James"));
     }
     
     @Test
     public void verifyPassword(){
         assertEquals(false, guiValidation.doPasswordsMatch("pass", "pa4s"));
     }
     
     @Test
     public void verifyPassword2(){
         assertEquals(true, guiValidation.doPasswordsMatch("pass", "pass"));
     }
     
     @Test
     public void verifyStringArray(){
         String positions[] = {"Receptionist","Vin7l_W4apper"};
         assertEquals(false, guiValidation.isStringArrayValid(positions));
     }
     
     @Test
     public void verifyStringArray2(){
         String positions[] = {"Receptionist"," "};
         assertEquals(false, guiValidation.isStringArrayValid(positions));
     }
     
     @Test
     public void verifyStringArray3(){
         String positions[] = AllUsers.ALL_POSITIONS;
         assertEquals(true, guiValidation.isStringArrayValid(positions));
     }
     
     
//     public void switchFromLoginToHomeScreen(){}
//     
//     public void loadNameOnHomeScreenLabel(){}
//     
//     public void swtichFromHomeScreenToCreateEmployeeScreen(){}
//     
//     public void swtichFromHomeScreenToViewEditEmployeeScreen(){}
//     
//     public void homeScreenLogout(){}
     
}
