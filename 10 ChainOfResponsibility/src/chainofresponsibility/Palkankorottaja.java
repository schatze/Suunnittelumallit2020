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
public abstract class Palkankorottaja {
    
    private Palkankorottaja successor;
    
    public void setSuccessor(Palkankorottaja successor) {
        this.successor = successor;
    }
    
    public void processRequest(Palkankorotuspyynto pyynto) {
        if(successor != null) {
            successor.processRequest(pyynto);
        }
    }
    
}
