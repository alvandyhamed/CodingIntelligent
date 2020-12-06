package learning.DesignPatern.Bridge;

public class Circle extends Shape{
    public Circle(Color color) {
        super(color);
    }

    @Override
    public Color draw() {
        return this.color;

    }
}
