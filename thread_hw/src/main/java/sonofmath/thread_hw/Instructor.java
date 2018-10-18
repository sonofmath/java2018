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

    }

    Instructor() {
        name = "";
        thread = new Thread(this);
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        try {
            String message = this.name + " is lecturing";
            while (lecture.isIn()) {
                int counter = 0;
                synchronized (talks) {
                    while (counter < 10) {
                        counter++;
                        talks.says(message);
                        Thread.sleep(500);
                    }
                }
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name + " has stopped lecturing. Class is over.");
    }
}
