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
public class Kotitehtävä implements IKotitehtävä {
    private String  nimi;
    
    public Kotitehtävä(String nimi) {
        this.nimi = nimi;
    }
    
    public void teeTehtävä() {
        System.out.println(nimi + " tehtävä tehty!");
    }
}
