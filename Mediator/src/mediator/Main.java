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
public class Main {

    public static void main(String[] args) {
        Mediator mediaattori = new Mediator();
        Mäkihyppääjä hyppääjä1 = new Mäkihyppääjä(mediaattori, "Matti Nykänen");
        Mäkihyppääjä hyppääjä2 = new Mäkihyppääjä(mediaattori, "Antti Aalto");
        
        Tuomari tuomari1 = new Tuomari("Tuomari1");
        Tuomari tuomari2 = new Tuomari("Tuomari2");
        Tuomari tuomari3 = new Tuomari("Tuomari3");
        Tuomari tuomari4 = new Tuomari("Tuomari4");
        Tuomari tuomari5 = new Tuomari("Tuomari5");
        
        mediaattori.lisääHyppääjä(hyppääjä1);
        mediaattori.lisääHyppääjä(hyppääjä2);
        
        mediaattori.lisääTuomari(tuomari1);
        mediaattori.lisääTuomari(tuomari2);
        mediaattori.lisääTuomari(tuomari3);
        mediaattori.lisääTuomari(tuomari4);
        mediaattori.lisääTuomari(tuomari5);
        
        hyppääjä1.hyppää();
        hyppääjä2.hyppää();
    }
    
}
