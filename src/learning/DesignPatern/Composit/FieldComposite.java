package learning.DesignPatern.Composit;

import java.lang.annotation.ElementType;
import java.util.*;

public abstract class FieldComposite extends FormElement{
    protected Map<String,FormElement> list=new HashMap<>();
    public FieldComposite(String name, String title) {
        super(name, title);
    }
    public void add(FormElement field){
        String name=field.getName();
        list.put(name,field);

    }
    public void remove(FormElement field){

        list.remove(field);

    }



    public void setdata(String data){
        for(Map.Entry<String,FormElement> mapitem:list.entrySet()){
            this.setdata(mapitem.getValue().getName());

        }

    }
    public List<Input> getdata(){
        List<Input> mylist=new ArrayList<>();
        for (Map.Entry<String,FormElement> mapitem:list.entrySet()){
            mylist.add(mapitem.getValue().getData());
        }
        return mylist;
    }
    @Override
    public String render() {
        String out="";
        for(Map.Entry<String,FormElement> mapitem:list.entrySet()){
            out+=mapitem.getValue().render();
        }
        return out;
    }
}
