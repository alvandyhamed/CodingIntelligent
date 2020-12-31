package HackerRank.Interview1.WarmUp.SherlockandAnagrams;

import java.util.HashMap;

public class Solution {
    static int sherlockAndAnagrams(String s) {
        HashMap<String,Integer> Myhash=new HashMap<>();
        int count=0;
        for(int i=0;i<=s.length();i++){
            for(int j=i+1;j<=s.length();j++){

                String str = s.substring(i,j);
                char[] c = str.toCharArray();        // convert to array of chars
                java.util.Arrays.sort(c);          // sort
                String newString = new String(c);
                int my=0;


                if(Myhash.containsKey(newString)){
                    my=Myhash.get(newString);

                    int key=my+1;
                    count+=key;



                    Myhash.put(newString,key);

                }else


                Myhash.put(newString,my);

            }


        }


        return count;


    }
}
