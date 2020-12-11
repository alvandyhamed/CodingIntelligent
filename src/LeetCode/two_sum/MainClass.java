/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * **/

package LeetCode.two_sum;

public class MainClass {
    public static void main(String[] args) {
        int[] test={1,3,2,4};
        int[] answer;
        Solution solution=new Solution();
        BestSolotion bestSolotion=new BestSolotion();
        //int[] temp=solution.twoSum(test,6);
        int[] temp= new int[0];
        try {
            temp = bestSolotion.twoSum(test,6);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]+"");
        }

    }


}
