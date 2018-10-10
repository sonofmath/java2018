/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.List;

/**
 *
 * @author jrmathson
 */
public class SerializedAction implements Action {
    Action action;
    private Object lock = new Object();
    
    SerializedAction(Action _action) {
        action = _action;
    }

    @Override
    public void actOn(List list) {
        // Give priority or baton to thread
        synchronized(lock) {
            // Serializes the object
            action.actOn(list);
        }
        // After this block the thread puts the baton down
    }
}
