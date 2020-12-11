package learning.DesignPatern.Chain;

import java.util.HashMap;

public class MustBeAdminUserHandler extends AbstrachHandler{

    @Override
    public HandlerInterface Handel(  HashMap<String,String> data) {
        System.out.println("Checking that user has Admin!");
        if(data.get("isadmin").equalsIgnoreCase("false")){
            try {
                throw new Exception("Must be admin");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return this.next(data);
    }
}
