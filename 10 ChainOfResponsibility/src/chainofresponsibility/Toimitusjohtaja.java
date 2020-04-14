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
public class Toimitusjohtaja extends Palkankorottaja {

    public void processRequest(Palkankorotuspyynto pyyntö) {
        if (Math.random() * 99 + 1 > 50) {
            System.out.println("Toimitusjohtaja myöntää " + pyyntö.getProsenttimäärä() * 100 + "% palkankorotuksen");
        } else {
            System.out.println("Toimitusjohtaja ei myönnä " + pyyntö.getProsenttimäärä() * 100 + "% palkankorotusta");
        }
    }

}
