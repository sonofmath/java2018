/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sonofmath.collections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author jrmathson
 */
class Items extends LinkedList<Item> {

    boolean hasItemByName(String name) {
        for (Item item : this) {
            if (item.name.equals(name)) return true;
        }
        return false;
    }
    
    int totalInCents() {
        int sum = 0;
        for (Item item : this) {
            sum += item.priceInCents;
        }
        return sum;
    }
}
