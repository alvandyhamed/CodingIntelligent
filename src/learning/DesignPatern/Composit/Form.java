package learning.DesignPatern.Composit;



public class Form extends FieldComposite{
    protected String Url;
    public Form(String name, String title,String Url) {
        super(name, title);
        this.Url=Url;
    }

    @Override
    public String render() {
        String out= super.render();
        return "<Tit>"+
                out+
                "<Form>" +
                "" +
                "GoTo\t"+this.Url+
                "</Form>\n"+
                "</Tit>\n"

                ;
    }
}
