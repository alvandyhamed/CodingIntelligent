package learning.DesignPatern.Command;

public class CommanSample {
    public static void main(String[] args) {
        AmessageSender Email=new SendEmail("Hamed","Hello how are you hamed?","alvandyhamed@gmail.com");
        AmessageSender Sms=new SendSms("Hesam","Hello Dear How are you ?","09032228726");
        Message message=new Message();
        message.AddMessages(Email);
        message.AddMessages(Sms);
        message.executeMessage();
    }
}
