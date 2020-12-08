package learning.DesignPatern.Composit;

public class MainClass {
    public static void main(String[] args) {
        //group 1
        Form form=new Form("Product","Book","Ehamed.ir");
       form.add(new Input("name","Titlename","String"));
       form.add(new Input("Lname","Titlelname","String"));
       form.add(new Input("nikname","Titlenikename","String"));
//group 2
        FieldSet Picture=new FieldSet("Image","Photo");
        Picture.add(new Input("Caption","icon","PNG"));
        Picture.add(new Input("Caption","mainImage","JPG"));

        /// add to form

        form.add(Picture);

        System.out.println(form.render());






    }
}
