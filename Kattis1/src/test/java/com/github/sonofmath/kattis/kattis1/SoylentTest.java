/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sonofmath.kattis.kattis1;

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
public class SoylentTest {
    
    public SoylentTest() {
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
     * Test of solve method, of class Soylent.
     */
    @Test
    public void testSolve() {
        System.out.println("solve");
        Soylent instance = new Soylent();
        instance.drinks = new int[2];
        instance.drinks[0] = 2600;
        int i = 2050;
        instance.drinks[1] = i;
        instance.solve();
        assertEquals(7, instance.drinks[0]);
        assertEquals(5, instance.drinks[1]);
    }

    
    /**
     * Test of solve method, of class Soylent.
     * @throws java.lang.Exception
     */
    @Test
    public void testCase1() throws Exception {
        Soylent instance = new Soylent();
        instance.cases = 3;
        assertEquals(3, instance.cases);
        instance.drinks = new int[2];
        instance.drinks[0] = 2543;
        instance.drinks[1] = 1953;
        instance.solve();
        assertEquals(7, instance.drinks[0]);
        assertEquals(5, instance.drinks[1]);
    }
    
    @Test
    public void testCase2() throws Exception {
        Soylent instance = new Soylent();
        instance.cases = 4;
        assertEquals(4, instance.cases);
        instance.drinks = new int[instance.cases];
        int i = 0;
        instance.drinks[i++] = 2020;
        instance.drinks[i++] = 2200;
        instance.drinks[i++] = 2450;
        instance.drinks[i++] = 2500;
        instance.solve();
        assertEquals(5, instance.drinks[0]);
        assertEquals(6, instance.drinks[1]);
        assertEquals(6, instance.drinks[2]);
        assertEquals(7, instance.drinks[3]);
    }

    @Test
    public void testInput() throws Exception {
        Soylent instance = new Soylent();
        assertTrue(instance.isInt("2400"));
        assertFalse(instance.isInt("hola"));
    }
}
