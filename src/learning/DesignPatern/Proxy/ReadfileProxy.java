package learning.DesignPatern.Proxy;

public class ReadfileProxy extends AReadfile{
    private ReadFile file;
    public ReadfileProxy(String fileName) {
        this.setFilename(fileName);
    }

    @Override
    public String getContent() {
        if(file==null)
            file=new ReadFile(this.filename);
        return file.getContent();
    }
}
