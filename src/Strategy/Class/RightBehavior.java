package Strategy.Class;

import Strategy.Strategy.CarMoveBehavior;

public class RightBehavior implements CarMoveBehavior {
    @Override
    public void move() {
        System.out.println(">> car move to Right");
    }
}
