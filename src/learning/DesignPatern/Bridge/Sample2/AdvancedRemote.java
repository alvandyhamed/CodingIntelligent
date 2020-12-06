package learning.DesignPatern.Bridge.Sample2;

public class AdvancedRemote extends RemotControl{
    public AdvancedRemote(Device device) {
        super(device);
    }
    public void Mute(){
        device.setvolume(0);
    }

}
