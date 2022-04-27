package StrategyPattern;

import StrategyPattern.Class.BackBehavior;
import StrategyPattern.Class.LeftBehavior;
import StrategyPattern.Class.RightBehavior;
import StrategyPattern.Class.UpBehavior;
import StrategyPattern.Context.Car;
import StrategyPattern.Strategy.CarMoveBehavior;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(new BackBehavior());
        car1.move();

        Car car2 = new Car(new UpBehavior());
        car2.move();

        Car car3 = new Car(new LeftBehavior());
        car3.move();

        Car car4 = new Car(new RightBehavior());
        car4.move();
    }
}
