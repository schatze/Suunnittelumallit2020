/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.method;

/**
 *
 * @author Osku
 */
public class Main {

    
    public static void main(String[] args) {
        Game ksp = new KSP();
        for(int i = 0; i < 3; ++i) {
            ksp.playOneGame(2);
        }
        
    }
    
}