
package com.github.sonofmath.kattis.kattis1;

import java.util.Scanner;
/**
 *
 * @author jrmathson
 */
public class Soylent {
    public static void main(String [] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int[] drinks;
        while(in.hasNextLine()) {
            Soylent soylent = new Soylent();
            soylent.readTestCases(in.nextInt());
            soylent.solve();
            soylent.write();
        }
    } 
    
    Scanner in = new Scanner(System.in);
    
    int cases;
    int[] drinks;
    
    public void readTestCases(int _cases) {
        if (_cases < 0) {
            cases = _cases*(-1);
        } else {
            cases = _cases;
        }
        drinks = new int[cases];
        for (int i = 0; i < drinks.length; i++) {
            drinks[i] = in.nextInt();
        }
    }
    
    private boolean haveTestCase() {
        return in.hasNextInt();
    }
    
    void solve() {
        for (int i = 0; i < drinks.length; i++) {
            drinks[i] = drinks[i]/400;
        } 
    }
    
    void write() {
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i]);
        }
    }    
}
    

