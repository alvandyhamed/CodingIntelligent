package learning.DesignPatern.AbstrackFactoryMethod;

public class Truck implements Transport {
    @Override
    public String Deliver(String Place) {
        return "زمینی به "+Place;
    }
}
