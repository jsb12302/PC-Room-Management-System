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
public class Shot extends CondimentDecorator {

    Beverage beverage;

    public Shot(Beverage beverage) {
        super();
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 샷";
    }

    @Override
    public int cost() {
        return beverage.cost() + 500;
    }

}
