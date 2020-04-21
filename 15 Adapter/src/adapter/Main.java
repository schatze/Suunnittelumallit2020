/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author Osku
 */
public class Main {

    public static void main(String[] args) {
        Opiskelija opiskelija = new Opiskelija();
        
        Kotitehtävä tehtävä1 = new Kotitehtävä("Helppo tehtävä");
        Kotitehtävä tehtävä2 = new Kotitehtävä("Vaikea tehtävä");
        
        Olut olut1 = new Olut("Köstritzer");
        Olut olut2 = new Olut("Astra");
        
        opiskelija.lisääTehtävä(tehtävä1);
        opiskelija.lisääTehtävä(tehtävä2);
        opiskelija.lisääTehtävä(new OlutAdapteri(olut1));
        opiskelija.lisääTehtävä(new OlutAdapteri(olut2));

        opiskelija.teeTehtävät();
    }
    
}
