package testBase;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.amazonPageObjects.HeaderPage;

public class TestBase {

    protected static WebDriver wdriver;
    protected String amazonUrl = "https://www.amazon.com/";

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

    // ########### Frequently used methods ###############

    protected HeaderPage loadAmazonHome(){
        HeaderPage hp = new HeaderPage(wdriver);
        return hp.loadHomePage(amazonUrl);
    }
}
