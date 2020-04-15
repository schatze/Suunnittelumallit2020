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
public class CharmeleonTila implements HahmoState {
    public void hyökkää() {
        System.out.println("Charmeleon hyökkää");
    }
    
    public void väistä() {
        System.out.println("Charmeleon väistää");
    }
    
    public void syö() {
        System.out.println("Charmeleon syö");
    }
}
