package learning.DesignPatern.FactoryMethod;

public class SeaLogestic extends Logistic{
    @Override
    public Transport CreatTransport() {
        return new Ship();
    }
}
