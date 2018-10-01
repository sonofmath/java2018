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
class SafeDepositBox {
    int accountNumber;
    int currentValue;
    
    BankVault vault;
    Customer customer;
    Valuables valuables = new Valuables();
    
    SafeDepositBox(BankVault _vault, Customer _customer) {
        customer = _customer;
        vault = _vault;
    }      

    SafeDepositBox() {
    }

    void addItem(String name, int value) {
        for (Item cutomersItem : customer.valuables)
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean hasItemByName(String name) {
        return valuables.hasItemByName(name);
    }

}
