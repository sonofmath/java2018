/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jrmathson
 */
public class TestWorker implements Runnable{
    Action action;
    List list;
    Thread thread = new Thread(this);

    TestWorker(List _list, Action _action) {
        list = _list;
        action = _action;
    }
    
    void start() { thread.start(); } // Calls the run method automatically
    
    long millisec;
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        action.actOn(list);
        millisec = System.currentTimeMillis() - start;
    }

    void waitTilFinish() {
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TestWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
