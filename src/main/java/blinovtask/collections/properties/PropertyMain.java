package blinovtask.collections.properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyMain {
    public static void main(String[] args) throws IOException {
        PropertyLoader loader = new PropertyLoader();
        Properties properties = loader.loadFile("datares/massage.properties");
        properties.list(System.out);// output
        // button=Submit
        //label=Label_1
        //submeet=Submeet_A
        String key = properties.getProperty("label");
        properties.put("button", "Button_B");
        String value = properties.getProperty("abc");// output null
        String valueDefault = properties.getProperty("xyz", "y");// если такого ключа нет в файле  -
        // вернет значение по умолчанию(например "y")

//изменить cодержимое пропертей c комментарием:
        properties.store(new FileWriter("data/message2.properties"), "Comment prop");
        properties.list(System.out);// output
//button=Button_B
//label=Label_1
//submeet=Submeet_A
    }
}
