/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sonofmath.collection_hw;

/**
 *
 * @author jrmathson
 */
public class Main {
    public static void main(String [] args) throws Exception {
        Main main = new Main();
        main.run();
    }

    void run() {
        BankVault vault = new BankVault();
        vault.addItem("cash", 500);
    }
}
