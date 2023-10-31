package variables;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configProperties {

    public static Properties property;
    private static String configpath = "Configuration/configsetting.properties";

    public static void initializePropertyFile() throws FileNotFoundException {
        property = new Properties();
        try {
            InputStream inputStream = new FileInputStream(configpath);
            property.load(inputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
