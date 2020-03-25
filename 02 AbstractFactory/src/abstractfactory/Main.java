/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import abstractfactory.Vaatteet.Vaate;

/**
 *
 * @author Osku
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Set<Vaate> vaatteet = new HashSet();
        AbstractFactory vaateTehdas = TehtaanTuottaja.haeTehdas("adidas");  // tässä voi vaihtaa merkkiä/tehdasta
        
        vaatteet.add(vaateTehdas.haeVaate("paita"));
        vaatteet.add(vaateTehdas.haeVaate("päähine"));
        vaatteet.add(vaateTehdas.haeVaate("housut"));
        vaatteet.add(vaateTehdas.haeVaate("kengät"));
        
        for(Vaate vaate : vaatteet) {
            vaate.pue();
        }
        
        Iterator<Vaate> iteraattori = vaatteet.iterator();
        System.out.print("Jasperilla on ");
        while(iteraattori.hasNext()) {
            Vaate vaate = iteraattori.next();
            
            if(!iteraattori.hasNext()) {
                System.out.println(vaate.toString() + " päällä.");
            } else {
                System.out.print(vaate.toString() + " ja ");
            }
        }
    }
    
}
