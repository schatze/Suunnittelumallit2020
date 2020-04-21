/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Osku
 */
public class Opiskelija {
    private List<IKotitehtävä> tehtävät = new ArrayList();
    
    public void lisääTehtävä(IKotitehtävä tehtävä) {
        tehtävät.add(tehtävä);
    }
    
    public void teeTehtävät() {
        for(IKotitehtävä t : tehtävät) {
            t.teeTehtävä();
        }
    }
}
