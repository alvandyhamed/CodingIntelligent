package LeetCode.ShuffletheArray;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> arr=new LinkedList<>();

        for(int i=0;i<n;i++){
            arr.add(nums[i]);
            arr.add(nums[n+i]);

        }
return arr.stream().mapToInt(i->i).toArray();
    }
}


