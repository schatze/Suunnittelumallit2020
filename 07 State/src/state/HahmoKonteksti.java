/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author Osku
 */
public class HahmoKonteksti implements HahmoState {
    private HahmoState state;
    
    public void setState(HahmoState state) {
        this.state = state;
    }
    
    public HahmoState getState() {
        return this.state;
    }
    
    public void hyökkää() {
        this.state.hyökkää();
    }
    
    public void väistä() {
        this.state.väistä();
    }
    
    public void syö() {
        this.state.syö();
    }
}
