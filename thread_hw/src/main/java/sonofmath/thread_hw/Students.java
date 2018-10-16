/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonofmath.thread_hw;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrmathson
 */
public class Students implements Runnable {
    OurClassroom ourclass;
    Thread thread = new Thread(this);
   
    Students() {
    }

    void start() {
        thread.start();
    }

    @Override
    public void run() {
        try {
            String message;
            Speaks speaker;
            while(ourclass.isIn()) {
                message = "Student is asking a question";
                speaker = new Speaks(message);
                speaker.says();
                Thread.sleep(2000);
            }
            thread.sleep(800);
            System.out.println("Student is asking a question");
        } catch (InterruptedException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
