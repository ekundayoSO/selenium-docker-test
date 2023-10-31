package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ConfigurationReader1 {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        InputStream stream = ConfigurationReader1.class.getClassLoader().getResourceAsStream("config/config.properties");
        properties.load(stream);

        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("password"));
    }
}
