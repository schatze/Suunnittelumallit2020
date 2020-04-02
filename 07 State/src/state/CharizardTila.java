/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Osku
 */
public class CharizardTila implements HahmoState {
    public void hyökkää() {
        System.out.println("Charizard hyökkää kovaa");
    }
    
    public void väistä() {
        System.out.println("Charizard väistää nopeasti");
    }
    
    public void syö() {
        System.out.println("Charizard syö paljon");
    }
}
