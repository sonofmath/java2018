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
    LinkedList<String> linkedlist = new LinkedList<String>();
    Action action;
    int size;
    
    OurClass(Action _action, int _size) {
        action = _action;
        size = _size;
    }
    
    TestStudent students;
    Instructor drmacevoy;
    
    void start() {
        drmacevoy = new Instructor();
        students = new TestStudent(linkedlist, action);
        drmacevoy.start();
    }
    
    }

