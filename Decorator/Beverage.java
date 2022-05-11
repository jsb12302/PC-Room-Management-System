/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author PureSnake
 */
public abstract class Beverage {

    String description = "no title";

    public abstract int cost();

    public String getDescription() {
        return description;
    }

}
