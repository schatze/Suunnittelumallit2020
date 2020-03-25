/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

import abstractfactory.Vaatteet.Vaate;

/**
 *
 * @author Osku
 */
public abstract class AbstractFactory {
    abstract Vaate haeVaate(String vaateTyyppi);
}
