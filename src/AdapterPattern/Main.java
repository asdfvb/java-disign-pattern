package AdapterPattern;

public class Main {
    public static void main(String[] args) {
        Movable bugatiVeyron = new BugattiVeyron();
        MovableAdapter movableAdapter = new MovableAdapterImpl(bugatiVeyron);

        System.out.println(" movableAdapter method with getSpeed : " + movableAdapter.getSpeed());
    }
}
