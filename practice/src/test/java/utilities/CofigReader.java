package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CofigReader {
    //this class will read from configuration.properties file
    //then it will pass those values to our tests

    private static Properties properties;
//map has key value format, map.get(provide key) provides value
    //we need to load our configuration.properties file into properties variable

    static {

        try {
            //first of all, we need to provide a path to out properties file
            String path = "src/test/resources/configuration.properties";

            //to read from the file
            //to read from a file
            FileInputStream inputStream = new FileInputStream(path);
            //now we need to load into the properties variable

            properties = new Properties();
            properties.load(inputStream);

            //scanner takes user input

            inputStream.close();

        } catch (IOException e) {
        //in case this exception happens we want know where it is coming from and the reason
            e.printStackTrace();//memory in java
        }
    }

    public static String getProperty(String key){
      return properties.getProperty(key).trim();
    }
    //properties.getProperty(key)

}