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
public class Customer implements Comparable < Customer > {
    String name;
    int valueInDollars;
    Valuables valuables = new Valuables();
    
    Customer(String _name, int _valueInDollars) {
        name = _name;
        valueInDollars = _valueInDollars;
    }
    
    void addItem(String _name, int _valueInDollars) {
        valuables.add(new Item(_name, _valueInDollars));
    }

    boolean hasItemByName(String name) {
        return valuables.hasItemByName(name);
    }
    
    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Customer) {
            return name.equals(((Customer) o).name);
        } else {
            throw new ClassCastException("unsupported type");
        }
        
    }
}
