/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Osku
 */
public class Waiter {
    private HampurilaisBuilder builder;
    
    public void setBuilder(HampurilaisBuilder hambuilder) {
        builder = hambuilder;
    }
    
    public Hampurilainen getHampurilainen() {
        return builder.getHampurilainen();
    }
    
    public void constructHamburger() {
        builder.createNewHampurilainen();
        builder.buildLeipä();
        builder.buildPihvi();
        builder.buildJuusto();
    }
}
