package learning.DesignPatern.Facade;

public class SingInFacad {
    private Validate validate;
    private User user;
    private Email email;
    private Auth auth;


    public SingInFacad() {
        this.validate=new Validate();
        this.user=new User();
        this.email=new Email();
        this.auth=new Auth();

    }
    public void Authentication(String username, String password, String email,String auth){
        if (this.validate.Isvalidate(username)){
            this.user.CreateUser(username);
            this.email.send(email);
            this.auth.Login(username,password);
        }

    }

}
