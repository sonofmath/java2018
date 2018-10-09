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
public class BankVault {
    Customers customers = new Customers();
    Valuables valuables = new Valuables();

    void addItem(String name, int valueInDollars) {
        valuables.add(new Item("Cash", 500));
    }

    boolean hasItemByName(String name) {
        return valuables.hasItemByName(name);
    }

    SafeDepositBox getDepositBoxFor(Customer customer) {
        return new SafeDepositBox(this, customer);
    }
}
