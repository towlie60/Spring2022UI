package IframesandAlerts;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.List;

public class Practiceiframes {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = Driver.getDriver();
    }

    @After
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    public void test1() {

        driver.navigate().to("https://demoqa.com/frames");
        //before checking if text1 is displayed we need to switch to the iframe that contains it

        // WebElement text1 = driver.findElement(By.id("sampleHeading"));

        //1st option- switch to iframe by webelement
        WebElement iframe1 = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iframe1);
        WebElement text1 = driver.findElement(By.id("sampleHeading"));

        Assert.assertTrue(text1.isDisplayed());

        driver.switchTo().defaultContent();

        //2nd Option -switch to iframe by name or id
        driver.switchTo().frame("frame2");


        //3 Option -switch t iframe by index
//        driver.switchTo().frame("frame2");
//        WebElement text2 = driver.findElement(By.id("sampleHeading"));
//
//        Assert.assertTrue(text2.isDisplayed());

    }
    @Test
    public void test2(){
        driver.navigate().to("https://leetcode.com/");
        Actions actions = new Actions(driver);

        actions.moveToElement(driver.findElement(By.xpath("//div[@class='playground-iframe']"))).perform();

        WebElement iframe = driver.findElement(By.xpath("//iframe[@height='400']"));

        //actions.moveToElement(iframe).perform();

        driver.switchTo().frame(iframe);

        WebElement runButton = driver.findElement(By.xpath("//button[contains(@class,'btn-success')]"));

        runButton.click();

        //WebDriverWait wait = new WebDriverWait()
        WebElement runResultMessage = new WebDriverWait(driver,10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='success result']")));


        String text = runResultMessage.getText(); //Finished in 4ms  -->String[] arr = [Finished, in , 4ms}

        for(String word: text.split(" ")) {
            if(Character.isDigit(word.charAt(0))){
                int ms = Integer.parseInt(word);
                Assert.assertTrue(ms < 5);
             }
         }

     }
 }