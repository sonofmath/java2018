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
}
