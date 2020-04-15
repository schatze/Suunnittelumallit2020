/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Osku
 */
public class HahmoKontekstiVisitor implements HahmoVisitor {
    CharmanderTila charmander = new CharmanderTila();
    CharmeleonTila charmeleon = new CharmeleonTila();
    CharizardTila charizard = new CharizardTila();
    
    public void visit(HahmoKonteksti hahmo) {
        if(hahmo.getXp() < 151) {
            hahmo.setState(charmander);
        } else if(hahmo.getXp() > 150 && hahmo.getXp() < 201) {
            hahmo.setState(charmeleon);
        } else if (hahmo.getXp() > 250) {
            hahmo.setState(charizard);
        }
    }
}
