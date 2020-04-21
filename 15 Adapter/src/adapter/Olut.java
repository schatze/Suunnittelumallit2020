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
public class Olut {
    private String  nimi;
    
    public Olut(String nimi) {
        this.nimi = nimi;
    }
    
    public void juo() {
        System.out.println(nimi + " olut juotu!");
    }
}
