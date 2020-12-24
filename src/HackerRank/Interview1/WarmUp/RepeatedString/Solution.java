package HackerRank.Interview1.WarmUp.RepeatedString;

public class Solution {
    static long repeatedString(String s, long n) {
        long conta=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                conta++;
            }
        }
        long div=n/s.length();
        long repeted=n%s.length();
        long multi=div*conta;
        for(int i=0;i<repeted;i++){
            if(s.charAt(i)=='a'){
                multi++;
            }
        }




        return multi;


    }
}
