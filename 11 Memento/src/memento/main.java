/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

/**
 *
 * @author Osku
 */
public class main {

    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        
        ArvaajaThread a1 = new ArvaajaThread(arvuuttaja, "Arvaaja1");
        ArvaajaThread a2 = new ArvaajaThread(arvuuttaja, "Arvaaja2");
        ArvaajaThread a3 = new ArvaajaThread(arvuuttaja, "Arvaaja3");
        
        a1.start();
        a2.start();
        a3.start();
    }
    
}
