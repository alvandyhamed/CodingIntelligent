package HackerRank.Interview1.WarmUp.CountTriplets;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Long> myList=new LinkedList<>();
        myList.add(5l);
        myList.add(25l);
        myList.add(125l);

      System.out.println(Sulotion.countTriplets(myList,4));


    }
}
