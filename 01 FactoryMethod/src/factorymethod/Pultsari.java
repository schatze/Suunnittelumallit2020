/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import factorymethod.Juomat.Juoma;
import factorymethod.Juomat.Mennen;
import factorymethod.Ruuat.Kanankoipi;
import factorymethod.Ruuat.Ruoka;

/**
 *
 * @author Osku
 */
public class Pultsari extends AterioivaOtus {
    
    public Juoma createJuoma(){
        return new Mennen();
    }

    public Ruoka createRuoka() {
        return new Kanankoipi();
    }
    
}
