package pageObjects.amazonPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends PageObjectBase{

    // Page Elements

    private By searchTxtBox = By.id("twotabsearchtextbox");
    private By searchSubmitBtn = By.id("nav-search-submit-text");
    private By cartBtn = By.id("nav-cart-count");

    public HeaderPage(WebDriver wdriver) {
        super(wdriver);
    }

    public HeaderPage loadHomePage(String url) {
        this.driver.get(url);
        this.driver.manage().window().maximize();
        return this;
    }

    public ProductSearchPage searchForProduct(String productName){
        System.out.println("Searching for item: " + "'" + productName + "'" + "...");
        waitForElement(searchTxtBox).sendKeys(productName);
        waitAndClick(searchSubmitBtn);
        return new ProductSearchPage(driver);
    }

    public CartPage clickCartBtn(){
        waitAndClick(cartBtn);
        return new CartPage(driver);
    }
}
