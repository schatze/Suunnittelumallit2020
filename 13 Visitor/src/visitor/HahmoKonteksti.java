/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Osku
 */
public class HahmoKonteksti implements HahmoState {
    private HahmoState state;
    private HahmoVisitor visitor;
    int xp = 0;
    
    public HahmoKonteksti(HahmoVisitor visitor) {
        this.visitor = visitor;
        visitor.visit(this);
    }
    
    public void setState(HahmoState state) {
        this.state = state;
    }
    
    public HahmoState getState() {
        return this.state;
    }
    
    public void hyökkää() {
        this.state.hyökkää();
        xp += 100;
        visitor.visit(this);
    }
    
    public void väistä() {
        this.state.väistä();
        xp += 50;
        visitor.visit(this);
    }
    
    public void syö() {
        this.state.syö();
        xp += 20;
        visitor.visit(this);
    }
    
    public int getXp() {
        return xp;
    }
}
