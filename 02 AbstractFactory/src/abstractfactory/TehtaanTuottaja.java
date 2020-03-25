/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Osku
 */
public class TehtaanTuottaja {
    public static AbstractFactory haeTehdas(String merkki) {
        switch(merkki) {
            case "adidas":
                return new AdidasTehdas();
                
            case "boss":
                return new BossTehdas();
                
            default:
                return null;
        }
    }
}
