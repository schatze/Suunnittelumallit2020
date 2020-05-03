/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.Iterator;

/**
 *
 * @author Osku
 */
public class Säie extends Thread {
    
    Iterator iteraattori;
    String nimi;
    
    public Säie(Iterator iteraattori, String nimi) {
        this.iteraattori = iteraattori;
        this.nimi = nimi;
    }
    
    public void run() {
        while(iteraattori.hasNext()) {
            System.out.println("Säie " + nimi + ": " + iteraattori.next());
        }
    }
    
}
