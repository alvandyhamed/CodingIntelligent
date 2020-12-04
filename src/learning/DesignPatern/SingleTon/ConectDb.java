package learning.DesignPatern.SingleTon;

public class ConectDb {
    private static ConectDb init=null;
    private String Ip="localhos";
    private String port=":50";
    private String user="root";
    private String pas="";

    private ConectDb(){

    }

    public static ConectDb GetInstanse(){
        if(init==null)
            init=new ConectDb();
        return init;
    }

}
