package HackerRank.Interview1.Strings.AlternatingCharacters

class Solutionkt {
    companion object{
        fun alternatingCharacters(s:String):Int{
            var count=0
            var curentchar=s[0]
            for (chr in s){
                if(chr.equals(curentchar)){
                    count++

                }else{
                    curentchar=chr
                }
            }
            return count
        }
    }
}