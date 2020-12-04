package learning.DesignPatern.Proxy;


public class MainClass {
    public static void main(String[] args) {

        /// This way for a Reading file has a very high and maybe feature makes an issue for a big system.
        ReadFile readFile=new ReadFile("file1.txt");
        System.out.println("My Content has : "+readFile.getContent());
        //  The alternative solution used by Proxy design pattern.
ReadfileProxy readfileProxy=new ReadfileProxy("file1.txt");
        System.out.println("My Content has in Proxy Method: "+readfileProxy.getContent());



    }
}
