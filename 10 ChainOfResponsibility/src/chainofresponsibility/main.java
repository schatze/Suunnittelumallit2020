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
public class main {

    public static void main(String[] args) {
        Lahiesimies esimies = new Lahiesimies();
        Päällikkö päällikkö = new Päällikkö();
        Toimitusjohtaja tj = new Toimitusjohtaja();
        esimies.setSuccessor(päällikkö);
        päällikkö.setSuccessor(tj);

        Palkankorotuspyynto p1 = new Palkankorotuspyynto();
        Palkankorotuspyynto p2 = new Palkankorotuspyynto();
        Palkankorotuspyynto p3 = new Palkankorotuspyynto();

        p1.setProsenttimäärä(0.01);
        p2.setProsenttimäärä(0.03);
        p3.setProsenttimäärä(2);

        esimies.processRequest(p1);
        esimies.processRequest(p2);
        esimies.processRequest(p3);
    }

}
