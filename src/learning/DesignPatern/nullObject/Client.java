package learning.DesignPatern.nullObject;

public class Client {
    public Request getReq(String command){
        if(command=="A"){
            return new Arequest();
        }else if(command=="B")
            return new Brequest();
        else if(command=="C")
            return new Crequest();
        else return new Nullrequest();
    }
}
