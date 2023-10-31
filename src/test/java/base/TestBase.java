package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class TestBase {

    public static Properties CONFIG = null;
    public static WebDriver driver;



    public void initialize() throws IOException {
        if (driver == null) {

            CONFIG = new Properties();
            InputStream inputStream = TestBase.class.getClassLoader().getResourceAsStream("config/config.properties");
            CONFIG.load(inputStream);

            if (CONFIG.getProperty("testType").equalsIgnoreCase("remote")) {
                // Remote WebDriver setup
                DesiredCapabilities capabilities = new DesiredCapabilities();
                if (CONFIG.getProperty("remoteBrowser").equalsIgnoreCase("chrome")) {
                    capabilities.setBrowserName("chrome");
                } else if (CONFIG.getProperty("remoteBrowser").equalsIgnoreCase("firefox")) {
                    capabilities.setBrowserName("firefox");
                } else if (CONFIG.getProperty("remoteBrowser").equalsIgnoreCase("edge")) {
                    capabilities.setBrowserName("edge");
                }

                driver = new RemoteWebDriver(new URL(CONFIG.getProperty("remoteDriverUrl")), capabilities);
            }

            else if (CONFIG.getProperty("testType").equalsIgnoreCase("local")) {
                String localBrowser = CONFIG.getProperty("browser");
                if (localBrowser.equalsIgnoreCase("firefox")) {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                } else if (localBrowser.equalsIgnoreCase("edge")) {
                    WebDriverManager.edgedriver().setup();
                    driver = new InternetExplorerDriver();
                } else if (localBrowser.equalsIgnoreCase("chrome")) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }


            }
        }
    }

    @BeforeClass
    public void setUp() throws IOException {
        initialize();
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
