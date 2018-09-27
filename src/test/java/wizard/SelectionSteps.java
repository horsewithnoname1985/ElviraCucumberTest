package wizard;

import cucumber.api.java.en.*;
import cucumber.api.PendingException;
import org.openqa.selenium.WebDriver;
import support.SeleniumHelper;
import org.openqa.selenium.By;

public class SelectionSteps {

    private SeleniumHelper helper;
    private WebDriver driver;

    public SelectionSteps(SeleniumHelper helper) {
        this.helper = helper;
    }

    @When("^proper settings for (\\w+), (\\w+), (\\w+), (\\w+) and (\\w+) are entered")
    public void ProperFlashSettingsAreEntered(String varnish, String uv, String backflash,
                                              String throughflash, String backsideTraverse) throws Exception {

        driver = helper.getDriver();

        helper.ScrollToElement(driver, driver.findElement(By.xpath("/html/body/div[3]/div/form/div[1]")));
        driver.findElement(By.xpath("/html/body/div[3]/div/form/div[2]/table/tbody/tr[1]/td[2]/input")).click();

        helper.ScrollToElement(driver, driver.findElement(By.xpath("/html/body/div[3]/div/form/div[3]")));
        driver.findElement(By.xpath("/html/body/div[3]/div/form/div[4]/table/tbody/tr[1]/td[2]/input")).click();

        helper.ScrollToElement(driver, driver.findElement(By.xpath("/html/body/div[3]/div/form/div[5]")));
        driver.findElement(By.xpath("/html/body/div[3]/div/form/div[6]/table/tbody/tr[1]/td[2]/input")).click();


        helper.ScrollToElement(driver, driver.findElement(By.xpath("/html/body/div[3]/div/form/div[7]")));
        if (varnish.equals("varnish_YES")) {
            driver.findElement(By.xpath("/html/body/div[3]/div/form/div[8]/table/tbody/tr[1]/td[2]/input")).click();
        }
        if (uv.equals("uv_YES")) {
            driver.findElement(By.xpath("/html/body/div[3]/div/form/div[8]/table/tbody/tr[2]/td[2]/input")).click();
        }
        if (backflash.equals("back_YES")) {
            driver.findElement(By.xpath("/html/body/div[3]/div/form/div[8]/table/tbody/tr[3]/td[2]/input")).click();
        }
        if (throughflash.equals("through_YES")) {
            driver.findElement(By.xpath("/html/body/div[3]/div/form/div[8]/table/tbody/tr[4]/td[2]/input")).click();
        }

        helper.ScrollToElement(driver, driver.findElement(By.xpath("/html/body/div[3]/div/form/div[9]")));
        if (backsideTraverse.equals("bt_normal")) {
            driver.findElement(By.xpath("/html/body/div[3]/div/form/div[10]/table/tbody/tr[2]/td[2]/input")).click();
        } else {
            driver.findElement(By.xpath("/html/body/div[3]/div/form/div[10]/table/tbody/tr[1]/td[2]/input")).click();
        }

        helper.ScrollToElement(driver, driver.findElement(By.xpath("/html/body/div[3]/div/form/input")));
        driver.findElement(By.xpath("/html/body/div[3]/div/form/div[12]/table/tbody/tr[1]/td[2]/input")).sendKeys("1200");
        driver.findElement(By.xpath("/html/body/div[3]/div/form/div[12]/table/tbody/tr[2]/td[2]/input")).sendKeys("361283");
        driver.findElement(By.xpath("/html/body/div[3]/div/form/div[14]/table/tbody/tr/td[2]/input")).sendKeys("632000");
        driver.findElement(By.xpath("/html/body/div[3]/div/form/div[16]/table/tbody/tr/td[2]/input")).sendKeys("0");

    }


    @When("^these settings are submitted$")
    public void theseSettingsAreSubmitted() throws Exception {
        WebDriver driver = helper.getDriver();
        driver.findElement(By.xpath("/html/body/div[3]/div/form/input")).click();
    }

}
