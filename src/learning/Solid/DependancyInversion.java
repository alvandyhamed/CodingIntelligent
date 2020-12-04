package learning.Solid;
interface Sender {
    public void Send(String Message);
}

class Mail implements Sender{

    @Override
    public void Send(String Message) {
        System.out.println("This message sending by mailer </> "+Message);

    }
}
class Sms implements Sender{

    @Override
    public void Send(String Message) {
        System.out.println("|This message sending by SMS !!!!!! "+Message);

    }
}
class User{
    public User(String firsname, String lastname) {
        this.firsname = firsname;
        this.lastname = lastname;
    }

    private String firsname;
    private String lastname;

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}

class ShowWelcomefor_user{
    private Sender sender;

    public ShowWelcomefor_user(Sender sender) {
        this.sender = sender;
    }

    public void Welcome(User user){
        sender.Send(user.getFirsname()+"  "+user.getLastname());
        System.out.println("Wellcome "+user.getFirsname()+" "+user.getLastname());


    }

}
public class DependancyInversion {
    public static void main(String[] args) {
        User hamed=new User("Hamed","Alvandi");
        User hesam=new User("Hesam","Alvandi");
        ShowWelcomefor_user sms=new ShowWelcomefor_user(new Sms());
        ShowWelcomefor_user mail=new ShowWelcomefor_user(new Mail());
        sms.Welcome(hamed);
        mail.Welcome(hesam);
    }
}
