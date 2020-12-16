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

    public boolean verifyProductIsNotCart(String productDesc){
        boolean exist = driver.findElements(By.linkText(productDesc)).size() == 0;
        return !exist;

    }

    public CartPage deleteProductFromCart(String productDesc){
//        waitAndClick(By.xpath("//[@aria-label=" + '"' + "Delete " + productDesc + '"'));
//        waitForElement(By.cssSelector("[aria-label=" + "Delete " + productDesc + "]"));
        waitAndClick(By.xpath("/html/body/div[1]/div[4]/div[1]/div[6]/div/div[2]/div[4]/div/form/div[2]/div[5]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input"));
        return this;
    }


}
