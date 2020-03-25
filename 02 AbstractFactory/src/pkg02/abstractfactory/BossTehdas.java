/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.abstractfactory;

import pkg02.abstractfactory.Vaatteet.BossHattu;
import pkg02.abstractfactory.Vaatteet.BossHousut;
import pkg02.abstractfactory.Vaatteet.BossKengät;
import pkg02.abstractfactory.Vaatteet.BossPaita;
import pkg02.abstractfactory.Vaatteet.Vaate;

/**
 *
 * @author Osku
 */
public class BossTehdas  extends AbstractFactory {
    
    public Vaate haeVaate(String vaateTyyppi) {
        switch(vaateTyyppi) {
            case "housut":
                return new BossHousut();
                
            case "päähine":
                return new BossHattu();
                
            case "kengät":
                return new BossKengät();
                
            case "paita":
                return new BossPaita();
                
            default:
                return null;
        }
    }
    
}