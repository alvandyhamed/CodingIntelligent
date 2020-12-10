package learning.DesignPatern.State;

import java.util.List;

public class AudioPlayer {
    protected State state;
    protected UI Ui;
    protected double Value;
    protected List<String> PlayeList;
    protected String currentSong;

    public void ChangeState(State state){
        this.state=state;

    }
    public String HideLocked(){
        return "Hide";
    }
    public String ShowLocked(){
        return "Show";
    }
    public AudioPlayer(){
        Ui=new UI();
        Ui.getPlayeButton().OnClick(this.OnclickPlaye());
        Ui.getLockButton().OnClick(this.OnclickLock());
        Ui.getNextButton().OnClick(this.OnclickNext());
        Ui.getPrevButton().OnClick(this.OnclickPrev());


    }

    public String OnclickPrev() {
        this.state.clickPrev();
        return "Prev";
    }

    public String OnclickNext() {
        this.state.clickNext();
        return "Next";
    }

    public String OnclickLock() {
        this.state.clickLock();
        return "Lock";
    }

    public String OnclickPlaye() {
        this.state.clickPlaye();
        return "Play";
    }
    public void startPlayback(){

    }
    public void stopPlayBack(){}
    public void nextSong(){}
    public void prevSong(){}
    public void FastForward(int time){}
    public void rewind(int time){}
}
