/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonofmath.thread_hw;
/**
 *
 * @author jrmathson
 */
public class OurClassroom {
    int classsize;
    Students students[] = new Students[classsize];
    public static int classlength;
    long start;
    
    OurClassroom(int _size, int _classlength) {
        classsize = _size;
        classlength = _classlength;
    }
    
    boolean isIn() {
        if((System.currentTimeMillis() - start) < classlength) {
            return true;
        } else {
            return false;
        }
    }
    
    Students student;
    Instructor drmacevoy;
    
    void start() {
        start = System.currentTimeMillis();
        drmacevoy = new Instructor("Dr Macevoy");
        drmacevoy.start();
        student.start();
    }
}

