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
public class Speaks{
    OurClassroom lecture;
    Speaks() {
    }
    
    Speaks(OurClassroom _lecture) {
        lecture = _lecture;
    }
    
    void says(String message) throws InterruptedException {
        if(lecture.isIn()) {
            System.out.println(message);
        } else {
            System.out.println("Sorry class is over");
        }
    }
}
