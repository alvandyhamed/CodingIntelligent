package learning.Solid;
class Y{
    public void a(int a,int b){
        System.out.println("Sum= "+(a+b));
    }
    public void b(int a,int b){
        System.out.println("Multi= "+(a*b));
    }
}
class X extends Y{}
///یک مثال نقض برای این قانون
class Z extends Y{
    public void a(int a,int b){
        System.out.println("Meha = "+(a-b));
    }
}
public class Liskove {
    public static void main(String[] args) {
        Y y=new Y();
        y.a(2,3);
        X x=new X();
        x.b(5,3);
        Z z=new Z();
        z.a(10,5);

    }
}
