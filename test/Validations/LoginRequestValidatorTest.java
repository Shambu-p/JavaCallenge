/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import Models.Request.LoginRequest;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Abnet
 */
public class LoginRequestValidatorTest {
    
    LoginRequestValidator instance;
    
    public LoginRequestValidatorTest() {
        instance = new LoginRequestValidator();
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

    /**
     * Test of Validate method, of class LoginRequestValidator.
     */
    @Test
    public void testEmptyInput() {
        
        System.out.println("empty input validator");
        LoginRequest model = new LoginRequest("", "");
        
        try {
            instance.Validate(model);
            fail("empty email and password should not pass");
        } catch (Exception ex) {
            assertTrue(true);
        }

    }
    
    /**
     * email input length lower bound test
     * email should be at least 6 character
     * here we give 5 character just below 5
     */
    @Test
    public void testEmailLowerbound() {
        
        System.out.println("email input validator");
        // giving 5 character for email just less than 6
        LoginRequest model = new LoginRequest("abcde", "password");
        
        try {
            instance.Validate(model);
            fail("less than 6 character email should not pass");
        } catch (Exception ex) {
            assertTrue(true);
        }

    }
    
    /**
     * email input length lower bound test
     * email should be at most 30 character
     * here we give 31 character just above 30
     */
    @Test
    public void testEmailUpperbound() {
        
        System.out.println("email input validator");
        // giving 5 character for email just less than 6
        LoginRequest model = new LoginRequest("abcdefghijklmnopqrstuvwxyz@.com", "password");
        
        try {
            instance.Validate(model);
            fail("more than 30 character email should not pass");
        } catch (Exception ex) {
            assertTrue(true);
        }

    }
    
    /**
     * password input length lower bound test
     * password should be at least 8 character to be valid
     * here we give 7 character just below 8
     */
    @Test
    public void testPasswordLowerbound() {
        
        System.out.println("password input validator");
        //giving 7 characters for the password just less than 8 
        LoginRequest model = new LoginRequest("ab@absoft.net", "abcdefg");
        
        try {
            instance.Validate(model);
            fail("less than 8 character password should not pass");
        } catch (Exception ex) {
            assertTrue(true);
        }

    }
    
    /**
     * password input length lower bound test
     * password should be at most 20 character to be valid
     * here we give 21 character just above 20
     */
    @Test
    public void testPasswordUpperbound() {
        
        System.out.println("password input validator");
        //giving 7 characters for the password just less than 8 
        LoginRequest model = new LoginRequest("ab@absoft.net", "abcdefghijklmnopqrstu");
        
        try {
            instance.Validate(model);
            fail("more than 20 character password should not pass");
        } catch (Exception ex) {
            assertTrue(true);
        }

    }
    
}
