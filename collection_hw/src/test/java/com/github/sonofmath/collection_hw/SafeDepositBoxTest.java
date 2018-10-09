/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sonofmath.collection_hw;

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
public class SafeDepositBoxTest {
    
    public SafeDepositBoxTest() {
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
     * Test of getCurrentValue method, of class SafeDepositBox.
     */
    @Test
    public void testGetCurrentValue() {
        System.out.println("getCurrentValue");
        BankVault vault = new BankVault();
        SafeDepositBox instance = new SafeDepositBox();
        Customer customer = new Customer("dave", 0);
        vault.customers.add(customer);
        customer.addItem("gold", 5000);
        assertTrue(customer.hasItemByName("gold"));
        instance = vault.getDepositBoxFor(customer);
        int expResult = 0;
        int result = instance.getCurrentValue();
        assertEquals(expResult, result);
        
        instance.addItem("gold");
        assertTrue(instance.hasItemByName("gold"));
        assertEquals(5000, instance.getCurrentValue());
    }
    
}
