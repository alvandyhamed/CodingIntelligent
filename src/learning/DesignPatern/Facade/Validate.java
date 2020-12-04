package learning.DesignPatern.Facade;

public class Validate {
    public boolean Isvalidate(String Usser){
        ////// Do Validation /////
        if(Usser.isEmpty())
            return false;
        return true;
    }
}
