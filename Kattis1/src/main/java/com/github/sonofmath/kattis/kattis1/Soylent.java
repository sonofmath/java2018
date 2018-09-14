
package com.github.sonofmath.kattis.kattis1;

import java.io.PrintStream;
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
            String input = in.nextLine();
            if(soylent.isInt(input)) {
                soylent.readTestCases(input);
                soylent.solve();
                soylent.write();
            }
        }
    } 

    
    
    public boolean isInt(String input) {
        if (input.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(input);
        } catch(NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }
   
    
    Scanner in = new Scanner(System.in);
    PrintStream out;
    
    int cases;
    int[] drinks;
    
    public void readTestCases(String _cases) {
        if (isInt(_cases)) {
            cases = Integer.parseInt(_cases);
            if (cases < 0) {
            cases = cases*(-1);
            }
            drinks = new int[cases];
            in.nextLine();
            for (int i = 0; i < drinks.length; i++) {
                String input = in.nextLine();
                if (isInt(input)) {
                    drinks[i] = Integer.parseInt(input);
                } else {
                    --i;
                }
            }
        }
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
    
    private boolean haveTestCase() {
        return in.hasNextInt();
    }
}
    

