package HackerRank.Interview1.Strings.MakingAnagrams;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int makeAnagram(String a, String b) {
        int cont=0;

        HashMap<Character,Integer> stra=new HashMap<>();
        HashMap<Character,Integer>strb=new HashMap<>();
        for(int i=0;i<a.length();i++){
            if(stra.containsKey(a.charAt(i))){
                int contarr=stra.get(a.charAt(i));
                contarr++;
                stra.put(a.charAt(i),contarr);
            }else stra.put(a.charAt(i),1);
        }
        for(int i=0;i<b.length();i++){
            if(strb.containsKey(b.charAt(i))){
                int contarr=strb.get(b.charAt(i));
                contarr++;
                strb.put(b.charAt(i),contarr);
            }else strb.put(b.charAt(i),1);
        }
        System.out.println("A"+stra);
        System.out.println("B"+strb);
        for(int i=0;i<a.length();i++){
            if(!strb.containsKey(a.charAt(i))){
                int contalpha=stra.get(a.charAt(i));

                if(contalpha>=1){
                    cont++;
                    contalpha--;
                    if(contalpha==0)
                        stra.remove(a.charAt(i));

                    else
                    stra.put(a.charAt(i),contalpha);
                }else {
                    stra.remove(a.charAt(i));
                }

            }else {
                int conta=stra.get(a.charAt(i));
                int contb=strb.getOrDefault(a.charAt(i),0);
                if(conta>contb){
                    conta--;
                    stra.put(a.charAt(i),conta);
                    cont++;
                }else if(contb>conta){
                    contb--;
                    strb.put(a.charAt(i),contb);
                    cont++;

                }
            }
        }
        for(int i=0;i<b.length();i++){
            if(!stra.containsKey(b.charAt(i))){
                int contalpha=strb.get(b.charAt(i));

                if(contalpha>=1){
                    cont++;
                    contalpha--;
                    if(contalpha==0)
                        strb.remove(b.charAt(i));
                        else
                    strb.put(b.charAt(i),contalpha);
                }else {
                    strb.remove(b.charAt(i));
                }

            }else {
                int conta=stra.get(b.charAt(i));
                int contb=strb.get(b.charAt(i));
                if(conta>contb){
                    conta--;
                    stra.put(b.charAt(i),conta);
                    cont++;
                }else if(contb>conta){
                    contb--;
                    strb.put(b.charAt(i),contb);
                    cont++;

                }
            }
        }
        System.out.println("A"+stra);
        System.out.println("B"+strb);
        return cont;


    }

}
