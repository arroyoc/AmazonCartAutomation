package pageObjects.amazonPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObjectBase {

    protected WebDriver driver;
    private int timeout = 15;
    private int elementExistsTimeout = 5;

    public PageObjectBase(WebDriver wdriver) {
        this.driver = wdriver;
    }

    public WebElement waitForElement(By locator) {

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        return driver.findElement(locator);
    }

    public WebElement waitAndClick(By locator) {
        WebElement element = waitForElement(locator);
        element.click();
        return element;
    }

    public boolean elementExists(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, elementExistsTimeout);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (TimeoutException e) {
            return false;
        }

        return true;
    }

    public WebElement waitForElementToBeVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }
}
