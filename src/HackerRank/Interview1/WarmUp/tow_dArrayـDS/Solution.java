package HackerRank.Interview1.WarmUp.tow_dArrayـDS;

public class Solution {
    static int hourglassSum(int[][] arr) {
        int max=0;

        for(int  i=1;i<arr.length-1;i++) {

            for (int j = 1; j < arr[i].length - 1; j++) {
               int sum=arr[i][j]+arr[i-1][j]+arr[i+1][j]+arr[i-1][j-1]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j+1];


                if(i==1&&j==1)
                    max=sum;
                else if(sum>max)
                    max=sum;

            }
        }

return max;
    }

}
