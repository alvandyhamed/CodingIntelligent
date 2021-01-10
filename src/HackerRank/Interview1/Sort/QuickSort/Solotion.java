package HackerRank.Interview1.Sort.QuickSort;


import static HackerRank.Interview1.WarmUp.NewYearChaos.Solution.swap;

public class Solotion {
    static int[] Quicksort(int[] arr){
        Quicksort(arr,0,arr.length-1);

        return arr;


    }
    public static void Quicksort(int[] array,int left,int right){
        if(left>=right){
            return;
        }
        int pivot=array[(left+right)/2];
        int index=partition(array,left,right,pivot);
        Quicksort(array,left,index-1);
        Quicksort(array,index,right);
     

    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while (left<=right){
            while (array[left]<pivot){
                left++;
            }
            while (array[right]>pivot) {
                right--;
            }
            if(left<=right){
                swap(array,left,right);
                left++;
                right--;
            }
        }
return left;
    }

}
