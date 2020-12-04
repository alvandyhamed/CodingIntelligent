package learning.Solid;
interface Coding{
    public void coding();
}
interface Testing{
    public void testing();
}
class Programer implements Coding,Testing{

    @Override
    public void coding() {
System.out.println("We are Coding,please don't talk");
    }

    @Override
    public void testing() {
        System.out.println("We are developer,and we are testing .could you go awAay ?!!!1");

    }
}
class Tester implements Testing{

    @Override
    public void testing() {
        System.out.println("We are testing,please go a way!!!!!");

    }
}
class ProgectManagment {
    public void GoTocoding(Programer hamed){
        hamed.coding();
        hamed.testing();
    }
    public void GoToTesting(Tester Rasaoul){
        Rasaoul.testing();
    }


}

public class InterfaceSeg {
    public static void main(String[] args) {
        ProgectManagment Mina=new ProgectManagment();
        Mina.GoTocoding(new Programer());
        Mina.GoToTesting(new Tester());

    }
}
