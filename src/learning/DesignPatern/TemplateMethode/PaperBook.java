package learning.DesignPatern.TemplateMethode;

public class PaperBook extends Book {

    public String PrintBookk(){
        return "The Book "+this.title;
    }

    @Override
    public String Print() {
        return null;
    }

    @Override
    public String View() {
        return null;
    }
}
