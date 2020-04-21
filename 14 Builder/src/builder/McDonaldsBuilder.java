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
public class McDonaldsBuilder extends HampurilaisBuilder {
    public void buildLeipä() {
        hampurilainen.lisääOsa("McLeipä");
    }
    
    public void buildPihvi() {
        hampurilainen.lisääOsa("McPihvi");
    }
    
    public void buildJuusto() {
        hampurilainen.lisääOsa("McJuusto");
    }
    
}
