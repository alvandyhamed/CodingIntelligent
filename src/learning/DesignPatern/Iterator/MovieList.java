package learning.DesignPatern.Iterator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MovieList implements CollectionIterator{
    private List<movie> MoviList=new ArrayList<>();
    public void AddMovies (movie movie){
        this.MoviList.add(movie);
    }
    public void RemoveMovies(movie movie){
        this.MoviList.remove(movie);
    }

    public List<movie> getMoviList() {
        return MoviList;
    }

    @Override
    public MoveisItrators CreateNormalIterator() {
        return new NormalMoviesIterator(this);

    }

    @Override
    public MoveisItrators DepfirstIterator() {
        return new DepthFirstMoviesItrator(this);
    }
}
