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
class Instructor extends Thread {
    Thread thread = new Thread(this);
    
    public void start() { thread.start(); }
    
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is lecturing.");
        try {
            System.out.println(Thread.currentThread().getName() + " is lecturing.");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has stopped lecturing");
    }
}
