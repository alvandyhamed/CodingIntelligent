package learning.DesignPatern.Iterator;

import java.util.ArrayList;
import java.util.List;

public interface CollectionIterator {
    public MoveisItrators CreateNormalIterator();
    public MoveisItrators DepfirstIterator();
}
