package learning.DesignPatern.State;

public class Button {
    private String name;
    private String state="null";

    public Button(String name) {
        this.name = name;
    }

    public String OnClick(String state){
        state=state;
        return state+name;
    }
}
