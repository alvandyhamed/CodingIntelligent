package learning.DesignPatern.State;

public class PlayingState extends State{
    public PlayingState(AudioPlayer player) {
        super(player);
    }

    @Override
    public void clickPrev() {

    }

    @Override
    public void clickNext() {

    }

    @Override
    public void clickLock() {
        this.player.HideLocked();
        this.player.ChangeState(new LockedState(this.player));

    }

    @Override
    public void clickPlaye() {
        this.player.stopPlayBack();
        this.player.ChangeState(new ReadyPlayer(this.player));


    }
}
