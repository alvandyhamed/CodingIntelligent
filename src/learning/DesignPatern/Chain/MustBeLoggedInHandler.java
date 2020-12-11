package learning.DesignPatern.Chain;

import java.util.HashMap;

public class MustBeLoggedInHandler extends AbstrachHandler{
    @Override
    public HandlerInterface Handel(  HashMap<String,String> data) {
        System.out.println("Checking that user is logged in");
        if(data.get("user_id")==null){
            try {
                throw new Exception("Must Be Logged in");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }else
        return this.next(data);
    }
}
