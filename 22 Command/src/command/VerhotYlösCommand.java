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
public class VerhotYlösCommand implements ICommand {
    
    private Verhot verhot;
    
    public VerhotYlösCommand(Verhot verhot) {
        this.verhot = verhot;
    }
    
    public void execute() {
        verhot.verhotYlös();
    }
}
