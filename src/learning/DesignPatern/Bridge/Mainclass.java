package learning.DesignPatern.Bridge;

public class Mainclass {
    public static void main(String[] args) {
        Red red=new Red();
        Blue blue=new Blue();

        Circle circleone=new Circle(red);
        System.out.println("__"+circleone.draw());
        circleone.ChangeColor(blue);
        System.out.println("___"+circleone.draw());

    }
}
