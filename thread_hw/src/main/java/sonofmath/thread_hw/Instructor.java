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
    String name;
    Thread thread = new Thread(this);
    
    Instructor(String _name) {
        name = _name;
    }
    
    public void start() { thread.start(); }
    
    @Override
    public void run() {
        System.out.println(this.name + " is lecturing.");
        try {
            for(int i = 5; i >= 0; --i) {
                System.out.println(this.name + " is lecturing.");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name + " has stopped lecturing. class is over.");
    }
}
