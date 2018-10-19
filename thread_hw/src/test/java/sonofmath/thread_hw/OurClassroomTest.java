/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonofmath.thread_hw;

import java.util.logging.Level;
import java.util.logging.Logger;
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
public class OurClassroomTest {
    
    public OurClassroomTest() {
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
     * Test of isIn method, of class OurClassroom.
     */
    @Test
    public void testIsIn() {
        System.out.println("isIn");
        OurClassroom instance = new OurClassroom(1,1000);
        instance.begin = System.currentTimeMillis();
        boolean expResult = true;
        boolean result = instance.isIn();
        assertEquals(expResult, result);
        try {
            Thread.sleep(1000);
            expResult = false;
            result = instance.isIn();
            assertEquals(expResult, result);
        } catch (InterruptedException ex) {
            Logger.getLogger(OurClassroomTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void testStudents() {
        OurClassroom instance = new OurClassroom(15, 1000);
        assertEquals(instance.students.length, 15);
    }
    
    
}
