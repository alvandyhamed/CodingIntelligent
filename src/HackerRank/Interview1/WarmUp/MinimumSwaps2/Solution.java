package HackerRank.Interview1.WarmUp.MinimumSwaps2;

public class Solution {
    static boolean Swap(int[] arr,int i,int j){
        if(arr[j]!=j+1){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            return true;
        }
        return false;

    }
    static int minimumSwaps(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=(i+1)){

                while (arr[i]!=(i+1)){
                    int l=(arr[i]-(i+1));



                    if(Swap(arr,i,i+l))
                    sum++;

                }

            }
        }


return sum;
    }

}
