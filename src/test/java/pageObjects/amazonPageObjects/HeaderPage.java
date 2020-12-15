package pageObjects.amazonPageObjects;

import org.openqa.selenium.WebDriver;

public class HeaderPage extends PageObjectBase{

    public HeaderPage(WebDriver wdriver) {
        super(wdriver);
    }

    public HeaderPage loadHomePage(String url) {
        this.driver.get(url);
        this.driver.manage().window().maximize();
        return this;
    }
}
