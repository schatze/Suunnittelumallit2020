/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Osku
 */
public class PizzaImplementaatio implements Pizza {
    
    public double haeHinta() {
        return 0;
    }
    
    public String haeTäytteet () {
        return "Pizzassa on ";
    }
}
