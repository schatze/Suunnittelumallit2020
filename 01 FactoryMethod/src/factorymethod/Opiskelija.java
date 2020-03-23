/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

import factorymethod.Juomat.Juoma;
import factorymethod.Juomat.Kahvi;
import factorymethod.Ruuat.Ruoka;
import factorymethod.Ruuat.Tacos;

/**
 *
 * @author Osku
 */
public class Opiskelija extends AterioivaOtus{
    
    public Juoma createJuoma(){
        return new Kahvi();
    }

    public Ruoka createRuoka() {
        return new Tacos();
    }
    
}
