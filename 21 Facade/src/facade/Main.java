/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author Osku
 */
public class Main {

    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start();
        System.out.println("\n\nComputer finished boot sequence.");
    }
    
}
