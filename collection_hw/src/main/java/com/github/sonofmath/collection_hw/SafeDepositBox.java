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
    
    int getCurrentValue() {
        return currentValue;
    }

    void addItem(String name) {
        for (Item customerItem : customer.valuables) {
            if (customerItem.name.equals(name)) {
                valuables.add(customerItem);
                currentValue += customerItem.valueInDollars;
                customer.valuables.remove(customerItem);
                customer.valueInDollars -= valuables.totalValueInDollars();
                return;
            }
        }
        throw new IllegalStateException(customer + " does not have any items called " + name);
    }

    boolean hasItemByName(String name) {
        return valuables.hasItemByName(name);
    }
}
