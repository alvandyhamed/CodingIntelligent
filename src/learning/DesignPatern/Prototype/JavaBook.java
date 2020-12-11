package learning.DesignPatern.Prototype;

public class JavaBook extends Book implements Prototype{
    public JavaBook(){
        this.Topic="Java";
    }

    @Override
    public Object Clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
return null;
    }
}
