package learning.DesignPatern.Iterator;

public class MainClass {
    public static void main(String[] args) {

        MovieList movieList=new MovieList();
        movieList.AddMovies(new movie("Inception","2010"));
        movieList.AddMovies(new movie("Avatar","2009"));
        movieList.AddMovies(new movie("Man","2013"));
        movieList.AddMovies(new movie("Up","2009"));

        //Simple Iterator
        for (movie mitem:
                movieList.getMoviList()
             ) {
            mitem.ShowInfo();
        }
        /// Other Iterator
        MoveisItrators moveisItrators=movieList.CreateNormalIterator();
        while (moveisItrators.hasNext()){
            movie movitemp=moveisItrators.getnext();
            movitemp.ShowInfo();

        }

    }
}
