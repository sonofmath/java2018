
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

    public static boolean isInt(String input) {
        try {
            Integer.parseInt(input);
        } catch(NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
    
    Scanner in = new Scanner(System.in);
    
    int cases;
    int[] drinks;
    
    public void readTestCases(int _cases) {
        cases = _cases;
        if (cases < 0) {
            cases = _cases*(-1);
        } 
        drinks = new int[cases];
        for (int i = 0; i < drinks.length; i++) {
            drinks[i] = in.nextInt();
        }
    }
    
    private boolean haveNumCases() {
        return in.hasNextInt();
    }
    void solve() {
        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i]%400 >= 100) {
                drinks[i] = (drinks[i]/400) + 1;
            } else {
                drinks[i] = (drinks[i]/400);
            }
        } 
    }
    
    void write() {
        for (int i = 0; i < drinks.length; i++) {
            System.out.println(drinks[i]);
        }
    }    
}
    

