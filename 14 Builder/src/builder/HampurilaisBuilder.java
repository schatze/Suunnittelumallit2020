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
public abstract class HampurilaisBuilder {
    protected Hampurilainen hampurilainen;
    
    public Hampurilainen getHampurilainen() {
        return hampurilainen;
    }
    
    public void createNewHampurilainen() {
        hampurilainen = new Hampurilainen();
    }
    
    public abstract void buildLeipä();
    public abstract void buildPihvi();
    public abstract void buildJuusto();
}
