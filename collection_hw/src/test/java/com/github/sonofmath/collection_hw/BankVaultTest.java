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
        Customer bill = new Customer("bill", 3030, 1600);
        
        SafeDepositBox depositbox = new SafeDepositBox(3030, 27000);
        bill.unlock(3030);
        bill.addValuables("Money", 1600);
    }
}
