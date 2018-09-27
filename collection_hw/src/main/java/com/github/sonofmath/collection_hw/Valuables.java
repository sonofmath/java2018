/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.sonofmath.collection_hw;

import java.util.LinkedList;

/**
 *
 * @author jrmathson
 */
public class Valuables extends LinkedList <Item> {

    boolean hasItemByName(String name) {
        for (Item item : this) {
            if (item.name.equals(name)) return true;
        }
        return false;
    }
    
}
