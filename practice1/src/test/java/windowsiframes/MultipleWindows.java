package windowsiframes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MultipleWindows {

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit(); //will close all open windows and quit the browser


    }

    @Test
    public void amazonTest() {
        driver.get("https://www.amazon.com/");
        // I want to get the unique window handle assigned to amazon page
        //.getWindowHandle() - retrieves the unique id of currently open window
        String windowHandle = driver.getWindowHandle();

        System.out.println(windowHandle);
        //CDwindow-2E1B38D52285D56E8D2E295FCE1AC25F
        //CDwindow-B287E5036D5ED05AAC46DB67810ED6D3

        //ID WILL stay will browser is alive
        //after you close your driver you lose access


    }

    @Test
    public void testMultipleWindows() {

        driver.get("https://demoqa.com/links");
        driver.findElement(By.xpath("//*[@id='dynamicLink']")).click();
        //after I clicked on the link - new window opened up
        //in order to interact with web elements on the new window
        // I need to tell my driver to switch
        //1. Get windowHandle of main window
        //2. Get windowHandle of all open windows
        //3. using a loop compare and switch to the new window

        String mainPage = driver.getWindowHandle();

        //2
        Set<String> allOpenWindows = driver.getWindowHandles();
        // ---> this set will contain 2 values because we have 2 windows open
        //one of the values will be id of our main window
        for(String windowHandle: allOpenWindows) {
            if(!windowHandle.equals(mainPage)){
                driver.switchTo().window(windowHandle);
            }
        }

        //click on the link on the new window

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img")).click();
                //"//a[@href='https://www.toolsqa.com/selenium-training/']")).click();

        //here I may need to add some wait

       WebElement elementHeading = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
        //WebElement element = driver.findElement(By.xpath("//a[text()='Choosing an Automation Solution']")).click();
                //"//a[@href='https://www.toolsqa.com/selenium-training/']"));
                //"//strong[text()='Agenda:']"));
                //"//strong[text()='Culture Change']" ));
                //"//strong[text()='Agenda:']"));

        Assert.assertTrue("Element is not displayed.Switch to the new window",elementHeading.isDisplayed());

        //I need to switch back to the main window
       // driver.switchTo().window(mainPage);
       // WebElement joinNowLink = driver.findElement(By.xpath("//a[@href='https://www.toolsqa.com/selenium-training/']"));

      // BasicTutorialLink = driver.findElement(By.xpath("//a[text()='Basic Tutorial']"));
      //  Assert.assertTrue(driver.getTitle().contains("Elements"));
        //
        //div[@class="card-body"]
        //Assert.assertTrue(driver.findElement(By.xpath("(//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")).isDisplayed());
                //"+div[@class=\"card-body\"]")).isDisplayed());
       // "Join Now is not displayed. Switch to the new window"
        //"+div[@class=\"card-body\"]"
        //h1[text()='Selenium Training']
     // Assert.assertTrue("Failed to switch back to the home page",BasicTutorialLink.isDisplayed());

    }
    @Test
    public void practiceThreeWindows(){


        driver.get("https://demoqa.com/links");


       // WebDriverWait wait = new WebDriverWait(driver,20);

      //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.id("simpleLink")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //"//*[@id='dynamicLink']"
        // //*[@id='dynamicLink']
        //simpleLink

                //"simpleLink")).click();
        //after the click new window has opened.
        //in order to click on Join now button i first need to switch to the new window

        String mainPage = driver.getWindowHandle();
        Set<String>allOpenWindows = driver.getWindowHandles(); //only 2 values

        for(String windowHandle: allOpenWindows) {
            if(!windowHandle.equals(mainPage)){
                driver.switchTo().window(windowHandle);
            }
        }
        //now we are on the new window and we can interact with its elements

        WebElement joinNowLink = driver.findElement(By.xpath("//a[@href='https://www.toolsqa.com/selenium-training/']"));

        joinNowLink.click();
        //now I have 3 windows open

        String secondPage = driver.getWindowHandle();

        allOpenWindows = driver.getWindowHandles(); // now it will have 3 values\


        for(String windowHandle: allOpenWindows) {
            if(!windowHandle.equals(mainPage) && !windowHandle.equals(secondPage)) {
                //WebDriverWait wait = new WebDriverWait(driver, 10);
                driver.switchTo().window(windowHandle);
                //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                //now I am on the third page
            }
        }

        Assert.assertTrue(driver.getTitle().contains("Enroll is in the body"));
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='enroll__heading']")).isDisplayed());
       // WebDriverWait wait = new WebDriverWait(driver, 10);
        //  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //Enroll
        //Tools QA - Selenium Training
        //Assert.assertTrue(driver.findElement(By.xpath("//div[@class='enroll__heading']")).isDisplayed());
                ///html/body/header/nav/div/div/div[3]/div/div[1]/ul/li[2]/a")).isDisplayed());
                //"//h1[text()='Selenium Training']")).isDisplayed());
        //Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/div")).isDisplayed());
                ///html/body/div[1]")).isDisplayed());
                ///html/body/div[1]/div[1]/div/div[1]/div[2]/div")).isDisplayed());
    }
}
