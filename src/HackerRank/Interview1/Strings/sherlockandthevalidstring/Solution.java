package HackerRank.Interview1.Strings.sherlockandthevalidstring;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static String isValid(String s) {

            HashMap<Character, Integer> f = new HashMap<>();

            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(f.containsKey(c)) {
                    f.put(c, f.get(c) + 1);
                }
                else {
                    f.put(c, 1);
                }
            }

            int wrong = 0;
            int c = f.get(s.charAt(0));

            for(Map.Entry<Character, Integer> e: f.entrySet()) {
                if(e.getValue() != c) wrong++;
            }

            return wrong <= 1 ? "YES": "NO";
        }


}
