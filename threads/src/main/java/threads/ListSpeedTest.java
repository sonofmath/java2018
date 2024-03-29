/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author jrmathson
 */
public class ListSpeedTest {
    Action action;
    int size;
    
    ListSpeedTest(Action _action, int _size) {
        action = _action;
        size = _size;
    }
    
    public static final int DEFAULT_SIZE = 1_000_000;
    
    ListSpeedTest() {
        action = null;
        size = DEFAULT_SIZE;
    }
    
    ArrayList<String> arrayList = new ArrayList<String>();
    LinkedList<String> linkedList = new LinkedList<String>();

    void setAction(Action _action) {
        action = _action;
    }
    
    TestWorker arrayWorker;
    TestWorker linkedWorker;
    
    void start() {
        Action rando = new RandomizeAction(size);
        rando.actOn(arrayList);
        rando.actOn(linkedList);
        arrayWorker = new TestWorker(arrayList, action);
        linkedWorker = new TestWorker(linkedList, action);
        arrayWorker.start();
        linkedWorker.start();
    }

    void waitTilFinish() {
        arrayWorker.waitTilFinish();
        linkedWorker.waitTilFinish();
   }
    
    String outcome() {
        if (arrayWorker.millisec < linkedWorker.millisec) {
            long delta = linkedWorker.millisec - arrayWorker.millisec;
            return "array won by " + delta + " milliseconds";
        } else if (arrayWorker.millisec < linkedWorker.millisec){
            long delta = arrayWorker.millisec - linkedWorker.millisec;
            return "array won by " + delta + " milliseconds";
        } else {
            return "tie";
        }
    }
}
