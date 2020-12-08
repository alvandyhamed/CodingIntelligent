package learning.DesignPatern.Composit;

public class Input extends FormElement{
    private String type;
    public Input(String name, String title,String type) {
        super(name, title);
        this.type=type;
    }

    @Override
    public String render() {

        return "<Edittext>Input as "+type+"::"+name+"</Edittext>";

    }
}
