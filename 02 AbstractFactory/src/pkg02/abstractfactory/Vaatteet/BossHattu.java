/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.abstractfactory.Vaatteet;

/**
 *
 * @author Osku
 */
public class BossHattu implements Vaate{
    
    public void pue() {
        System.out.println("Bossin hattu puettu!");
    }
    
    public String toString() {
        return "Boss hattu";
    }
}