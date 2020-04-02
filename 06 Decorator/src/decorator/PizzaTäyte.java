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
public abstract class PizzaTäyte implements Pizza {
    private Pizza pizza;
    
    public PizzaTäyte(Pizza pizza) {
        this.pizza = pizza;
    }
    
    public double haeHinta() {
        return pizza.haeHinta();
    }
    
    
    public String haeTäytteet() {
        return pizza.haeTäytteet();
    }
}
