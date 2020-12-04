import java.lang.reflect.Array;
import java.util.*;

public class HelloWorl {
    public static String encrypt(String plncode, String pad) {
        String finalstring="63719";
        for(int i=0;i<plncode.length();i++){
            int a=Integer.parseInt(plncode.charAt(i)+"");
            int b=Integer.parseInt(pad.charAt(i+5)+"");
            if(a>b){

                finalstring+=a-b+"";
            }else {
                finalstring+=(((((a-b)%10))+10)%10)+"";
            }

        }

        return finalstring;

    }
    public static String decrypt(String cypcode, String pad) {
        String finalstr="";
        String substring =pad.substring(0,5);
        if(!substring.equalsIgnoreCase("63719")){
         return "Error: Key IDs don't match.";
}

        for(int i=5;i<cypcode.length();i++){
            int a=Integer.parseInt(cypcode.charAt(i)+"");
            int b=Integer.parseInt(pad.charAt(i)+"");
            finalstr+=((a+b)%10)+"";
        }
        return finalstr;

    }


    public static void main(String[] args){
        int i = (((-6 % 10) + 10) % 10);

        System.out.println("_"+

                encrypt("24955184247696969","637197877682780836504704874690100607768768"));
System.out.println(decrypt("6371956289367449331922","637197877682780836504704874690100607768768"));
    }




}
