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
public class Speaks{
    String message;
    
    Speaks(String _message) {
        message = _message;
    }
    void says() {
        System.out.println(message);
    }
}