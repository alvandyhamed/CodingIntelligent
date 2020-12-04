package learning.DesignPatern.Decorative.Sample1;

public class ZevarDar extends CarFeature {


    public ZevarDar(Care care) {
        super(care);
    }



    @Override
    public String Cost() {
        return this.care.Cost()+1000;
    }

    @Override
    public String Desciptions() {
        return this.care.Desciptions()+" This is Options";
    }
}
