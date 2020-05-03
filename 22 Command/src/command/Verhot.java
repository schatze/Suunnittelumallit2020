/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Osku
 */
public class Verhot {
    boolean verhotYlhäällä = false;
    
    public void verhotYlös() {
        verhotYlhäällä = true;
        System.out.println("Verhot ovat nyt ylhäällä.");
    }
    
    public void verhotAlas() {
        verhotYlhäällä = false;
        System.out.println("Verhot ovat nyt alhaalla.");
    }
}
