package learning.DesignPatern.Command;

import java.util.LinkedList;
import java.util.List;

public class Message {
    protected List<AmessageSender> senderList;
    public Message(){
       senderList=new LinkedList<>();

    }

    public void AddMessages(AmessageSender message){
        senderList.add(message);
    }
    public void executeMessage(){
        boolean endOfSend=false;
        for(AmessageSender sender:this.senderList){
            endOfSend=false;
            while (!endOfSend)
            endOfSend=sender.Send();
        }
    }

}
