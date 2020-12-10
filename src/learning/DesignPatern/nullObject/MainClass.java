package learning.DesignPatern.nullObject;

public class MainClass {
    public static void main(String[] args) {
        Client Aclient=new Client();
        System.out.println(
                Aclient.getReq("A").execute());
        Client nullclient=new Client();
        System.out.println(
                Aclient.getReq("Hamed").execute());


    }
}
