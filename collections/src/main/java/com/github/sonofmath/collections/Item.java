/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sonofmath.collections;

/**
 *
 * @author jrmathson
 */
class Item {
    int priceInCents;
    String name;
    Item(String _name, int _priceInCents) {
        name = _name;
        priceInCents = _priceInCents;
    }
    
    //boolean equals(Object o) { return this == o; }
}
