/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Osku
 */
public class Factorymethod {

    public static void main(String[] args) {
        
        System.out.println("Opettaja aterioi:");
        AterioivaOtus opettaja = new Opettaja();
        opettaja.aterioi();
        
        
        System.out.println("\nOpiskelija aterioi:");
        AterioivaOtus opiskelija = new Opiskelija();
        opiskelija.aterioi();
        
        System.out.println("\nPultsari aterioi:");
        AterioivaOtus pultsari = new Pultsari();
        pultsari.aterioi();
    }
    
}
