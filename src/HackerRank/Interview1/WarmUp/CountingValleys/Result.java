package HackerRank.Interview1.WarmUp.CountingValleys;

public class Result {
    public static int countingValleys(int steps, String path) {
        int cont=0;
        int sum=0;
        for(int i=0;i<steps;i++){
            if(path.charAt(i)=='U'){
                if(cont+1==0)
                    sum++;
                cont++;

            }else if(path.charAt(i)=='D'){
                cont--;
            }


        }


    return sum;
    }
}
