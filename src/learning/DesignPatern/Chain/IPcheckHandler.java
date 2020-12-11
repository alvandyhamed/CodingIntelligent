package learning.DesignPatern.Chain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IPcheckHandler extends AbstrachHandler{
    private ArrayList BANDS_IPS=new ArrayList<String>(
            Arrays.asList("192.168.1.1",
                    "192.0.0.0",
                    "192.172.22.0",
                    "125.25.25.0"
                    )
    );

    @Override
    public HandlerInterface Handel(HashMap<String,String> data) {
        if(BANDS_IPS.indexOf(data.get("IP"))!=-1){
            try {
                throw new Exception("Invalid IP");
            } catch (Exception e) {

            }
            System.out.println("Invalid IP");
        }
        return this.next(data);



    }
}
