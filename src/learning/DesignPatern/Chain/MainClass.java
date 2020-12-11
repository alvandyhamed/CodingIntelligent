package learning.DesignPatern.Chain;

import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {
        HashMap<String,String> user =new HashMap<>();
        user.put("IP","191.168.1.1");
        user.put("requested_url","Home");
        user.put("user_id","123");
        user.put("isadmin","true");

        IPcheckHandler iPcheckHandler=new IPcheckHandler();
        MustBeLoggedInHandler mustBeLoggedInHandler=new MustBeLoggedInHandler();
        MustBeAdminUserHandler mustBeAdminUserHandler=new MustBeAdminUserHandler();

        iPcheckHandler.
                setNext(mustBeLoggedInHandler.
                        setNext(mustBeAdminUserHandler
                        ));
        iPcheckHandler.Handel(user);




    }
}
