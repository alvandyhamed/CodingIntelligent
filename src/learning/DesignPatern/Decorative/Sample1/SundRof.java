package learning.DesignPatern.Decorative.Sample1;

public class SundRof extends CarFeature{
    public SundRof(Care care) {
        super(care);
    }

    @Override
    public String Cost() {
        return this.care.Cost()+"45000";
    }

    @Override
    public String Desciptions() {
        return this.care.Desciptions()+"SUNIMANIIIIIIIIIIIII";
    }
}
