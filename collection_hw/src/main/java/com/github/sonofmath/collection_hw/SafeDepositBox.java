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

    static boolean isLocked;
    int accountNumber;
    int currentValue;
    SafeDepositBox(int _accountNumber, int _currentValue) {
        accountNumber = _accountNumber;
        currentValue = _currentValue;
    }      

    SafeDepositBox() {
    }

}
