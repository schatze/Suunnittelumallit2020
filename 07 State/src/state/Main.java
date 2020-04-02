/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Osku
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HahmoKonteksti hahmo = new HahmoKonteksti();
        HahmoState charmander = new CharmanderTila();
        HahmoState charmeleon = new CharmeleonTila();
        HahmoState charizard = new CharizardTila();
        
        hahmo.setState(charmander);
        
        hahmo.hyökkää();
        hahmo.väistä();
        hahmo.syö();
        
        hahmo.setState(charmeleon);
        
        hahmo.hyökkää();
        hahmo.väistä();
        hahmo.syö();
        
        hahmo.setState(charizard);
        
        hahmo.hyökkää();
        hahmo.väistä();
        hahmo.syö();
        
    }
    
}
