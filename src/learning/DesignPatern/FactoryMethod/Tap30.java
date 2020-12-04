package learning.DesignPatern.FactoryMethod;

public class Tap30 {
    public static void main(String[] args) {
        RoadLogestic roadLogestic=new RoadLogestic();
        SeaLogestic seaLogestic=new SeaLogestic();


        System.out.println(roadLogestic.PlaneDelivar("تهران"));
        System.out.println(roadLogestic.PlaneDelivar("مشهد"));
        System.out.println(seaLogestic.PlaneDelivar("تویسرکان"));


    }
}
