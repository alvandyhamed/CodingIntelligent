package learning.DesignPatern.Command;

public class SendEmail extends AmessageSender {
    public SendEmail(String receivername, String message, String Addresses) {
        super(receivername, message, Addresses);
    }

    @Override
    public boolean Send() {
        System.out.println("Send a Email to "+receivername+ " \nContain message =\n "+message+"\n To Email addresses\t"+Addresses);
        return true;
    }
}
