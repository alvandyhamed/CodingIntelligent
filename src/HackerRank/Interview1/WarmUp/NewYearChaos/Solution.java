package HackerRank.Interview1.WarmUp.NewYearChaos;

import java.util.Arrays;

public class Solution {
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void minimumBribes(int[] q) {
        int sum=0;
        boolean toochaotic=false;
     for(int i=q.length-1;i>=0;i--){
         if(q[i]!=i+1){
             if(q[i-1]==(i+1)){
                 sum++;
                 swap(q,i,i-1);

             }else if(q[i-2]==(i+1)){
                 sum+=2;
                 swap(q,i-2,i-1);
                 swap(q,i-1,i);
             }else {
                 toochaotic=true;
                 break;
             }
         }

     }
     if(toochaotic)
     {
         System.out.println("Too chaotic");
     }else System.out.println(sum);


    }
}
