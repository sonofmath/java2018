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
    int classlength;
    long begin;
    Speaks speaks;
    Students students[];
    
    OurClassroom(int _size, int _classlength) {
        classsize = _size;
        classlength = _classlength;
        speaks = new Speaks();
        students = new Students[classsize];
        for (int i = 0; i < students.length; ++i) {
            String _name = "Student #" + i;
            students[i] = new Students(this, speaks, _name);
        }
    }
    
    OurClassroom() {
        classsize = 0;
        classlength = 0;
    }
    
    long getTimeInClass() {
        return (System.currentTimeMillis() - begin);
    }
    
    boolean isIn() {
        if(getTimeInClass() < classlength) {
            return true;
        } else {
            return false;
        }
    }
    
    Instructor drmacevoy;
    
    void start() {
        begin = System.currentTimeMillis();
        drmacevoy = new Instructor("Dr Macevoy", this, speaks);
        drmacevoy.start();
        for (int i = 0; i < students.length; ++i) {
            students[i].start();
        }
    }
    
    public static void main(String[] args) {
        OurClassroom java2018 = new OurClassroom(25,10000);
        java2018.start();
    }
}

