package learning.DesignPatern;
interface Gatways{
    public void SetInfo(String info);
    public void Payment();

}
class ZarinPall implements Gatways{
    protected String info;


    @Override
    public void SetInfo(String info) {
this.info=info;
    }

    @Override
    public void Payment() {
System.out.println("Psrdakh = "+info+" TOMAN ba ZARINPALL");
    }
}
class Melat implements Gatways{
protected String info;
    @Override
    public void SetInfo(String info) {
        this.info=info;

    }

    @Override
    public void Payment() {
        System.out.println("Pardakht = "+info+" TOMAN ba Mellat");

    }
}
class Pay{
    protected String Info;
    public Gatways gatways;

    public Pay(String info, Gatways gatways) {
        Info = info;
        this.gatways = gatways;
    }



    public void PayBy(){
        this.gatways.SetInfo(Info);
        this.gatways.Payment();

    }

}

public class Strateghy {
    public static void main(String[] args) {
        Gatways zarinpa=new ZarinPall();
        Pay pay=new Pay("20000",zarinpa);
        pay.PayBy();
        Pay melatpay=new Pay("350440.04",new Melat());
        melatpay.PayBy();

    }
}
