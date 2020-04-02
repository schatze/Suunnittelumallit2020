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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pizza pizza1 = new Pepperoni(
            new Juusto (
                new Tomaattimurska(
                    new Pohja(
                        new PizzaImplementaatio())
        )));
        
        Pizza pizza2 = new Rucola(
                new Chorizo(
                        new Juusto(
                            new Tomaattimurska(
                                    new Pohja(
                                          new PizzaImplementaatio()
        )))));
        
        Pizza pizza3 = new Ananas(
                new Aurajuusto(
                new Pepperoni(
                        new Juusto(
                            new Tomaattimurska(
                                    new Pohja(
                                          new PizzaImplementaatio()
        ))))));
        
        System.out.println("Pizza1 maksaa " + pizza1.haeHinta());
        System.out.println(pizza1.haeTäytteet());
        
        System.out.println("Pizza2 maksaa " + pizza2.haeHinta());
        System.out.println(pizza2.haeTäytteet());
        
        System.out.println("Pizza3 maksaa " + pizza3.haeHinta());
        System.out.println(pizza3.haeTäytteet());
    }
    
}
