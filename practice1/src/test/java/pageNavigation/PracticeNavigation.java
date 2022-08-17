package pageNavigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.CofigReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class PracticeNavigation {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = Driver.getDriver();
    }

    @After
    public void tearDown(){
     driver.close();
    }

    @Test
    public void practicePageNavigation(){
        //same as driver.get()
        driver.navigate().to("https://www.expedia.com/");

        WebElement stayslink = driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[1]/a"));

        stayslink.click();
        //here we would expect to get StaleElementException
        stayslink = driver.findElement(By.xpath("//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[1]/a"));
        WebElement parentOfstayslink = stayslink.findElement(By.xpath("./.."));

        Assert.assertTrue(parentOfstayslink.getAttribute("class").equals("uitk-tab active"));
        // woks ill here then from line 54-74 it does not work
        //to navigate back
//        driver.navigate().back();
//
//        //verify welcome is selected by defualt
//
//        WebElement Expedialink = driver.findElement(By.xpath("//*[@id=\"app-layer-base\"]/div[1]/div[1]/header/div/div/a/.."));
//
//            Assert.assertTrue(Expedialink .getAttribute("class").equals("uitk-layout-flex uitk-layout-flex-align-items-center uitk-layout-flex-flex-wrap-nowrap uitk-layout-flex-item all-l-padding-six s-r-padding-three m-r-padding-three l-r-padding-two xl-r-padding-two uitk-layout-flex-item-flex-grow-1"));
//
//        //navigate forward
//
//        driver.navigate().forward();
//
//        //this line will fail because parentOfstaysLink needs to be located again
//        // Assert.assertTrue(parentOfstayslink.getAttribute("class").equals("uitk-tab active"));
//
//        WebElement goingtoInput = driver.findElement(By.xpath("//*[@id=\"location-field-destination-menu\"]/div[1]/div[1]/button"));
//        goingtoInput.sendKeys("Cancun (CUN - Cancun Intl.)");
//
//        driver.navigate().refresh();
//        goingtoInput = driver.findElement(By.xpath("//*[@id=\"location-field-destination-menu\"]/div[1]/div[1]/button"));
//        goingtoInput.sendKeys("Mexico City (MEX - Mexico City Intl.)");
//

    }


}
