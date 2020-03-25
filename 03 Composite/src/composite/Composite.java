/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Osku
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LaiteOsa kotelo = new Kotelo();
        LaiteOsa emolevy = new Emolevy();
        LaiteOsa muisti = new Muisti();
        LaiteOsa näytöjohjain = new Näytönohjain();
        LaiteOsa prosessori = new Prosessori();
        LaiteOsa verkkokortti = new Verkkokortti();
        
        
        kotelo.lisääOsa(emolevy);
        emolevy.lisääOsa(muisti);
        emolevy.lisääOsa(prosessori);
        emolevy.lisääOsa(näytöjohjain);
        emolevy.lisääOsa(verkkokortti);
        
        System.out.println("Tietokoneen hinta on " + kotelo.haeHinta());
    }
    
}
