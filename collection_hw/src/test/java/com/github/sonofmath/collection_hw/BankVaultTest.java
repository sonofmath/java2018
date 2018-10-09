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
 * @author jrmathson
 */
public class BankVaultTest {
    
    public BankVaultTest() {
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
     * Test of addItem method, of class BankVault.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        String name = "Cash";
        int valueInDollars = 500;
        BankVault instance = new BankVault();
        instance.addItem(name, valueInDollars);
        instance.hasItemByName(name);
    }
    
    @Test
    public void testBanking() {
        BankVault vault = new BankVault();
        Customer bill = new Customer("bill", 0);
        vault.customers.add(bill);
        bill.addItem("money", 1600);
        bill.addItem("jewelry", 2000);
        assertTrue(bill.hasItemByName("money"));
        assertTrue(bill.hasItemByName("jewelry"));
        SafeDepositBox depositbox = vault.getDepositBoxFor(bill);
        depositbox.addItem("money");
        assertTrue(depositbox.hasItemByName("money"));
        assertFalse(bill.hasItemByName("money"));
        
        assertEquals(bill.valueInDollars, 3600-1600);
        
        depositbox.addItem("jewelry");
        assertFalse(bill.hasItemByName("jewelry"));
        assertEquals(depositbox.getCurrentValue(), 3600);
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
