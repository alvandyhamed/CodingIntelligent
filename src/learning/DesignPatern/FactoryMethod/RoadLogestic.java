package learning.DesignPatern.FactoryMethod;

public class RoadLogestic extends Logistic {
    @Override
    public Transport CreatTransport() {
        return new Truck();
    }
}
