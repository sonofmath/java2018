/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

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
public class ListSpeedTestTest {
    
    public ListSpeedTestTest() {
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
    public void testSomeMethod() {
    }
    
    @Test
    public void testCOllectionsSortSpeed() {
        ListSpeedTest test = new ListSpeedTest();
        test.setAction(new SortAction());
        test.start();
        test.waitTilFinish(); 
        String result = test.outcome();
        System.out.println("array time = " + test.arrayWorker.millisec);
        System.out.println("linked time = " + test.linkedWorker.millisec);
        assertTrue(result.startsWith("array"));
    }
    
}
