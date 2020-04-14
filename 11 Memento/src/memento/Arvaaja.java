/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.Random;

/**
 *
 * @author Osku
 */
public class Arvaaja {
    Object memento;
    Arvuuttaja arvuuttaja;
    
    String nimi;
    
    Random rand = new Random();
    
    int arvaukset = 0;
    
    public Arvaaja(String nimi) {
        this.nimi = nimi;
    }
    
    public void liityArvuuttajaan(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
        memento = arvuuttaja.liityPeliin(this);
    }
    
    public boolean arvaaLuku() {
        int luku = rand.nextInt(99) + 1;
        
        if(arvuuttaja.tarkista(memento, luku)) {
            arvaukset++;
            System.out.println(nimi + " arvasi oikein (" + luku + ")!!! Yrityksiä meni " + arvaukset);
            return true;
        } else {
            arvaukset++;
            System.out.println(nimi + " arvasi väärin (" + luku + ")");
            return false;
        }
    }
}
