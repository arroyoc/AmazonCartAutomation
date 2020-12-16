package pageObjects.amazonPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductSearchPage extends PageObjectBase{

    public ProductSearchPage(WebDriver wdriver) {
        super(wdriver);
    }

    public ProductDetailPage selectProduct(String productDesc){
        System.out.println("Selecting product with description: " + "'" + productDesc + "'");
        waitAndClick(By.linkText(productDesc));
        return new ProductDetailPage(driver);
    }
}
