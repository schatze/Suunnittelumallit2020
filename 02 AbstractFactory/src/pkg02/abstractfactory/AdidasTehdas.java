/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.abstractfactory;

import pkg02.abstractfactory.Vaatteet.AdidasHousut;
import pkg02.abstractfactory.Vaatteet.AdidasKengät;
import pkg02.abstractfactory.Vaatteet.AdidasLippis;
import pkg02.abstractfactory.Vaatteet.AdidasPaita;
import pkg02.abstractfactory.Vaatteet.Vaate;

/**
 *
 * @author Osku
 */
public class AdidasTehdas extends AbstractFactory {
    
    public Vaate haeVaate(String vaateTyyppi) {
        switch(vaateTyyppi) {
            case "housut":
                return new AdidasHousut();
                
            case "päähine":
                return new AdidasLippis();
                
            case "kengät":
                return new AdidasKengät();
                
            case "paita":
                return new AdidasPaita();
                
            default:
                return null;
        }
    }
    
}
