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
class Instructor implements Runnable {
    String name;
    Thread thread = new Thread(this);
    OurClassroom ourclass;
    
    Instructor(String _name) {
        name = _name;
    }
    
    public void start() { thread.start(); }
    
    @Override
    public void run() {
        try {
            String message = this.name + " is lecturing";
            Speaks speaker = new Speaks(message);
            while(ourclass.isIn()) {
                speaker.says();
                Thread.sleep(2000);
            }
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name + " has stopped lecturing. Class is over.");
    }
}
