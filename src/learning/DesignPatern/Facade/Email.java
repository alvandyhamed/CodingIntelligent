package learning.DesignPatern.Facade;

public class Email {
    public Email To(String to){
        return this;
    }
    public Email Subject(String subject){
        return this;
    }
    public Email send (String email_address){
        return this;
    }
}
