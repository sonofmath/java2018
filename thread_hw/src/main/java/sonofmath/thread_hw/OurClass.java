/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonofmath.thread_hw;

import java.util.LinkedList;

/**
 *
 * @author jrmathson
 */
public class OurClass {
    LinkedList<String> students = new LinkedList<String>();
    Speaks speaks;
    int size;
    
    OurClass(Speaks _speaks, int _size) {
        speaks = _speaks;
        size = _size;
    }
    
    TestStudent student;
    Instructor drmacevoy = new Instructor();
    }

