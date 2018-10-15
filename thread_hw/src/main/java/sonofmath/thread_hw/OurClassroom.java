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
public class OurClassroom {
    LinkedList<String> linkedlist = new LinkedList<String>();
    Action action;
    int size;
    
    OurClassroom(Action _action, int _size) {
        action = _action;
        size = _size;
    }
    
    public static final int DEFAULT_SIZE = 30;
    
    OurClassroom() {
        action = null;
        size = DEFAULT_SIZE;
    }
    
    Students students;
    Instructor drmacevoy;
    
    void start() {
        drmacevoy = new Instructor("drmacevoy");
        students = new Students(linkedlist, action);
        drmacevoy.start();
        students.start();
    }
    
    }

