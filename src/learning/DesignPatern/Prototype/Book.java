package learning.DesignPatern.Prototype;

public abstract class Book {
    protected String Title;
    protected String Topic;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTopic() {
        return Topic;
    }

    public void setTopic(String topic) {
        Topic = topic;
    }
}
