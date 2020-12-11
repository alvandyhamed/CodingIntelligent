package learning.DesignPatern.Chain;

import java.util.HashMap;

public abstract class AbstrachHandler implements HandlerInterface{
    protected HandlerInterface next;

    @Override
    public HandlerInterface setNext(HandlerInterface next) {
        this.next = next;
        return next;
    }

    @Override
    public HandlerInterface next(HashMap<String,String> data) {
        if(this.next!=null){
            return this.next.Handel(data);
                    }else
                        return null;

    }
}
