package pageObjects.amazonPageObjects;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;

public class ProductDetailPage extends PageObjectBase{

    private By addToCartbtn = By.id("add-to-cart-button");
    private By declineWarrantyBtn = By.id("attachSiNoCoverage-announce");
    private By closeSideWindow = By.id("attach-close_sideSheet-link");

    public ProductDetailPage(WebDriver wdriver) {
        super(wdriver);
    }

    public HeaderPage addToCart(){
        waitAndClick(addToCartbtn);
        return new HeaderPage(driver);
    }

    public HeaderPage addToCartWarrantyOption(boolean acceptWarranty) throws InterruptedException {
        if (!acceptWarranty) {
            System.out.println("Adding product to cart...");
            waitAndClick(addToCartbtn);
            System.out.println("Product has warranty.. Declining..");
            waitAndClick(declineWarrantyBtn);
            waitAndClick(closeSideWindow);
        }
        return new HeaderPage(driver);
    }

    public ProductDetailPage takeScreenshot(){
        //Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        //Copy the file to a location and use try catch block to handle exception
        try {
            System.out.println("Taking screenshot...");
            FileUtils.copyFile(screenshot, new File("src//test//java//screenshots//catcup.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return this;
    }
}
