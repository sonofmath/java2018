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

    @Test
    public void testInsert() {
        System.out.println("insert");
        App instance = new App();
        instance.connect();
        instance.insert("apples", 3.50, 2);
        instance.selectItem("apples");
        assertEquals(instance.testname, "apples");
        assertEquals(instance.testquantity, 2);
    }

    @Test
    public void testSelectItem() {
        System.out.println("selectItem");
        App instance = new App();
        instance.connect();
        instance.selectItem("apples");
        assertEquals(instance.testname, "apples");
        instance.selectItem("avocados");
        assertEquals(instance.testname, "avocados");
    }
    
    @Test
    public void testUpdateItemQuantity() {
        System.out.println("updateItemQuantity");
        App instance = new App();
        instance.updateItemQuantity("pickles", 4);
        instance.selectItem("pickles");
        assertEquals(instance.testquantity, 4);
        
        instance.updateItemQuantity("pickles", 1);
        instance.selectItem("pickles");
        assertEquals(instance.testquantity, 1);
    }
    
    @Test
    public void testHasItem() {
        System.out.println("hasItem");
        App instance = new App();
        assertTrue(instance.hasItem("pickles"));
        assertFalse(instance.hasItem("pears"));
    }
    
    @Test
    public void testItemExists() {
        App instance = new App();
        instance.itemExists("pickles");
        assertEquals(instance.count, 1);
        instance.itemExists("grapefruit");
        assertEquals(instance.count, 0);
    }
}
