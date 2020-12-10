package learning.DesignPatern.State;

public class AudioPlayerWithoutPattern {
    protected String state="ready";

    public void ClickPlay(){
        if(state.equalsIgnoreCase("Play")){
            //Some Doing
            state="Stop";
        }else if(state.equalsIgnoreCase("Lock")){
            state="Playing";
        }else if(state.equalsIgnoreCase("ready")){
            state="Playing";
        }
        /**
         * This is mistake ,because if add another state should be must add many if
         * **/
    }
    public void Next(){

    }

}
