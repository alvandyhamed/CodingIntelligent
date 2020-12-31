package HackerRank.Interview1.WarmUp.TwoStrings;

import java.util.Hashtable;

public class Solution {
    static String twoStrings(String s1, String s2) {
        boolean yes=false;
        Hashtable <Character,Integer> S1=new Hashtable<Character, Integer>();
        for(int i=0;i<s1.length();i++){
            S1.put(s1.charAt(i),0);

        }
        for(int i=0;i<s2.length();i++){
            if(S1.containsKey(s2.charAt(i))){
                yes=true;
                break;
            }
        }
        if(yes){
            return "YES";

        }else
            return "NO";

    }

}
