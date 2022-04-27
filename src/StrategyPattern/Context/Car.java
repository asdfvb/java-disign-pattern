package StrategyPattern.Context;

import StrategyPattern.Strategy.CarMoveBehavior;

public class Car {
    public CarMoveBehavior carMoveBehavior;

    public Car(CarMoveBehavior carMoveBehavior) {
        this.carMoveBehavior = carMoveBehavior;
    }

    public void move(){
        carMoveBehavior.move();
    }
}
