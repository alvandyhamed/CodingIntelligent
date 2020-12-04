package learning.Solid;
interface Ouput {
    public void printout(String stritem);
}
class printpolty implements Ouput{
    private String fullitem;

    public printpolty() {
    }

    public String getFullitem() {
        return fullitem;
    }

    public void setFullitem(String fullitem) {
        this.fullitem = fullitem;
    }

    @Override
    public void printout(String stritem) {
        System.out.println("Could you Please Print This "+stritem);

    }
}
class printimpolty implements Ouput{
    private String thiscous;

    public printimpolty() {

    }

    public String getThiscous() {
        return thiscous;
    }

    public void setThiscous(String thiscous) {
        this.thiscous = thiscous;
    }

    @Override
    public void printout(String stritem) {
        System.out.println("Go out ,fucking "+stritem);

    }
}
class myrobot{
    private String message;
    public Ouput myoutput;

    public myrobot(String message, Ouput myoutput) {
        this.message = message;
        this.myoutput =  myoutput;
    }
    public void Printrobot(){
        myoutput.printout(message);
    }


}
public class SingleResponsibilty {

    public static void main(String[] args) {

    myrobot myrobot=new myrobot("HAmed",new printpolty());
    myrobot myrobot1=new myrobot("Hasan",new printimpolty());
myrobot.Printrobot();
myrobot1.Printrobot();

    }

}
