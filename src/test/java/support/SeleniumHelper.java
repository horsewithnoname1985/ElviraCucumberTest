package support;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHelper {
    private WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null) {
            driver = new FirefoxDriver();
        }
        return driver;
    }

    public void ScrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("return arguments[0].scrollIntoView();", element);

    }
}
