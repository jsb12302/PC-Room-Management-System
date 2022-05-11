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
public class Coffee extends Beverage {

    public Coffee() {
        super();
        description = "커피";
    }

    public int cost() {
        return 2000;
    }

}
