package blinovtask.collections.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyLoader {
    public Properties loadFile(String filename) throws IOException {
        Properties properties = new Properties();
        properties.put("submeet", "Submeet_A");
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filename);
       try {
           properties.load(inputStream);
       } catch (IOException e){
           e.printStackTrace();
       }
       return properties;
    }
}
