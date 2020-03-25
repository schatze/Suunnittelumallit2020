/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Osku
 */
public class Verkkokortti implements LaiteOsa {
    
    int hinta = 40;
    
    public int haeHinta() {
        return this.hinta;
    }
    
    
    public void lisääOsa(LaiteOsa osa) {
        throw new RuntimeException("Ei voi lisätä osia verkkokortiin");
    }
}
