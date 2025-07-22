package collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();

        properties.setProperty("Brand", "Dell");
        properties.setProperty("Processor", "i7");
        properties.setProperty("OS", "Windows");
        properties.setProperty("Model", "Latitude");

        System.out.println(properties);

        properties.store(new FileOutputStream("src/collections/MyData.txt"), "Laptop");
        properties.storeToXML(new FileOutputStream("src/collections/MyData.xml"), "Laptop");
        properties.store(new FileOutputStream("src/collections/MyData.properties"), "Laptop");

        Properties p2 = new Properties();

        p2.loadFromXML(new FileInputStream("src/collections/MyData.xml"));

        System.out.println(p2);
    }
}
