package HackerRank.Interview1.Strings.MakingAnagrams

class Solutionkt {


    companion object{
        fun makeAnagram(a:String,b:String): Int {
            var count=0
            val stra:HashMap<Char,Int> = HashMap<Char,Int>()
            val strb:HashMap<Char,Int> = HashMap<Char,Int>()
            for (str in a)
                stra.put(str,stra.getOrDefault(str,0)+1)
            for(str in b)
                strb.put(str,strb.getOrDefault(str,0)+1)

           println(stra)
           println(strb)
            for (str in a){
                if(!strb.containsKey(str)){
                    var contalpha=strb.get(str)
                    if (contalpha != null) {
                        if(contalpha>=1){
                            count++
                            contalpha--
                            if(contalpha==0)
                                stra.remove(str)
                            else
                                stra.put(str,contalpha)
                        }else
                            stra.remove(str)
                    }
                }else{
                    var conta=stra.get(str)
                    var contb=strb.get(str)
                    if (conta != null) {
                        if(conta> contb!!){
                            conta--
                            stra.put(str,conta)
                            count++

                        }else if(conta<contb){
                            contb--
                            strb.put(str,contb)
                            count++
                        }
                    }


                }
            }

            for(str in b){
                if(!stra.containsKey(str)){
                    var contalpha=strb.get(str)
                    if(contalpha!! >=1){
                        count++
                        contalpha--
                        if(contalpha==0)
                            strb.remove(str)
                        else
                            strb.put(str,contalpha)

                    }else
                    {
                        strb.remove(str)

                    }
                }else{
                    var conta=stra.get(str)
                    var contb=strb.get(str)
                    if(conta!!>contb!!){
                        conta--
                        stra.put(str,conta)
                        count++
                    }else if(conta<contb){
                        contb--
                        strb.put(str,contb)
                        count++
                    }
                }
            }

            return count
        }

    }

}