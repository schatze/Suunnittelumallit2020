/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;

/**
 *
 * @author Osku
 */
public class Clock extends Observable implements Runnable {
    
    long startTime = 0;
    
    @Override
    public void run() {
        
        startTime = System.currentTimeMillis();
        
        while(true) {
            setChanged();
            
            notifyObservers(System.currentTimeMillis() - startTime);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error Occurred.");
            }
        }
        
    }
}
