package LeetCode.RichCustomerWallet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        List<Integer> ammountlist=new LinkedList<>();
        for (int i=0;i<accounts.length;i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            ammountlist.add(sum);
        }
        return Collections.max(ammountlist);

    }

}
