/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author Osku
 */
public class Tuomari {
    
    String nimi;
    
    public Tuomari (String nimi) {
        this.nimi = nimi;
    }
        
    public void annaPisteet(Mäkihyppääjä hyppääjä, int pituus) {
        int pisteet = pituus/5;
        System.out.println("Tuomari " + nimi + " antaa " + pisteet + " pistettä hyppääjälle " + hyppääjä.getName());
    }
}
