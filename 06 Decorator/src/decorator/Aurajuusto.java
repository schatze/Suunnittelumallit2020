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
public class Aurajuusto extends PizzaTäyte{
    public Aurajuusto(Pizza pizza) {
        super(pizza);
    }
    
    public double haeHinta() {
        return super.haeHinta() + 1;
    }
    
    public String haeTäytteet() {
        return super.haeTäytteet() + "ja aurajuustoa ";
    }
}