package learning.DesignPatern.Command;

public class SendSms extends AmessageSender {
    public SendSms(String receivername, String message, String Addresses) {
        super(receivername, message, Addresses);
    }

    @Override
    public boolean Send() {
        System.out.println("Send a Sms to "+receivername+ " \nContain message =\n "+message+"\n To Msisdn \t"+Addresses);
        return true;

    }
}
