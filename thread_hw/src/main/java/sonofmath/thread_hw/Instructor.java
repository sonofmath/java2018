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
    Thread thread;
    OurClassroom lecture;
    Speaks talks;

    Instructor(String _name, OurClassroom _lecture, Speaks _talks) {
        name = _name;
        lecture = _lecture;
        talks = _talks;
        thread = new Thread(this);
        //thread.setPriority(6);
    }

    Instructor() {
        name = "";
        thread = new Thread(this);
        //thread.setPriority(6);
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        try {
            String message = this.name + " is lecturing";
            thread.currentThread().setPriority(thread.MAX_PRIORITY);
            while (lecture.isIn()) {
                int counter = 0;
                synchronized (talks) {
                    while (counter < 5 ) {
                        counter++;
                        talks.says(message);
                        Thread.sleep(200);
                    }
                }
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
        }
        System.out.println(this.name + " has stopped lecturing. Class is over.");
    }
}
