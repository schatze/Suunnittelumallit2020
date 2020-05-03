/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command;

/**
 *
 * @author Osku
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Verhot verhot = new Verhot();
        
        ICommand alasCommand = new VerhotAlasCommand(verhot);
        ICommand ylösCommand = new VerhotYlösCommand(verhot);
        
        VerhoKytkin alasKytkin = new VerhoKytkin(alasCommand);
        VerhoKytkin ylösKytkin = new VerhoKytkin(ylösCommand);
        
        ylösKytkin.paina();
        alasKytkin.paina();
    }
    
}
