/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonofmath.thread_hw;

import java.util.List;

/**
 *
 * @author jrmathson
 */
public class TestStudent implements Runnable {
    Action action;
    Thread thread = new Thread(this);
    List list;
    
    TestStudent(List _list, Action _action) {
        action = action;
        list = _list;
    }
    
    void start() { thread.start(); }
    
    @Override
    public void run() {
        System.out.println("Student is asking a question");
    }
    
}
