package Binumbers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Numbers {

    int[] IntNumber1;
    int[] IntNumber2;

    public void SetNumber(String Number1, String Number2){

        this.IntNumber1=Convert(Number1);
        this.IntNumber2=Convert(Number2);
    }

    public int[] Convert(String Number){

        int[] Mynumber=new int[Number.length()];
        for(int i=0;i<Number.length();i++){
            Mynumber[i]=(Integer.parseInt(Number.charAt(i)+""));

        }

        return Mynumber;

    }
    public void Print(int[] Answer){
        for(Integer num:Answer){
            System.out.print(num);
        }
    }
    public abstract void Oparate();


}
