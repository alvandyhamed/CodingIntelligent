package learning.DesignPatern.Composit;

public class FieldSet extends FieldComposite{
    public FieldSet(String name, String title) {
        super(name, title);
    }

    @Override
    public String render() {

        String out=super.render();

        return "<Tit>"+this.title+"</Tit>/t"+"<Field>"+out+"</Field>\n";
    }
}
