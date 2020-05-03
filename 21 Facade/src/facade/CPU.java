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
public class CPU {
    int ip = 0;
    boolean running = false;
    
    Memory mem;
    
    public CPU(Memory memory) {
        mem = memory;
    }
    
    public void freeze() {
        running = false;
    }
    
    public void jump(int position) {
        ip = position;
    }
    
    public void execute() {
        byte nextByte = mem.getByte(ip);
        ip++;
        System.out.print(String.format("%2X", Byte.toUnsignedInt(nextByte)) + " ");
    }
}
