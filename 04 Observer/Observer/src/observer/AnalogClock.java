/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Osku
 */
public class AnalogClock implements Observer {
    @Override
    public void update(Observable clock, Object time) {
        Double analogTime = (Long)time / 1000.0;
        System.out.println("Current analog time: " + analogTime);
    }
}
