
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
        Soylent soylent = new Soylent();
        soylent.go();
    } 

    void go() throws Exception{
        in = new Scanner(System.in);
        out = System.out;
        
        for(;;){
            if(haveTestCase()){
                readTestCases();
                solve();
                write();
            }
            else{
                break;
            }
        }
    }  
    
    boolean isInt(String input) {
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
   
    
    Scanner in = null;
    PrintStream out = null;
    
    int cases = 0;
    String input = " ";
    int[] drinks = null;
    
    public void readTestCases() {
        input = in.nextLine();
        if (isInt(input)) {
            cases = Integer.parseInt(input);
            if (cases < 0) {
            cases = cases*(-1);
            }
            drinks = new int[cases];
            for (int i = 0; i < drinks.length; i++) {
                input = in.nextLine();
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
            //if (drinks[i]%400 >= 100) {
            //    drinks[i] = (drinks[i]/400) + 1;
            //} else {
                drinks[i] = (drinks[i]/400);
            //}
        } 
    }
    
    void write() {
        for (int i = 0; i < drinks.length; i++) {
            //String numdrinks = Integer.toString(drinks[i]);
            out.println(drinks[i]);
        }
    }    
    
    private boolean haveTestCase() {
        return in.hasNextInt();
    }
}
    

