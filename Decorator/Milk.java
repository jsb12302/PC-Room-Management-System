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
public class Milk extends CondimentDecorator {

    Beverage beverage;

    public Milk(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",우유";
    }

    public int cost() {
        return beverage.cost() + 500;
    }

}
