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
public class main {

    public static void main(String[] args) {
        HahmoKontekstiVisitor visitor = new HahmoKontekstiVisitor();
        HahmoKonteksti hahmo1 = new HahmoKonteksti(visitor);
        HahmoKonteksti hahmo2 = new HahmoKonteksti(visitor);
        
        System.out.println("Hahmo 1: \n");
        
        hahmo1.hyökkää();
        hahmo1.hyökkää();
        hahmo1.väistä();
        hahmo1.väistä();
        hahmo1.syö();
        hahmo1.väistä();
        hahmo1.hyökkää();
        hahmo1.syö();
        
        System.out.println("\n\nHahmo 2: \n\n");
        
        hahmo2.väistä();
        hahmo2.syö();
        hahmo2.väistä();
        hahmo2.hyökkää();
        hahmo2.syö();
        hahmo2.väistä();
        hahmo2.hyökkää();
        hahmo2.väistä();
        hahmo2.hyökkää();
        
    }
    
}
