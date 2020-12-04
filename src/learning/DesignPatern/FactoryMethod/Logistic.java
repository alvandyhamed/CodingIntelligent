package learning.DesignPatern.FactoryMethod;
 abstract class Logistic {
     abstract public Transport CreatTransport();
     public String PlaneDelivar(String plane){
         return this.CreatTransport().Deliver(plane);
     }
}



