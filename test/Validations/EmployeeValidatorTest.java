/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import Models.Entity.EmployeesModel;
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
public class EmployeeValidatorTest {
    
    EmployeesModel employee;
    EmployeeValidator validator;
    
    public EmployeeValidatorTest() {
        
        String first_name = "FirstName";
        String last_name = "LastName";
        String email = "abnet@absoft.net";
        String gender = "Male";
        String password = "password";
        
        employee = new EmployeesModel(first_name, last_name, gender, email, password);
        validator = new EmployeeValidator();
        
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
        
        String first_name = "FirstName";
        String last_name = "LastName";
        String email = "abnet@absoft.net";
        String gender = "Male";
        String password = "passwords";
        
        employee = new EmployeesModel(first_name, last_name, gender, email, password);
        
    }
    
    
    

    /**
     * Test of Validate method, of class EmployeeValidator.
     */
    @Test
    public void testFirstNameEmpty() {
        
        System.out.println("Validate FirstName Input");
        
        employee.first_name = "";
        
        try {
            validator.Validate(employee);
            fail("empty first name should not pass");
        } catch (Exception ex) {
            assertTrue(true);
        }
        
    }
    
    @Test
    public void testFirstNameUpperbound() {
        
        System.out.println("Validate FirstName Input");
        
        try {
            validator.NameValidator("abcdefghijklmnopqrstuvwxyzABCDE");
            fail("more than 30 character name should not pass");
        } catch (Exception ex) {
            assertTrue(true);
        }
        
    }
    
    @Test
    public void testFirstNameCorrect() {
        
        System.out.println("Validate FirstName Input");
        
        try {
            validator.NameValidator(employee.first_name);
            assertTrue(true);
        } catch (Exception ex) {
            fail(ex.getMessage());

        }
        
    }
    
    @Test
    public void testFirstNameLowerbound() {
        
        System.out.println("Validate FirstName Input");
        
        try {
            validator.NameValidator("abcd");
            fail("less than 5 character name should not pass");
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
        employee.email = "abcde";
        
        try {
            validator.Validate(employee);
            fail("less than 6 character email should not pass");
        } catch (Exception ex) {
            assertTrue(true);
        }

    }
    
    @Test
    public void testEmailCorrect() {
        
        System.out.println("email input validator");
        // giving 5 character for email just less than 6
        employee.email = "abnetkebede075@gmail.com";
        
        try {
            validator.Validate(employee);
            assertTrue(true);
        } catch (Exception ex) {
            fail(ex.getMessage());
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
        // giving 31 character for email just above 30
        employee.email = "abcdefghijklmnopqrstuvwxyz@.com";
        
        try {
            validator.Validate(employee);
            fail("more than 30 character email should not pass");
        } catch (Exception ex) {
            assertTrue(true);
        }

    }
    
    @Test
    public void testGenderEmpty() {
        
        System.out.println("password input validator");
        //giving empty characters for gender 
        employee.gender = "";
        
        try {
            validator.Validate(employee);
            fail("empty gender should not pass");
        } catch (Exception ex) {
            assertTrue(true);
        }

    }
    
    @Test
    public void testGenderUnknown() {
        
        System.out.println("Validate Gender Input");
        
        employee.gender = "unknown";
        
        try {
            validator.Validate(employee);
            fail("unknown gender should not pass");
        } catch (Exception ex) {
            assertTrue(true);
        }
        
    }
    
    @Test
    public void testPasswordEmpty() {
        
        System.out.println("password input validator");
        //giving empty characters for employee 
        employee.password = "";
        
        try {
            validator.Validate(employee);
            fail("empty password should not pass");
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
        employee.password = "abcdefg";
        
        try {
            validator.Validate(employee);
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
        //giving 21 characters for the password just above 20
        employee.password = "abcdefghijklmnopqrstu";
        
        try {
            validator.Validate(employee);
            fail("more than 20 character password should not pass");
        } catch (Exception ex) {
            assertTrue(true);
        }

    }
    
}
