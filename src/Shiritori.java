import java.util.LinkedList;
import java.util.List;

public class Shiritori {
    public Shiritori() {
        words=new LinkedList<>();
        game_over=false;
    }

    private List<String> words;
    public Boolean game_over;

    public Object play(String word){
        String getpriviouWord="";
        if(words.size()>0) {
            getpriviouWord = words.get(words.size() - 1);
        }
        if(words.size()==0){
            words.add(word);
        }else {
            if(words.indexOf(word)==-1){
                char privioud=getpriviouWord.charAt(getpriviouWord.length()-1);
                char newword=word.charAt(0);
                if(Character.compare(privioud,newword)==0){
                    words.add(word);
                }else {
                    game_over=true;
                    return "game over";
                }

            }else {
                game_over=true;
                return "game over";
            }

        }



return words.toArray();

    }
    public String restart(){
        words=new LinkedList<>();
        game_over=false;
        return "game restarted";


    }
    public Object getWords(){
        return words.toArray() ;
    }


    public static void main(String[] args){
        Shiritori shiritori;
       shiritori=new Shiritori();
        System.out.println("PLAY == "+shiritori.play("apple"));
        System.out.println("PLAY =="+shiritori.play("ear"));
        System.out.println("PLAY =="+shiritori.play("rhino"));
        System.out.println("PLAY =="+shiritori.play("corn"));


       //shiritori.play("Dara");


        System.out.println("GameoVer"+shiritori.getWords());
        System.out.println("HAMED"+shiritori.restart());

        System.out.println("PLAY =="+shiritori.play("hostess"));
        System.out.println("PLAY =="+shiritori.play("stash"));
        System.out.println("PLAY =="+shiritori.play("hostess"));

    }

}
