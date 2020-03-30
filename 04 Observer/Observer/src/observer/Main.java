/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Osku
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clock clock = new Clock();
        DigitalClock digitalClock = new DigitalClock();
        AnalogClock analogClock = new AnalogClock();
        
        clock.addObserver(digitalClock);
        clock.addObserver(analogClock);
        
        clock.run();
    }
    
}
