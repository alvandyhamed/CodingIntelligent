package HackerRank.Interview1.FrequencyQueries;

import java.util.*;

public class Solution {

    static List<Integer> freqQuery(List<List<Integer>> queries) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<queries.size();i++){
            List<Integer> temp = new ArrayList<>();
            temp = queries.get(i);
            int q = temp.get(0);
            int num = temp.get(1);
            if(q==1){
                if(hm.containsKey(num)) {
                    hm.put(num,hm.get(num)+1);
                }
                else {
                    hm.put(num,1);
                }
            }
            else if(q==2){
                if(hm.containsKey(num) && hm.get(num)>1) {
                    hm.put(num,hm.get(num)-1);
                }
                else if(hm.containsKey(num)&&hm.get(num)==1) {
                    hm.remove(num);
                }
                else continue;
            }
            else if(q==3){
                if(num>=queries.size()) res.add(0);
                else if(hm.containsValue(num)) res.add(1);
                else res.add(0);
            }
        }
        return res;

    }

    // Complete the freqQuery function below.
//    static List<Integer> freqQuery(List<List<Integer>> queries) {
//        Map<Integer,Integer> MyHash=new HashMap<>();
//        List<Integer> ResultList=new LinkedList<>();
//
//
//
//
//
//        for(List<Integer> MainItem:queries){
//            if(MainItem.get(0)==1){
//                Integer val=1;
//                if(MyHash.containsKey(MainItem.get(1))){
//                    val= MyHash.get(MainItem.get(1))+1;
//
//                }
//
//                MyHash.put(MainItem.get(1),val);
//            }else if(MainItem.get(0)==2) {
//                int cont =MyHash.getOrDefault(MainItem.get(1),-1);
//                if(cont!=-1){
//                    if(cont==0){
//                        MyHash.put(MainItem.get(1),0);
//                    }else {
//                        MyHash.put(MainItem.get(1),MyHash.getOrDefault(MainItem.get(1),1)-1);
//                    }
//
//                }
//
//
//            }else {
//                boolean contain=MyHash.containsValue(MainItem.get(1));
//                if(contain)
//                ResultList.add(1);
//                else
//                    ResultList.add(0);
//
//            }
//        }
//
//
//
//
//return ResultList;
//
//    }
}
