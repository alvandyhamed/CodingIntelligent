package learning.DesignPatern.Iterator;

public class movie {
    private String title;
    private String releaseYear;

    public movie(String title, String releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }
    public void ShowInfo(){
        System.out.println(this.title+"\t"+"("+this.releaseYear+")");

    }

}
