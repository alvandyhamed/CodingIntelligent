package learning.DesignPatern.Chain;

import java.util.HashMap;

public interface HandlerInterface {
    public HandlerInterface setNext(HandlerInterface next);
    public HandlerInterface Handel( HashMap<String,String> data);
    public HandlerInterface next (  HashMap<String,String> data);
}
