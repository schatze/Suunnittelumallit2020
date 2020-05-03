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
public class VerhoKytkin {
    ICommand cmd;
    
    public VerhoKytkin(ICommand cmd) {
        this.cmd  = cmd;
    }
    
    public void paina() {
        cmd.execute();
    }
}
