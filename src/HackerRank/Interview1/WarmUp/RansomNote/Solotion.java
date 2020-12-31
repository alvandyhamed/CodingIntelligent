package HackerRank.Interview1.WarmUp.RansomNote;

import java.util.Hashtable;

public class Solotion {
    static void checkMagazine(String[] magazine, String[] note) {
        Hashtable<String,Integer> Magazine=new Hashtable<String, Integer>();
        boolean finde=true;
        for(int i=0;i<magazine.length;i++){
            if(Magazine.containsKey(magazine[i]))
            Magazine.put(magazine[i],Magazine.get(magazine[i])+1);
            else
                Magazine.put(magazine[i],0);
        }

        for(int i=0;i<note.length;i++){
            if(!Magazine.containsKey(note[i])){
                finde=false;
                break;
            }else {
                if(Magazine.get(note[i])<0){
                    finde=false;
                    break;
                }else {
                    Magazine.put(note[i],Magazine.get(note[i])-1);
                }


            }
        }
        if(finde)
            System.out.println("Yes");
        else System.out.println("No");



    }


}
