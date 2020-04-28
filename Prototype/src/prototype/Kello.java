/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author Osku
 */
public abstract class Kello implements Cloneable {
    protected int ajastin = 0;
    
    public abstract void kelloKäy();
    
    public int getAika() {
        return ajastin;
    }
    
    public void setAika(int aika) {
        ajastin = aika;
    }
    
    public Object clone() {
      Object clone = null;
      
      try {
         clone = super.clone();
         
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      
      return clone;
   }
}
