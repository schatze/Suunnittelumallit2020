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
public class HesburgerBuilder extends HampurilaisBuilder {
    public void buildLeipä() {
        hampurilainen.lisääOsa(new Leipä());
    }
    
    public void buildPihvi() {
        hampurilainen.lisääOsa(new Pihvi());
    }
    
    public void buildJuusto() {
        hampurilainen.lisääOsa(new Juusto());
    }
    
}
