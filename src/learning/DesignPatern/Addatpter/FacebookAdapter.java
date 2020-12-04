package learning.DesignPatern.Addatpter;

public class FacebookAdapter implements IstatusUpdate{
    protected Facebook facebook;

    public FacebookAdapter(Facebook facebook) {
        this.facebook = facebook;
    }

    @Override
    public boolean GetUserToken(String usser) {
        return this.facebook.CheckToken(usser);

    }

    @Override
    public String SetStatuse(String Token, String Message) {

        return this.facebook.SetUpdate(Token,Message);
    }
}
