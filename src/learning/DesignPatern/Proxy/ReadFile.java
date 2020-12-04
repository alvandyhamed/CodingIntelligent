package learning.DesignPatern.Proxy;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFile extends AReadfile{

    private static final String PATH ="src/learning/DesignPatern/Proxy/";


    public ReadFile(String filename) {
        this.setFilename(filename);

        try {
            File myObj = new File(PATH+this.filename);
            Scanner myReader = new Scanner(myObj);
            List<String> arrcontent=new ArrayList<>();
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();


                arrcontent.add(data);
            }
            this.content=arrcontent.toString();
            myReader.close();
        } catch (FileNotFoundException e) {
            this.content="An error occurred.";
            e.printStackTrace();
        }

           }


}
