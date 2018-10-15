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

    Action action;
    Thread thread = new Thread(this);
    List list;

    Students(List _list, Action _action) {
        action = action;
        list = _list;
    }

    void start() {
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                thread.sleep(500);
                System.out.println("Student is asking a question");
            } catch (InterruptedException ex) {
                Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
