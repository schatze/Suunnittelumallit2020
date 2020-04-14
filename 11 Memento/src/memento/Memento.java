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
public class Memento {
    private int state;  
  
    public Memento(int state) {  
        this.state=state;  
    }  
    public int getState() {  
        return state;  
    }  
}
