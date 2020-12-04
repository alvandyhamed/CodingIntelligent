import java.util.LinkedList;
import java.util.List;

public class ConsecutiveNumbers {
    public static boolean check(List<Long> listd){
        for(int i=0;i<listd.size();i++){
            if(i<listd.size()-1){
                long a=listd.get(i);
                long b=listd.get(i+1);
                b--;
                if(a!=(b)){
                     return false;
                }
            }
        }
        return true;
    }
    public static boolean ascending(String str) {
       int j=1;
       boolean finde=false;
       while (j<str.length()&&!finde){

           List<Long> templist=new LinkedList<Long>();
           if(str.length()%j==0)
               for(int i=0;i<str.length();i=i+j){
                   templist.add(Long.parseLong(str.substring(i, i +j)));
               }

          if(!templist.isEmpty())
              finde=check(templist);
           j++;
       }
        return finde;
    }
    public static void main(String[] args){
        System.out.println(ascending("666667"));
    /*    System.out.println("123456789".substring(0,1));
        System.out.println("123456789".substring(1,2));
        System.out.println("123456789".substring(2,3));
        //////////////////////////////////////
        System.out.println("1112131415".substring(0,2));
        System.out.println("1112131415".substring(2,4));
        System.out.println("1112131415".substring(4,6));
        /////////////////////////////////////
        System.out.println("225226227".substring(0,3));
        System.out.println("225226227".substring(3,6));
        System.out.println("225226227".substring(6,9));*/
       // System.out.println("123456789");
    }
}
