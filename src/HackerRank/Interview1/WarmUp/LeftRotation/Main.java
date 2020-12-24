package HackerRank.Interview1.WarmUp.LeftRotation;

public class Main {

    public static void main(String[] args) {
      //  int arr[]=Solution.rotLeft(new int[]{1,2,3,4,5},4);
       // int arr[]=Solution.rotLeft(new int[]{41,73,89,7,10,1,59,58,84,77,77,97,58,1,86,58,26,10,86,51},10);
       // int arr[]=Solution.rotLeft(new int[]{33,47,70,37,8,53,13,93,71,72,51,100,60,87,97},13);
        int arr[]=Solution.optirotLeft(new int[]{33,47,70,37,8,53,13,93,71,72,51,100,60,87,97},13);
        System.out.print("{");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.print("}");


    }
}
