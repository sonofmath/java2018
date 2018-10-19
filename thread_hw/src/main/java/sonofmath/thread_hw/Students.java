/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonofmath.thread_hw;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrmathson
 */
public class Students implements Runnable {

    OurClassroom lecture;
    Thread thread;
    Speaks talks;

    Students(OurClassroom _lecture, Speaks _talks, String name) {
        lecture = _lecture;
        talks = _talks;
        thread = new Thread(this, name);
    }

    Students() {
        lecture = null;
        thread = new Thread(this);

    }

    void start() {
        thread.start();
    }

    @Override
    public void run() {
        String message = thread.getName() + " is asking a question";
        thread.currentThread().setPriority(thread.MIN_PRIORITY);
        while (lecture.isIn()) {
            synchronized (talks) {
                try {
                    thread.yield();
                    talks.says(message);
                    thread.sleep(500);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
