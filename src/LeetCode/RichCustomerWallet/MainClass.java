package LeetCode.RichCustomerWallet;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.IntStream;

public class MainClass {
    public static void main(String[] args) {
        int test[][]={{1,2,5,3},{4,6,7},{9,3,1,5,0,2}};
        Solution solution=new Solution();
        BestSolution bestSolution=new BestSolution();
        long startTime = System.nanoTime();
        System.out.println("Max Customer"+solution.maximumWealth(test));
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime/1000d);

        long startTimex = System.nanoTime();

        System.out.println("Max Customer"+bestSolution.maximumWealth(test));
        long endTimeex   = System.nanoTime();
        long totalTimeex = endTimeex - startTimex;
        System.out.println(totalTimeex/1000d);



    }
}
