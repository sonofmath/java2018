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
    public void testCollectionsSortSpeed() {
        ListSpeedTest test = new ListSpeedTest();
        test.setAction(new SortAction());
        test.start();
        test.waitTilFinish(); 
        String result = test.outcome();
        System.out.println("array time = " + test.arrayWorker.millisec);
        System.out.println("linked time = " + test.linkedWorker.millisec);
        assertTrue(result.startsWith("array"));
    }
    
    @Test
    public void testCollectionsSortSerialSpeed() {
        ListSpeedTest test = new ListSpeedTest(
                new SerializedAction(new SortAction()),
                        1_000_000);
        test.setAction(new SerializedAction(new SortAction()));
        test.start();
        test.waitTilFinish(); 
        String result = test.outcome();
        System.out.println("array time = " + test.arrayWorker.millisec);
        System.out.println("linked time = " + test.linkedWorker.millisec);
        assertTrue(result.startsWith("array"));
    }
    
    @Test
    public void testCollectionsRandomizedAction() {
        ListSpeedTest test = new ListSpeedTest();
        test.setAction(new RandomizeAction(1_000_000));
        test.start();
        test.waitTilFinish(); 
        String result = test.outcome();
        System.out.println("array time = " + test.arrayWorker.millisec);
        System.out.println("linked time = " + test.linkedWorker.millisec);
        assertTrue(result.startsWith("array"));
    }
    
    @Test
    public void testCollectionsLambda() {
        ListSpeedTest test = new ListSpeedTest();
        // Lambda notation  type->type.get(type.size());
        test.setAction((list)->{ list.get(list.size()/2); });
        test.start();
        test.waitTilFinish(); 
        String result = test.outcome();
        System.out.println("array time = " + test.arrayWorker.millisec);
        System.out.println("linked time = " + test.linkedWorker.millisec);
        assertTrue(result.startsWith("array"));
    }
}
