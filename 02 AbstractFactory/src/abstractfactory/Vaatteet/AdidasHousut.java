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
public class AdidasHousut implements Vaate{
    
    public void pue() {
        System.out.println("Adidas housut puettu!");
    }
    
    public String toString() {
        return "Adidas housut";
    }
}