/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.Random;

/**
 *
 * @author Osku
 */
public class Arvuuttaja {

    Random rand = new Random();

    public synchronized Memento liityPeliin(Arvaaja arvaaja) {
        int luku = rand.nextInt(99) + 1;

        return new Memento(luku);
    }

    public synchronized boolean tarkista(Object o, int arvaus) {
        Memento memento = (Memento)o;
        
        if (memento.getState() == arvaus) {
            return true;
        } else {
            return false;
        }

    }

    private class Memento {

        private int state;

        public Memento(int state) {
            this.state = state;
        }

        public int getState() {
            return state;
        }
    }
}
