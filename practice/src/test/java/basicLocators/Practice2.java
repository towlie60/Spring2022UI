package basicLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


        
        public class Practice2 {

            @Test
            public void Practice2() throws InterruptedException {


                WebDriverManager.chromedriver().setup();

                ChromeDriver driver = new ChromeDriver();

                driver.get("https://www.google.com/");
                //using partial link text we will click on How Search works

                WebElement link = driver.findElement(By.partialLinkText("How Search"));
                link.click();
                Thread.sleep(2000);
                //Discover How Google Search Works

                String expected = "Discover How Google Search Works";

                Assert.assertTrue("Title verification failed. Expected: " + expected + ". Actual:"
                        + driver.getTitle(), driver.getTitle().contains(expected));
            }

        }