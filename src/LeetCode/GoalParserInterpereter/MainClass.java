package LeetCode.GoalParserInterpereter;

import LeetCode.GoalParserInterpereter.BestSolution;

public class MainClass {
    public static void main(String[] args) {
        Solution solution=new Solution();
        BestSolution bestSolotion=new BestSolution();
        System.out.println(solution.interpret("(al)G(al)()()G"));
        System.out.println(bestSolotion.interpret("(al)G(al)()()G"));
    }
}
