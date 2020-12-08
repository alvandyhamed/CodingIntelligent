package learning.DesignPatern.Composit;

public abstract class FormElement {
    protected String name;
    protected String title;
    protected Input data;

    public FormElement(String name, String title) {
        this.name = name;
        this.title = title;
    }

    public String getName() {
        return name;
    }


    public Input getData() {
        return data;
    }

    public void setData(Input data) {
        this.data = data;
    }
    abstract public String render();
}
