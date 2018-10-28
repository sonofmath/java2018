/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sonofmath.db_hw;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sonof
 */
public class AppTest {
    
    public AppTest() {
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
     * Test of insert method, of class App.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        App instance = new App();
        instance.createNewTable();
        String name = "Electronics";
        double capacity = 8000;
        instance.insert(name, capacity);
        instance.selectAll();
    }

    /**
     * Test of selectAll method, of class App.
     */
    @Test
    public void testSelectAll() {
        System.out.println("selectAll");
        App instance = new App();
        instance.selectAll();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class App.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        int id = 0;
        String name = "";
        double capacity = 0.0;
        App instance = new App();
        instance.update(id, name, capacity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class App.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        App instance = new App();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewDatabase method, of class App.
     */
    @Test
    public void testCreateNewDatabase() {
        System.out.println("createNewDatabase");
        App instance = new App();
        instance.createNewDatabase();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class App.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class App.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        App instance = new App();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewTable method, of class App.
     */
    @Test
    public void testCreateNewTable() {
        System.out.println("createNewTable");
        App instance = new App();
        instance.createNewTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
