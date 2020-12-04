package learning.DesignPatern.Addatpter;

public class MainClass {
    public static void main(String[] args) {
        Facebook facebook=new Facebook();
        Twitter twitter=new Twitter();

        /// Did Write Below method when we do not use Adapter Design Pattern
        if(facebook.CheckToken("HAmed"))
        {
            System.out.println(facebook.SetUpdate("12ab","on message for facebook"));
        }

        if(twitter.CheckUserToken("Hasan")){
            System.out.println(twitter.SetStatuseUpdate("1a2b3c","on message twitter"));
        }

        //**
        // After using Adapter Design Pattern
        // **//
        IstatusUpdate facebookadapter=new FacebookAdapter(new Facebook());
        IstatusUpdate twitteradapter=new TwitterAdapter(new Twitter());
        facebookadapter.GetUserToken("Hamed");
        System.out.println(facebookadapter.SetStatuse("1a2a333","Hi Hamed"));
        twitteradapter.GetUserToken("Hesam");
        System.out.println(twitteradapter.SetStatuse("45555ai","Hi Hesam"));

    }
}
