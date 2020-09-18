package blinovtask.bean;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class XmlSerializableMain {
    public static void main(String[] args) {
//        try (XMLEncoder xmlEncoder = new XMLEncoder(new BufferedOutputStream(
//                new FileOutputStream("data/2334.xml")))) {
//            Order order = new Order(11, 76);
//            xmlEncoder.writeObject(order);
//            xmlEncoder.flush();
//        } catch (FileNotFoundException e) {
//            e.fillInStackTrace();
//        }

        try (XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("data/2334.xml")))) {
        Order order = (Order) xmlDecoder.readObject();
            System.out.println(order);
        } catch (FileNotFoundException e) {
            e.fillInStackTrace();
        }
    }
}
