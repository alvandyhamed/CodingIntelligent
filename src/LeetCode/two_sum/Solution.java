package LeetCode.two_sum;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> response=new LinkedList<>();
        for(int i=0;i<nums.length;i++)
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]+nums[j]==target) {
                    response.add(i);
                    response.add(j);
                }

        return response.stream().mapToInt(i->i).toArray();

    }
}
