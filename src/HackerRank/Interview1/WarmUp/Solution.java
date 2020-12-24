package HackerRank.Interview1.WarmUp;

import java.util.Arrays;

public class Solution {
    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int sum=0;
        int conter=0;
        int previos=0;
        for(int i=0;i<n;i++){
            if(i==0){
                previos=ar[i];
                conter++;
            }else{
                if(ar[i]==previos){
                    conter++;
                }else {
                    previos=ar[i];
                    conter=1;
                }
            }
            if(conter%2==0){
                sum++;
            }

        }

        return sum;


    }

}
