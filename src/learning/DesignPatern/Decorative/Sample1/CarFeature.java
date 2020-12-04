package learning.DesignPatern.Decorative.Sample1;

abstract class CarFeature  implements Care{
    protected Care care;

    public CarFeature(Care care) {
        this.care = care;
    }
    public abstract String Cost();
    public abstract String Desciptions();
}
