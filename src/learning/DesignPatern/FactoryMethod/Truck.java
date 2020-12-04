package learning.DesignPatern.FactoryMethod;

public class Truck implements Transport {
    @Override
    public String Deliver(String Place) {
        return "زمینی به "+Place;
    }
}
