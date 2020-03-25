/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory.Vaatteet;

/**
 *
 * @author Osku
 */
public class AdidasPaita implements Vaate{
    
    public void pue() {
        System.out.println("Adidas paita puettu!");
    }
    
    public String toString() {
        return "Adidas paita";
    }
}