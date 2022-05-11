package FactoryMethod;

public class BlackShipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
