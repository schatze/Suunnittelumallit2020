/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Osku
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        
        HampurilaisBuilder heseBuilder = new HesburgerBuilder();
        HampurilaisBuilder mcBuilder = new McDonaldsBuilder();
        
        waiter.setBuilder(mcBuilder);
        waiter.constructHamburger();
        
        Hampurilainen hampurilainen = waiter.getHampurilainen();
        
        System.out.println("Hampurilaisessa on ");
        for(Object o : hampurilainen.getOsat()) {
            System.out.println((String)o);
        }
        
        
        waiter.setBuilder(heseBuilder);
        waiter.constructHamburger();
        
        hampurilainen = waiter.getHampurilainen();
        
        System.out.println("\n\nHampurilaisessa on ");
        for(Object o : hampurilainen.getOsat()) {
            HampurilaisOsa osa = (HampurilaisOsa)o;
            System.out.println(osa.getNimi());
        }
    }
    
}
