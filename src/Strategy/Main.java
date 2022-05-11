package Strategy;

import Strategy.Class.BackBehavior;
import Strategy.Class.LeftBehavior;
import Strategy.Class.RightBehavior;
import Strategy.Class.UpBehavior;
import Strategy.Context.Car;

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
