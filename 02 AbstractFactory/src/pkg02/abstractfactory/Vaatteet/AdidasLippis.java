/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.abstractfactory.Vaatteet;

/**
 *
 * @author Osku
 */
public class AdidasLippis implements Vaate{
    
    public void pue() {
        System.out.println("Adidas lippis puettu!");
    }
    
    public String toString() {
        return "Adidas lippis";
    }
}