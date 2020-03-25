/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Osku
 */
public class Muisti implements LaiteOsa {
    List<LaiteOsa> osat = new ArrayList();
    
    int hinta = 80;
    
    public int haeHinta() {
        int osienHinta = 0;
        
        for(LaiteOsa osa : osat) {
            osienHinta += osa.haeHinta();
        }
        
        return osienHinta + this.hinta;
    }
    
    public void lisääOsa(LaiteOsa osa) {
        throw new RuntimeException("Ei voi lisätä osia muistiin");
    }
}
