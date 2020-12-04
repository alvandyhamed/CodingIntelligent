package learning.DesignPatern.Observe;

import java.util.LinkedList;
import java.util.List;

interface IObserabl{
    public void Register(IObser iObser);
    public void Unregister(IObser iObser);
    public void Notify();

}
interface IObser{
    public void Update(IObserabl iObserabl);

}
class Publisher implements IObserabl{
    protected String Event;
    List<IObser> ObserverList;
    public Publisher(){
        ObserverList=new LinkedList<>();
    }
    @Override
    public void Register(IObser iObser) {
        ObserverList.add(iObser);


    }

    @Override
    public void Unregister(IObser iObser) {
        ObserverList.remove(iObser);

    }

    @Override
    public void Notify() {
        for(IObser ob:ObserverList){
            ob.Update(this);

        }

    }


    public String getEvent() {
        return Event;
    }

    public List<IObser> getObservs(){
        return ObserverList;
    }

    public void setEvent(String event) {
        Event = event;
        this.Notify();
    }


}
class Setvices implements IObser{
    protected String name;
    protected int Priorty;
    @Override
    public void Update(IObserabl iObserabl) {
      //  System.out.println(this.name+" ==>"+iObserabl.getEvent());

    }
    public Setvices(String name, int priorty) {
        this.name = name;
        Priorty = priorty;
    }


}
public class Observ {
    public static void main(String[] args) {
        Publisher Notify=new Publisher();

        IObser s1=new Setvices("S1",0);
        IObser s2=new Setvices("S2",1);
        IObser s3=new Setvices("S3",2);

        Notify.Register(s1);
        Notify.Register(s2);
        Notify.Register(s3);
        Notify.setEvent("Dooo somtings");
        Notify.Unregister(s2);
        Notify.setEvent("Dooo somtingElse");


    }
}
