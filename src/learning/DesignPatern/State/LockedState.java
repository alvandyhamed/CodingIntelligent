package learning.DesignPatern.State;

public class LockedState extends State{
    public LockedState(AudioPlayer player) {
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
        this.player.ShowLocked();
        this.player.ChangeState(new PlayingState(this.player));

    }

    @Override
    public void clickPlaye() {

    }
}
