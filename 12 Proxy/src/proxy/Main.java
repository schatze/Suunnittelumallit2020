/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Osku
 */
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        List<Image> kuvat = new ArrayList<Image>();
        
        for(int i = 0; i < 20; ++i) {
            Image img = new ProxyImage("Image"+i);
            kuvat.add(img);
        }
        
        for(Image img : kuvat) {
            img.showData();
        }
        
        for(int i = 0; i < 50; ++i) {
            kuvat.get(rand.nextInt(kuvat.size())).displayImage();
        }
    }
    
}
