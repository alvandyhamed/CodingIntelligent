package learning.DesignPatern.TemplateMethode;

public class Ebook extends Book {
    @Override
    public String Print() {
        return null;
    }

    @Override
    public String View() {
        return null;
    }

    public String GeneratePDF(){
        return "The Book "+this.title;
    }
}
