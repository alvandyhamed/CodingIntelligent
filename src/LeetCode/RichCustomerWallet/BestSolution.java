package LeetCode.RichCustomerWallet;

import java.util.Arrays;

public class BestSolution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts).mapToInt(a -> Arrays.stream(a).sum()).max().getAsInt();
    }
}
