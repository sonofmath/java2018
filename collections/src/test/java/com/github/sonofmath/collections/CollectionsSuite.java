/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sonofmath.collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author sonof
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.github.sonofmath.collections.ItemsTest.class, com.github.sonofmath.collections.ItemTest.class, com.github.sonofmath.collections.MainTest.class, com.github.sonofmath.collections.CustomerTest.class, com.github.sonofmath.collections.MarketTest.class})
public class CollectionsSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
