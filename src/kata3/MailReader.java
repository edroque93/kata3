package kata3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class MailReader {
    public static ArrayList<String> readDomains(String filename) {
        ArrayList<String> list = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new  File(filename)));
                  
            while(true) {
                String mail = reader.readLine();
                if (mail == null) return list;              
                list.add(mail.split("@")[1].toLowerCase());               
            }
            
        } catch (FileNotFoundException e) {
            
        } catch (IOException e) {
            
        }
        
        return list;
    }
}
