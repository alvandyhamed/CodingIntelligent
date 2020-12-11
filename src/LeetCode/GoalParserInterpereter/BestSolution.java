package LeetCode.GoalParserInterpereter;

public class BestSolution {
    public String interpret(String command) {
        /// 1ms
        return command.replace("()","o")
                .replace("(al)","al");
        //4ms
       // return command.replaceAll("\\(\\)","o").replaceAll("\\(al\\)","al");


    }
}
