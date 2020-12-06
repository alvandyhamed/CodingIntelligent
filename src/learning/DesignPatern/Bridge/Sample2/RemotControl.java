package learning.DesignPatern.Bridge.Sample2;

public class RemotControl {
    protected Device device;
    public RemotControl(Device device){
        this.device=device;
    }
    public void togglePower(){
        if(this.device.isEnabled()){
            this.device.disable();
        }else {
            this.device.enable();
        }

    }
    public void VolumeDown(){
        this.device.setvolume(this.device.getvolume()-10);
    }
    public void VolumeUp(){
        this.device.setvolume(this.device.getvolume()+10);
    }
    public void ChanleUp(){
        this.device.setchanle(this.device.getchanle()+1);
    }
    public void ChanleDown(){
        this.device.setchanle(this.device.getchanle()+1);
    }

}
