package testBase;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    protected static WebDriver wdriver;

    // ############ WEB SETUP ##############

    protected static void webSetup() throws IOException {

        // Check if web driver has already been instantiated
        // Driver options are 'PhantomJSDriver', 'ChromeDriver', 'FireFoxDriver'
        if (wdriver == null) {
            //azure chrome driver
            System.setProperty("webdriver.chrome.driver", "src//test//java//webDrivers//ChromeDriver//chromedriver.exe");
            wdriver = new ChromeDriver();
        }
    }
}
