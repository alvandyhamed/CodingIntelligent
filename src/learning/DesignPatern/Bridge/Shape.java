package learning.DesignPatern.Bridge;

public abstract class Shape {
    protected double width;
    protected double height;
    protected Color color;

    public Shape(Color color) {
        this.color=color;
    }
    public void ChangeColor(Color color){
        this.color=color;
    }

    abstract public Color draw();
}
