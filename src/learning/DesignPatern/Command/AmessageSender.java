package learning.DesignPatern.Command;

public abstract class  AmessageSender {
    public abstract boolean Send();
    String receivername;
    String message;
    String Addresses;

    public AmessageSender(String receivername, String message, String addresses) {
        this.receivername = receivername;
        this.message = message;
        Addresses = addresses;
    }
}


