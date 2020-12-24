package LeetCode.JewelsandStones;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numJewelsInStones(String J, String S) {
        int sum=0;
        Map<Character,Integer> map=new HashMap<>();
        for (char ch: S.toCharArray()) {
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }

        for(int i=0;i<J.length();i++){
            if(map.containsKey(J.charAt(i))){
                sum+=map.get(J.charAt(i));
            }
        }

        return sum;

    }

}
