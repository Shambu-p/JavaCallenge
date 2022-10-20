package Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Models.Entity.EmployeesModel;
import java.util.ArrayList;
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
public class EmployeesRepositoryTest {
    
    public EmployeesRepositoryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        EmployeesRepository.db.clear();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        EmployeesRepository.db.clear();
    }

    /**
     * Test of create method, of class EmployeesRepository.
     */
    @Test
    public void testCreate() {
        
        System.out.println("create");
        
        String first_name = "FirstName";
        String last_name = "LastName";
        String email = "abnet@absoft.net";
        String gender = "Male";
        String password = "password";
        
        EmployeesModel data = new EmployeesModel(first_name, last_name, gender, email, password);
        // EmployeesRepository employees list initialy contains nothing and the size is 0
        EmployeesRepository instance = new EmployeesRepository();
        
        int expectedLength = 1;
        instance.create(data);

        // if the sample object is inserted in the array the array length should increase to one
        assertEquals(expectedLength, EmployeesRepository.db.size());

    }

    /**
     * Test of find method, of class EmployeesRepository.
     */
    @Test
    public void testFind() {
        
        System.out.println("find");
        
        String first_name = "FirstName";
        String last_name = "LastName";
        String email = "abnet@absoft.net";
        String gender = "Male";
        String password = "password";
        
        EmployeesModel data = new EmployeesModel(first_name, last_name, gender, email, password);
        
        //first create employee
        EmployeesRepository instance = new EmployeesRepository();
        EmployeesModel expResult = instance.create(data);
        
        //then find the created user using the generated id.
        EmployeesModel result = instance.find(expResult.id);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of update method, of class EmployeesRepository.
     */
    @Test
    public void testUpdate() {
        
        System.out.println("update");
        
        String first_name = "FirstName";
        String last_name = "LastName";
        String email = "abnet@absoft.net";
        String gender = "Male";
        String password = "password";
        
        EmployeesModel data = new EmployeesModel(first_name, last_name, gender, email, password);
        
        EmployeesRepository instance = new EmployeesRepository();
        EmployeesModel created = instance.create(data);
        
        //update the object
        created.gender = "Female";
        
        try {
            instance.update(created);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
        
    }

    /**
     * Test of delete method, of class EmployeesRepository.
     */
    @Test
    public void testDelete() {
        
        System.out.println("delete");
        
        String first_name = "FirstName";
        String last_name = "LastName";
        String email = "abnet@absoft.net";
        String gender = "Male";
        String password = "password";
        
        EmployeesModel data = new EmployeesModel(first_name, last_name, gender, email, password);
        EmployeesRepository instance = new EmployeesRepository();
        
        // creating one employee
        EmployeesModel created = instance.create(data);
        
        // deleting the created employee
        instance.delete(created.id);
        
        // the array should be empty
        assertTrue(EmployeesRepository.db.isEmpty());
        
    }
    
}
