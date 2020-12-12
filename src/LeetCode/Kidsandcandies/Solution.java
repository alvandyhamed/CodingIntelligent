package LeetCode.Kidsandcandies;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int Max= Arrays.stream(candies).max().getAsInt();
        List<Boolean> temp=new LinkedList<>();
        for(int i:candies){
            if(i+extraCandies>=Max)
                temp.add(true);
            else temp.add(false);
        }

        return temp;
    }
}


