package Repository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Models.EmployeesModel;
import java.util.ArrayList;
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
public class EmployeesRepositoryTest {
    
    public EmployeesRepositoryTest() {
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
     * Test of create method, of class EmployeesRepository.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        EmployeesModel data = null;
        EmployeesRepository instance = new EmployeesRepository();
        EmployeesModel expResult = null;
        EmployeesModel result = instance.create(data);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of all method, of class EmployeesRepository.
     */
    @Test
    public void testAll() {
        System.out.println("all");
        EmployeesRepository instance = new EmployeesRepository();
        ArrayList<EmployeesModel> expResult = null;
        ArrayList<EmployeesModel> result = instance.all();
//        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class EmployeesRepository.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        int id = 0;
        EmployeesRepository instance = new EmployeesRepository();
        EmployeesModel expResult = null;
        EmployeesModel result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class EmployeesRepository.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        EmployeesModel data = null;
        EmployeesRepository instance = new EmployeesRepository();
        try {
            instance.update(data);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class EmployeesRepository.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        EmployeesRepository instance = new EmployeesRepository();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
