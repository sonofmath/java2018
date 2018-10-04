/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.List;

/**
 *
 * @author jrmathson
 */
public class SortAction implements Action {

    @Override
    public void actOn(List list) {
        list.sort(null);
    }
    
}
