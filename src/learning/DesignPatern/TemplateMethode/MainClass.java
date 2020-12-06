package learning.DesignPatern.TemplateMethode;

public class MainClass {
    public static void main(String[] args) {
        PaperBook paperBook=new PaperBook();
        paperBook.setTitle("Hamed");
        paperBook.setContent("------***---**");
        paperBook.Print();
    }
}
