package learning.DesignPatern.Bridge.Sample2;

public class mainclass {
    public static void main(String[] args) {
        Radio radio=new Radio();
        RemotControl remotControlRadio=new RemotControl(radio);
        remotControlRadio.ChanleUp();
        Tv tv=new Tv();
        AdvancedRemote advancedRemoteTv=new AdvancedRemote(tv);
        advancedRemoteTv.Mute();

    }
}
