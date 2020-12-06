package learning.DesignPatern.Bridge.Sample2;

public class Tv implements Device {
    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {

    }

    @Override
    public void disable() {

    }

    @Override
    public int getvolume() {
        return 0;
    }

    @Override
    public void setvolume(double percent) {

    }

    @Override
    public int getchanle() {
        return 0;
    }

    @Override
    public void setchanle(int chanle) {

    }
}
