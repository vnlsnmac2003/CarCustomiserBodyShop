/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.carcustomiserbodyshop.model.Users.User;
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
public class UserTest {
    
    public class MockUser extends User{
    
    }
    
    MockUser user = new MockUser();
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        user.setIsActive(false);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void loginTest() {
        
        user.setUsername("admin");
        user.setPassword("pass");
        assertEquals(true, user.login("admin","pass"));
    }
    
    @Test
    public void setLoginTest() {
        user.setLogin("admin", "pass");
        assertEquals("admin",user.getUsername());
        assertEquals("pass", user.getPassword());
    }
    
    @Test
    public void deactivateTest(){
        user.deactivate();
        assertEquals(false, user.isActive());
    }
    
    @Test
    public void activateTest(){
        user.activate();
        assertEquals(true, user.isActive());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
}
