/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.method;

import java.util.Random;

/**
 *
 * @author Osku
 */
public class KSP extends Game {
    
    /**
     *  1 = kivi
     *  2 = paperi
     *  3 = sakset
     */
    int[] kädet;
    int roundsPlayed = 0;
    
    String gameStatus = "";
    
    Random rand;
    
    @Override
    void initializeGame() {
        playersCount = 2;       // KSP pelataan kahdestaan
        kädet = new int[playersCount];
        rand = new Random();
        roundsPlayed = 0;
    }
    
    @Override
    void makePlay(int player) {
        kädet[player] = rand.nextInt(3) + 1;
        switch(kädet[player]) {
            case 1:
                System.out.println("Player " + (player+1) + " got rock.");
                break;
                
            case 2:
                System.out.println("Player " + (player+1) + " got paper.");
                break;
                
            case 3:
                System.out.println("Player " + (player+1) + " got scissors.");
                break;
        }
    }
    
    @Override 
    boolean endOfGame() {
        
        
        if( (kädet[0] == 1 && kädet[1] == 3) ||     // Kivi voittaa sakset
            (kädet[0] == 3 && kädet[1] == 2) ||     // sakset voittaa paperin
            (kädet[0] == 2 && kädet[1] == 1)) {     // paperi voittaa kiven
            gameStatus = "Player 1 wins";
        } else {
            gameStatus = "Player 2 wins";
        }
        
        if(kädet[0] == kädet[1]) {
            gameStatus = "Tie";
        }
        
        roundsPlayed++;
        if(roundsPlayed == playersCount+1) 
            return true;
        else
            return false;
    }
    
    @Override
    void printWinner() {
        System.out.println(gameStatus + "\n");
    }
    
    
}
