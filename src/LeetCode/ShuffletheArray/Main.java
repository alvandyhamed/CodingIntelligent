package LeetCode.ShuffletheArray;

public class Main {
    public static void main(String[] args) {
        int[] num={1,1,2,2};
        int [] temp;
        Solution solution=new Solution();
        temp=solution.shuffle(num,2);
        for(int i:temp){
            System.out.println(i+"");
        }

    }
}
