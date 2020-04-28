/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.Random;

/**
 *
 * @author Osku
 */
public class Mäkihyppääjä {
    protected Mediator mediator;
    protected String nimi;
    
    public Mäkihyppääjä (Mediator mediaattori, String nimi) {
        this.mediator = mediaattori;
        this.nimi = nimi;
    }
    
    Random rand = new Random();
    
    public void hyppää() {
        mediator.otaHyppyVastaan(this, rand.nextInt(300));
    }
    
    public String getName() {
        return nimi;
    }
}
