package kata3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;

public class Kata3 {

    public static void main(String[] args) throws  IOException {
        String filename = "C:\\cosas.txt";
        File file = new File(filename);
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        
        HashMap<String, Integer> map = new HashMap<>();
        
        while (true) {
            String line = reader.readLine();
            if (line == null) break;
            
            String domain = line.split("@")[1];
            
            if (!map.containsKey(domain)) {
                map.put(domain, 1);
            } else {
                map.put(domain, map.get(domain) +1);
            }
        }
        
        Iterator i = map.entrySet().iterator();
        
        for (String domain : map.keySet()) {
            System.out.println(domain + " = " + map.get(domain));
        }
        
        
        reader.close();
    }

}
