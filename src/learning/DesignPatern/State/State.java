package learning.DesignPatern.State;

public abstract class State {
    protected AudioPlayer player;

    public State(AudioPlayer player) {
        this.player = player;
    }
    public abstract void clickPrev();
    public abstract void clickNext();
    public abstract void clickLock();
    public abstract void clickPlaye();
}
