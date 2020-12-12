package LeetCode.RunningsumOf1darray;

public class Main {
    public static void main(String[] args) {
        int[] Test={1,2,3,4};
        Solution solution=new Solution();
        Test=solution.runningSum(Test);
        for (int i:Test){
            System.out.println(i);
        }

    }
}
