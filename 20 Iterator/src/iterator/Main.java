/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Osku
 */
public class Main {

    public static void main(String[] args) {
        List<String> lista = new ArrayList();
        
        lista.add("yksi");
        lista.add("kaksi");
        lista.add("kolme");
        lista.add("neljä");
        lista.add("viisi");
        lista.add("kuusi");
        
        Iterator i = lista.iterator();
        
        Säie säie1 = new Säie(i, "Säie1");
        Säie säie2 = new Säie(i, "Säie2");
        
        System.out.println("Säikeillä on sama iteraattori:");
        
        säie1.start();
        säie2.start();
        
        try{
            säie1.join();
            säie2.join();
        } catch (Exception e) {
            
        }
        
        
        /*
        run:
        Säikeillä on sama iteraattori:
        Säie Säie1: yksi
        Säie Säie1: kolme
        Säie Säie1: neljä
        Säie Säie1: viisi
        Säie Säie1: kuusi
        Säie Säie2: kaksi
        
        Säikeillä on jaettu iteraattori -> Lista käydään vain kerran läpi
        Lisäksi ei voi tietää kumpi säie saa minkäkin iteroitavan elementin
        */
        
        System.out.println("\n\nSäikeillä on omat iteraattorit:");
        
        Iterator i1 = lista.iterator();
        Iterator i2 = lista.iterator();
        
        säie1 = new Säie(i1, "Säie1");
        säie2 = new Säie(i2, "Säie2");
        
        säie1.start();
        säie2.start();
        
        try{
            säie1.join();
            säie2.join();
        } catch (Exception e) {
            
        }
        
        /*
        Säikeillä on omat iteraattorit:
        Säie Säie2: yksi
        Säie Säie2: kaksi
        Säie Säie2: kolme
        Säie Säie2: neljä
        Säie Säie2: viisi
        Säie Säie2: kuusi
        Säie Säie1: yksi
        Säie Säie1: kaksi
        Säie Säie1: kolme
        Säie Säie1: neljä
        Säie Säie1: viisi
        Säie Säie1: kuusi
        
        Molemmilla omat iteraattorit -> molemmat käyvät listan läpi
        */
        
        i = lista.iterator();
        
        while(i.hasNext()) {
            String nextString = (String)i.next();
            System.out.println(nextString);
            if(nextString.equals("kaksi")) {
            //    lista.add("Lisäys kesken iteroinnin");
            }
        }
        
        /*
        Ei voi lisätä kesken iteroinnin...
        
        run:
        yksi
        Exception in thread "main" java.util.ConcurrentModificationException
        kaksi
                at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
                at java.util.ArrayList$Itr.next(ArrayList.java:859)
                at iterator.Main.main(Main.java:94)
        C:\Users\Osku\AppData\Roaming\.tmcbeans\8.2.0\var\cache\executor-snippets\run.xml:53: Java returned: 1
        BUILD FAILED (total time: 0 seconds)
        */
        
        
        
        System.out.println("Remove testaus: ");
        i = lista.iterator();
        while(i.hasNext()) {
            String nextString = (String)i.next();
            System.out.println(nextString);
            if(nextString.equals("kaksi")) {
                i.remove();
            }
        }
        System.out.println("Removen jälkeen: ");
        i = lista.iterator();
        while(i.hasNext()) {
            String nextString = (String)i.next();
            System.out.println(nextString);
            if(nextString.equals("kaksi")) {
                i.remove();
            }
        }
        
        /*
        Remove testaus: 
        yksi
        kaksi
        kolme
        neljä
        viisi
        kuusi
        Removen jälkeen: 
        yksi
        kolme
        neljä
        viisi
        kuusi
        
        
        Remove siis poistaa sen elementin joka juuri iteroidaan.
        */
    }
    
}
