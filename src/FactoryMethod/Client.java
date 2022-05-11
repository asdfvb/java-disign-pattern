package FactoryMethod;

public class Client {

    public static void main(String[] args) {

        Client client = new Client();

        client.print(new WhiteShipFactory(), "", "jessic32@naver.com");
        client.print(new BlackShipFactory(), "BlackShip", "interfaceit@naver.com");

    }

    private void print(ShipFactory factory, String name, String email) {
        System.out.println(factory.orderShip(name, email));
    }

}
