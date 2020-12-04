package learning.DesignPatern.AbstrackFactoryMethod;

public class Factory extends Logistic {
    @Override
    public Transport CreateRoad() {
        return new Truck();
    }

    @Override
    public Transport CreateSea() {
        return new Ship();
    }
}
