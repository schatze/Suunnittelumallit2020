/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Osku
 */
public class OlutAdapteri implements IKotitehtävä {
    private Olut olut;
    
    public OlutAdapteri(Olut olut) {
        this.olut = olut;
    }
    
    public void teeTehtävä() {
        olut.juo();
    }
}
