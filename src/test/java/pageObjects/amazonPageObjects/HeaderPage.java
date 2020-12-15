package pageObjects.amazonPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends PageObjectBase{

    // Page Elements

    private By searchTxtBox = By.id("twotabsearchtextbox");
    private By searchSubmitBtn = By.id("nav-search-submit-text");

    public HeaderPage(WebDriver wdriver) {
        super(wdriver);
    }

    public HeaderPage loadHomePage(String url) {
        this.driver.get(url);
        this.driver.manage().window().maximize();
        return this;
    }

    public ProductSearchPage searchForProduct(String productName){
        waitForElement(searchTxtBox).sendKeys(productName);
        waitAndClick(searchSubmitBtn);
        return new ProductSearchPage(driver);
    }
}
