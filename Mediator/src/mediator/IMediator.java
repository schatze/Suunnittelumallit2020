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
public interface IMediator {
    public void otaHyppyVastaan(Mäkihyppääjä hyppääjä, int pituus);
    public void pisteytäHyppy(Mäkihyppääjä hyppääjä, int pituus);
    
    public void lisääHyppääjä(Mäkihyppääjä hyppääjä);
    public void lisääTuomari(Tuomari tuomari);
}
