package HackerRank.Interview1.Sort.BubbleSort;

public class Solution {
    static void countSwaps(int[] a) {
        int cont=0;
        int n=a.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if (a[j] > a[j + 1]) {
                    swap(a,j, j + 1);
                    cont++;
                }

            }
        }

        System.out.println("Array is sorted in "+cont+" swaps.");
        System.out.println(" First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);


    }

    private static void swap(int[] a, int i, int j) {
        if(j<a.length){
            int tem=a[j];
            a[j]=a[i];
            a[i]=tem;
        }



    }


}
