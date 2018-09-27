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
class BankVault {
    Valuables valuables = new Valuables();

    void addItem(String item, int value) {
        valuables.add(new Item(item, value));
    }
    
}
