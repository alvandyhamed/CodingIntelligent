package LeetCode.GoalParserInterpereter;

public class Solution {
    public String interpret(String command) {
        int i=0;
        boolean skip=false;
        String resualt="";
        while (i<command.length()){
            if(command.charAt(i)=='G'){
                resualt+='G';
                i++;
            }else if(command.charAt(i)==')'){
                resualt+="o";
                i++;

            }else if(command.charAt(i)=='a'){
                resualt+="al";
                i+=3;
            }else i++;

        }
return resualt;
    }


}
