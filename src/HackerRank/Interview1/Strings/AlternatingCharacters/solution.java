package HackerRank.Interview1.Strings.AlternatingCharacters;

public class solution {
    static int alternatingCharacters(String s) {
        int cont=0;
        char cutrnt=s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==cutrnt){
                cont++;
            }else {
                cutrnt=s.charAt(i);

            }
        }

return cont;
    }
}
