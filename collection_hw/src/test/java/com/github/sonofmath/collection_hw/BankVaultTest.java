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
        Customer bill = new Customer("bill", 1600);
        vault.customers.add(bill);
        bill.addItem("money", 1600);
        //bill.hasItemByName("money");
        assertTrue(bill.hasItemByName("money"));
        //SafeDepositBox depositbox = vault.getDepositBoxFor(bill);
        //depositbox.addItem("money", 1600);
        //assertTrue(depositbox.hasItemByName("money"));
    }
}
