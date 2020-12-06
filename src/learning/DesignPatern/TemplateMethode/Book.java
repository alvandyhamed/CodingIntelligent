package learning.DesignPatern.TemplateMethode;

public abstract class Book {
    protected String title;
    protected String content;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public abstract String Print();
    public abstract String View();

}
