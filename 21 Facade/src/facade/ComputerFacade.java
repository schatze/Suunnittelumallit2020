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
public class ComputerFacade {
    private final CPU processor;
    private final Memory ram;
    private final HardDrive hd;
    
    private static final int BOOT_ADDRESS = 0;
    private static final int BOOT_SECTOR = 0;
    private static final int SECTOR_SIZE = 1024;

    public ComputerFacade() {
        this.ram = new Memory();
        this.hd = new HardDrive();
        this.processor = new CPU(ram);
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE), SECTOR_SIZE);
        processor.jump(BOOT_ADDRESS);
        
        System.out.println("Loaded boot sequence. Starting execution (bytes that are executed): ");
        
        for(int i = 0; i < SECTOR_SIZE; ++i) {
            processor.execute();
            if(i%16==0 && i > 0)
                System.out.print("\n");
        }
        
    }
}
