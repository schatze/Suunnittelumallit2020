/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Osku
 */
public class CharmanderTila implements HahmoState {
    public void hyökkää() {
        System.out.println("Charmander hyökkää pikkasen");
    }
    
    public void väistä() {
        System.out.println("Charmander väistää pikkasen");
    }
    
    public void syö() {
        System.out.println("Charmander syö pikkasen");
    }
}
