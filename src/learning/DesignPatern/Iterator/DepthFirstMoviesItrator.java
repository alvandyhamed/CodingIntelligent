package learning.DesignPatern.Iterator;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstMoviesItrator implements MoveisItrators{
    private int Moviposition=0;
    private List<movie> movieList=new ArrayList();

    public DepthFirstMoviesItrator(MovieList movieList) {
        this.movieList=movieList.getMoviList();

    }
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public movie getnext() {
        return null;
    }
}
