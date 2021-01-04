package HackerRank.Interview1.FrequencyQueries;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> MyList=new LinkedList<>();

        MyList.add(Arrays.asList(1,5));
        MyList.add(Arrays.asList(1,6));
        MyList.add(Arrays.asList(3,2));
        MyList.add(Arrays.asList(1,10));
        MyList.add(Arrays.asList(1,10));
        MyList.add(Arrays.asList(1,6));
        MyList.add(Arrays.asList(2,5));
        MyList.add(Arrays.asList(3,2));

        List<List<Integer>> ILISt=new LinkedList<>();

        ILISt.add(Arrays.asList(1,5));
        ILISt.add(Arrays.asList(1,6));
        ILISt.add(Arrays.asList(3,2));
        ILISt.add(Arrays.asList(1,10));
        ILISt.add(Arrays.asList(1,10));
        ILISt.add(Arrays.asList(1,6));
        ILISt.add(Arrays.asList(2,5));
        ILISt.add(Arrays.asList(3,2));




        System.out.println(Solution.freqQuery(MyList));

    }
}
