package learning.DesignPatern.Decorative.Sample1;

public class DecoSampl1 {
    public static void main(String[] args) {
        Pride p1=new Pride();
        System.out.println("Care price is "+p1.Cost());
        ZevarDar optioin1=new ZevarDar(p1);
        System.out.println("By Option = "+optioin1.Cost()+" Descriptions"+optioin1.Desciptions());
        SundRof option2=new SundRof(optioin1);
        System.out.println("By Option = "+option2.Cost()+" Descriptions"+option2.Desciptions());

    }
}
