package LeetCode.JewelsandStones;

import java.util.*;

/**You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

        The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

        Example 1:

        Input: J = "aA", S = "aAAbbbb"
        Output: 3
        Example 2:

        Input: J = "z", S = "ZZ"
        Output: 0
        Note:

        S and J will consist of letters and have length at most 50.
        The characters in J are distinct.**/
public class Main {
    public static void main(String[] args) {
        String temp="HaamedAdali";
        String find="Ab";
        Map<Character,Integer> map=new HashMap<>();
        for (char ch: temp.toCharArray()) {
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }

        }
        //System.out.println(map.containsValue());

        Solution solution=new Solution();
        System.out.println(solution.numJewelsInStones("z","ZZ"));











    }


}
