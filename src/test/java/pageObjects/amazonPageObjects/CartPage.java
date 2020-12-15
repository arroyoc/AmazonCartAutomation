package pageObjects.amazonPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends PageObjectBase{

    public CartPage(WebDriver wdriver) {
        super(wdriver);
    }

    public CartPage verifyProductIsInCart(String productDesc){
        waitForElement(By.linkText(productDesc));
        return this;
    }

}
