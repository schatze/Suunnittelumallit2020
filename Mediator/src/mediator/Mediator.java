/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Osku
 */
public class Mediator implements IMediator{
    List<Mäkihyppääjä> hyppääjät = new ArrayList();
    List<Tuomari> tuomarit = new ArrayList();
    
    public void otaHyppyVastaan(Mäkihyppääjä hyppääjä, int pituus) {
        pisteytäHyppy(hyppääjä, pituus);
    }
    
    public void pisteytäHyppy(Mäkihyppääjä hyppääjä, int pituus) {
        for(Tuomari t : tuomarit) {
            t.annaPisteet(hyppääjä, pituus);
        }
    }
    
    public void lisääHyppääjä(Mäkihyppääjä hyppääjä) {
        hyppääjät.add(hyppääjä);
    }
    
    public void lisääTuomari(Tuomari tuomari) {
        tuomarit.add(tuomari);
    }
}
