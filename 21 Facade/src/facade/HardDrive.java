/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Osku
 */
public class HardDrive {
    private byte hdd[] = new byte[16384];
    
    public HardDrive() {
        Random rand = new Random();
        
        for(int i = 0; i < hdd.length; ++i) {
            hdd[i] = (byte)rand.nextInt(0xFF);
        }
    }
    
    public byte[] read(int lba, int size) {
        if(lba+size > hdd.length) {
            System.out.println("HDD read overflow!");
            return null;
        }
        
        return Arrays.copyOfRange(hdd, lba, lba+size);
    }
}
