package DigitalBank;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

import java.util.List;


public class SignUp {

    WebDriver driver;

    @Test


    public void Test1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("http://3.129.60.236:8080/bank/login");
        // driver.manage().window().maximize();
        //  WebElement title = driver.findElement(By.className("login-content"));
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[4]/p/a"));
        //   Assert.assertTrue("Welcome text contains wrong name")).contains;
//        driver.findElement(By.id("username")).sendKeys("Miguel");
//        driver.findElement(By.id("password")).sendKeys("Hernandez");
//        driver.findElement(By.id("submit")).sendKeys("Sign In");

    }

    @Test
    public void Test2() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("http://3.129.60.236:8080/bank/login");
        // driver.manage().window().maximize();
        WebElement title = driver.findElement(By.className("login-content"));
        driver.findElement(By.id("username")).sendKeys("mahtt2019@gmail.com");
        driver.findElement(By.id("password")).sendKeys("@Giantz12323");
        driver.findElement(By.id("submit")).sendKeys("Sign In");
    }

    @Test
    public void Test3() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("http://3.129.60.236:8080/bank/login");
        // driver.manage().window().maximize();
        // WebElement title = driver.findElement(By.className("login-content"));
        driver.findElement(By.id("username")).sendKeys("towlie60");
        driver.findElement(By.id("password")).sendKeys("@Giantz12323");
        driver.findElement(By.id("submit")).sendKeys("Sign In");
//        WebDriverManager.chromedriver().setup();
//
//        driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//        driver.navigate().to("http://3.129.60.236:8080/bank/signup");
//        //driver.navigate().to(//input[@class=''container]"");
//        Select title = new Select(driver.findElement(By.id("title")));
//        driver.findElement(By.xpath("//*[@id=\"title\"]/option[2]"));
//        //title.selectByVisibleText("Mr");
//            driver.findElement(By.xpath("//input[@id='x']")).sendKeys("mahernandez");
//            driver.findElement(By.id("password")).sendKeys("Tacos23123");
//
//            driver.findElement(By.xpath("//input[@value='M']")).click();
//            // driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/form/div[4]/p/a"));

    }

    @Test
    public void Test4() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.navigate().to("http://3.129.60.236:8080/bank/login");
        // driver.manage().window().maximize();
        // WebElement title = driver.findElement(By.className("login-content"));
        driver.findElement(By.id("username")).sendKeys("mahtt2019@gmail.com");
        driver.findElement(By.id("password")).sendKeys("@Giantz12323");
        driver.findElement(By.id("submit")).sendKeys("Sign In");




    }
}

