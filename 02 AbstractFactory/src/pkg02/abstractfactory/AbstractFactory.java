/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.abstractfactory;

import pkg02.abstractfactory.Vaatteet.Vaate;

/**
 *
 * @author Osku
 */
public abstract class AbstractFactory {
    abstract Vaate haeVaate(String vaateTyyppi);
}
