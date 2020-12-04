package learning.Solid;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.LinkedList;
import java.util.List;
interface shape{
    public double cacluate();
}
class Circle implements shape{
    private Double radious;

    public Circle(Double radious) {
        this.radious = radious;
    }

    public Double getRadious() {
        return radious;
    }

    @Override
    public double cacluate() {
        return (radious*radious*Math.PI);
    }
}
class Sqrtmant implements shape{
    private Double lengthsqr;

    public Sqrtmant(Double lengthsqr) {
        this.lengthsqr = lengthsqr;
    }

    public Double getLengthsqr() {
        return lengthsqr;
    }

    public void setLengthsqr(Double lengthsqr) {
        this.lengthsqr = lengthsqr;
    }

    @Override
    public double cacluate() {
        return lengthsqr*lengthsqr;
    }
}

class Clacllate{
    Double sumcir=0.0;
    public Double calculate_arrr(List<shape> listof){
        for(shape arrcir:listof){
            sumcir+=arrcir.cacluate();
                    }

return sumcir;
    }
}
public class OpenClose {
    public static void main(String[] args) {
        List<shape> circleList=new LinkedList<>();
        shape sh1=new Circle(25.0);
        circleList.add(sh1);
        shape sh2=new Circle(24.5);
        circleList.add(sh2);
        shape sh3=new Circle(25.6);
        circleList.add(sh3);
        shape sq1=new Sqrtmant(4.0);
        circleList.add(sq1);
        shape sq2=new Sqrtmant(5.3);
        circleList.add(sq2);
        shape sq3=new Sqrtmant(9.3);
        circleList.add(sq3);


        Clacllate clacllate=new Clacllate();
        System.out.println("OUT = "+clacllate.calculate_arrr(circleList));

    }
}
