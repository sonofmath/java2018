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
    int accountNumber;
    String name;
    int valueInDollars;
    
    Customer(String _name, int _accountNumber, int _valueInDollars) {
        name = _name;
        accountNumber = _accountNumber;
        valueInDollars = _valueInDollars;
    }    
}
