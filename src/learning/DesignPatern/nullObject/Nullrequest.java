package learning.DesignPatern.nullObject;

public class Nullrequest implements Request {
    @Override
    public String execute() {
        return "Error!";
    }
}
