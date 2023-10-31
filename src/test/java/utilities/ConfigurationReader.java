package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ConfigurationReader {
    protected Properties properties;

    public String getBrowserName() {

        return properties.getProperty("browser");
    }

    public String getTestType() {

        return properties.getProperty("remote");
    }


    public String geURL() {

        return properties.getProperty("url");
    }

    public String getFirstName() {

        return properties.getProperty("userFirstName");
    }

    public String getLastName() {

        return properties.getProperty("userLastName");
    }

    public String getUserPhone() {

        return properties.getProperty("userPhone");
    }

    public String getPassword() {

        return properties.getProperty("password");
    }

    public String getConfirmPassword() {

        return properties.getProperty("confirm-password");
    }

    public String getLoginEmail() {

        return properties.getProperty("username");
    }


    public ConfigurationReader() throws IOException {
        properties = new Properties();
        InputStream stream = ConfigurationReader.class.getClassLoader().getResourceAsStream("config/config.properties");
        properties.load(stream);



    }

}
