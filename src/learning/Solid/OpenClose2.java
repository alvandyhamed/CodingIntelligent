package learning.Solid;
interface Workable{
    public void work();
}


class Dev implements Workable{

    @Override
    public void work() {
        System.out.println("We have developing !!!");
    }
}
class Test implements Workable{

    @Override
    public void work() {
        System.out.println("We have testing !!!");

    }
}
class Pm  {
    private Workable worker;

    public Pm(Workable worker) {
        this.worker = worker;
    }
    public void goWork(){
        worker.work();
    }
}
public class OpenClose2 {
    public static void main(String[] args) {
        Workable hamed=new Dev();
        Workable rasoul=new Test();
        Pm mina=new Pm(rasoul);
        Pm omid=new Pm(hamed);
        mina.goWork();
        omid.goWork();



    }
}
