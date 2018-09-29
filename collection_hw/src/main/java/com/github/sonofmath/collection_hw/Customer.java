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
class Customer {
    SafeDepositBox depositbox = new SafeDepositBox();
    int accountNumber;
    String name;
    int valueInDollars;
    
    Customer(String _name, int _accountNumber, int _valueInDollars) {
        name = _name;
        accountNumber = _accountNumber;
        valueInDollars = _valueInDollars;
    }

    void unlock(int _accountNumber) {
        if (_accountNumber == accountNumber) {
            SafeDepositBox.isLocked = false;
        }
    }

    void addValuables(String name, int valueInDollars) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
