package FactoryMethod;

public interface ShipFactory {
    default Ship orderShip(String name, String email){
        validate(name,email);

        prepareFor(name);

        createShip();

        sendEmailTo(email, new Ship());
        return new Ship();
    }

    Ship createShip();

    void validate(String name,String email);

    void prepareFor(String name);

    void sendEmailTo(String email, Ship ship);
}
