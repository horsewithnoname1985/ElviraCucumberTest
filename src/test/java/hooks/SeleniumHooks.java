package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import support.SeleniumHelper;

import java.util.concurrent.TimeUnit;

public class SeleniumHooks {

    private SeleniumHelper helper;

    public SeleniumHooks (SeleniumHelper helper) {
        this.helper = helper;
    }

    @Before
    public void getWebDriverWithReducedGeckodriverLogging() {
        System.setProperty("webdriver.gecko.driver","C:\\bin\\geckodriver.exe");
        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"C:\\temp\\logs.txt");
        WebDriver driver = helper.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void stopWebriver() {
        helper.getDriver().quit();
    }
}
