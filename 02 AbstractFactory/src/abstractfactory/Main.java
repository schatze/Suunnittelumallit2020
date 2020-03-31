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
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Osku
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Properties properties = new Properties();
        
        try {
            properties.load(new FileInputStream("src/abstractfactory/tehdas.properties"));
        } catch (IOException exception) {
            System.out.println("Error reading properties");
            exception.printStackTrace();
            return;
        }
        
        String tehdas = properties.getProperty("tehdas").toString();
        System.out.println("Valittu tehdas on " + tehdas);
        
        Set<Vaate> vaatteet = new HashSet();
        AbstractFactory vaateTehdas = TehtaanTuottaja.haeTehdas(tehdas);  // tässä voi vaihtaa merkkiä/tehdasta
        
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
