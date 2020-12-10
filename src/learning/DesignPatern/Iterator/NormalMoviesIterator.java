package learning.DesignPatern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class NormalMoviesIterator implements MoveisItrators{
    private int Moviposition=0;
    private List<movie> movieList=new ArrayList();

    public NormalMoviesIterator(MovieList movieList) {
        this.movieList=movieList.getMoviList();

    }

    @Override
    public boolean hasNext() {
        return Moviposition<movieList.size();
    }

    @Override
    public movie getnext() {
        movie temp=movieList.get(Moviposition);
        this.Moviposition++;
        return temp;

    }
}
