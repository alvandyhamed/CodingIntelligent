package HackerRank.Interview1.WarmUp.Jumpinglouds;

public class Solution {
    static int jumpingOnClouds(int[] c) {
        int jump=0;
        int i=0;
        while (i<c.length-1){
            if(i+2<=c.length-1){

                if(c[i+2]==0){
                    jump++;
                    i+=2;


                }else if(c[i+1]==0){
                    jump++;
                    i++;

                }

            }else if(i+1<=c.length-1){
                System.out.println(i);
                if(c[i+1]==0){
                    jump++;
                    i++;
                }

            }

        }


return jump;
    }
}
