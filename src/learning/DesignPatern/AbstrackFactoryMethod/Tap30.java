package learning.DesignPatern.AbstrackFactoryMethod;

public class Tap30 {
    public static void main(String[] args) {
      Factory factory=new Factory();



        System.out.println(factory.CreateRoad().Deliver("مشهد"));
        System.out.println(factory.CreateSea().Deliver("Italy"));
        System.out.println(factory.CreateSea().Deliver("تهران"));


    }
}
