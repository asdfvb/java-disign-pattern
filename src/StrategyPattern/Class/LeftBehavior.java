package StrategyPattern.Class;

import StrategyPattern.Strategy.CarMoveBehavior;

public class LeftBehavior implements CarMoveBehavior {
    @Override
    public void move() {
        System.out.println(">> car move to Left");
    }
}
