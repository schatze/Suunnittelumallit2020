/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Osku
 */
public class Hampurilainen {
    List<Object> osat = new ArrayList();
    
    public void lisääOsa(Object o) {
        osat.add(o);
    }
    
    public List<Object> getOsat() {
        return osat;
    }
}
