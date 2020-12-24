package HackerRank.Interview1.WarmUp.LeftRotation;

public class Solution {

    static int[] rotLeft(int[] a, int d) {
        int[] temp=new int[a.length];


            for (int i = 0; i < a.length; i++) {
                int newposition =i;
                int j=0;
                if ((a.length+d)%2==0)
                    j=0;
                else j=1;

                for(j=j;j<=d;j++){
                    if (newposition + d < a.length) {
                        newposition = newposition + d;
                    } else {
                        newposition = (newposition + d) - a.length;
                    }
                }
                    temp[newposition] = a[i];

            }


return temp;
    }
    static int[] optirotLeft(int[] a,int d){
        int[] arr = new int[a.length];
        int N = a.length;
        for (int i = 0 ; i < N;  i++){
            arr[i] = a[(i+d)%N];
        }
        return arr ;
    }
}
