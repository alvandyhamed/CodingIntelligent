import java.util.*;

public class VowelFamilies {
    public static List<String> getVolvechar(String Firststring){
        String testString="aeiouyAEIOUY";
        List<String> lisOfchar=new LinkedList<>();
        for(int i=0;i<Firststring.length();i++){
            if(testString.indexOf(Firststring.charAt(i))!=-1){
                lisOfchar.add(Firststring.charAt(i)+"");
            }
        }
        return lisOfchar;
    }
    public static String[] sameVowelGroup(String[] words) {
        List<String> endoflist=new LinkedList<>();
        endoflist.add(words[0]);

        List<String> listonvolechar=getVolvechar(words[0].toLowerCase());
        System.out.println(listonvolechar);

        for(int i=1;i<words.length;i++){
            Set<String> compair=new HashSet<>(listonvolechar);
            List<String> templis=getVolvechar(words[i].toLowerCase());


            //  compair.removeAll(templis);
            templis.removeAll(compair);

            if(templis.size()==0){
                endoflist.add(words[i]);
            }


        }
        System.out.println(Arrays.toString(endoflist.toArray()));
        String[] itemsArray = new String[endoflist.size()];
        return endoflist.toArray(itemsArray);

    }
    public static void main(String[] args){
        System.out.println("_"+
                Arrays.toString(
                        sameVowelGroup(new String[]{"a", "aa", "ab", "abc", "aaac", "abe"})));

    }
}
