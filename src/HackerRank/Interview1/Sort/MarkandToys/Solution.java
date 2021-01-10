package HackerRank.Interview1.Sort.MarkandToys;

import java.util.Arrays;

public class Solution {
    static int maximumToys(int[] prices, int k) {
        int count=0;
        int sum=0;
        Arrays.sort(prices);
        for(int i=0;i<prices.length;i++)
        {
            sum+=prices[i];
            if(sum>k){
                break;
            }else {
                count++;
            }
        }

        return count;


    }
}
