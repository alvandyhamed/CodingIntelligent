package learning.DesignPatern.FactoryMethod;

public class Ship implements Transport {
    @Override
    public String Deliver(String Place) {
        return "دریایی به "+Place;
    }
}
