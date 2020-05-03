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
public class Memory {
    private byte ram[] = new byte[4096];
    
    public void load(int position, byte[] data, int size) {
        if(position+size > ram.length) {
            System.out.println("Out of memory!!");
            return;
        }
        
        for(int i = position; i < (position+size); ++i) {
            
            ram[i] = data[i];
            
        }
    }
    
    public byte getByte(int address) {
        return ram[address];
    }
}
