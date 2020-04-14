/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

/**
 *
 * @author Osku
 */
public class Lahiesimies extends Palkankorottaja {
    
    double valtuusraja = 0.02;
    
    public void processRequest(Palkankorotuspyynto pyyntö) {
        if(pyyntö.getProsenttimäärä() < valtuusraja) {
            if(Math.random() * 99 + 1 > 50) {
                System.out.println("Lähiesimies myöntää " + pyyntö.getProsenttimäärä()*100 + "% palkankorotuksen");
            } else {
                System.out.println("Lähiesimies ei myönnä " + pyyntö.getProsenttimäärä()*100 + "% palkankorotusta");
            }
            
        } else {
            super.processRequest(pyyntö);
        }
    }
    
}
