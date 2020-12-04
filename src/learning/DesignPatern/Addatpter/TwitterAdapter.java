package learning.DesignPatern.Addatpter;

public class TwitterAdapter implements IstatusUpdate {
    protected Twitter twitter;

    public TwitterAdapter(Twitter twitter) {
        this.twitter = twitter;
    }

    @Override
    public boolean GetUserToken(String usser) {
        return twitter.CheckUserToken(usser);

    }

    @Override
    public String SetStatuse(String Token, String Message) {
        return twitter.SetStatuseUpdate(Token,Message);

    }
}
