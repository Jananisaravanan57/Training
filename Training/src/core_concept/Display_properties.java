package core_concept;

import java.util.Properties;

public class Display_properties {
    public static void main(String[] args) {

        Properties properties = System.getProperties();
        // Java 8
        properties.forEach((k, v) -> System.out.println(k + ":" + v));
    }

}
