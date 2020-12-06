package learning.DesignPatern.Bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public Color draw() {
        return this.color;

    }
}
