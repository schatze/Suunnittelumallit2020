/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Osku
 */
public class Main {

    public static void main(String[] args) {
        
        Kello digiKello1 = new DigitaaliKello();
        Kello digiKello2 = (Kello)digiKello1.clone();
        
        System.out.println("Kello 1 aika: " + digiKello1.getAika());
        System.out.println("Kello 2 aika: " + digiKello2.getAika());
        
        digiKello1.setAika(50);
        System.out.println("Kello 1 aika: " + digiKello1.getAika());
        System.out.println("Kello 2 aika: " + digiKello2.getAika());
    }
    
}
