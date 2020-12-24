package QueensAttack;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class Solution {
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
       int[][] Board=new int[n][n];
       int cont=0;
        int q=0;
        r_q-=1;
        c_q-=1;
       Board[r_q][c_q]=2;
        for(int i=0;i<k;i++){
            Board[obstacles[i][0]-1][obstacles[i][1]-1]=5;

        }
q=0;
           for(int j=r_q-1;j>=0;j--){

               if(Board[j][c_q]!=5){
               Board[j][c_q]=1;
               cont++;
               }else break;
           }
           for(int i=r_q+1;i<n;i++){
               if(Board[i][c_q]!=5) {
                   Board[i][c_q] = 1;
                   cont++;
               }else break;
           }
        for(int j=c_q-1;j>=0;j--){
            if( Board[r_q][j]!=5) {
                Board[r_q][j] = 1;
                cont++;
            }else break;
        }
        for(int i=c_q+1;i<n;i++){
            if(Board[r_q][i]!=5) {
                Board[r_q][i] = 1;
                cont++;
            }else break;
        }
        q=0;
        for(int l=r_q-1;l>=0;l--){
            q++;
            if(c_q-q>=0)
            if(Board[l][c_q-q]!=5) {
                Board[l][c_q - (r_q - l)] = 1;
                cont++;
            }else break;
            else break;

        }
        q=0;

        for(int l=r_q+1;l<n;l++){
            q++;
            if(q+c_q<n)
            if(Board[l][q+c_q]!=5) {
                cont++;
                Board[l][q + c_q] = 1;
            }else break;
            else break;

        }
        q=0;
        for(int l=r_q-1;l>=0;l--){
            q++;
            if(q+c_q<n)
if( Board[l][q+c_q]!=5){
    Board[l][q+c_q]=1;
    cont++;

}else break;
            else break;
        }
        q=0;
        for(int l=r_q+1;l<n;l++){
            q++;
            if(c_q-q>=0)
                if( Board[l][c_q-q]!=5) {
                    Board[l][c_q - q] = 1;
                    cont++;
                }else break;
            else
                break;
        }








        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(Board[i][j]+" ");
            }
            System.out.println();
        }

        return cont;

    }

}
