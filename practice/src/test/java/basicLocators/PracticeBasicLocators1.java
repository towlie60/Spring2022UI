//package basicLocators;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class PracticeBasicLocators1 {
//
//    @Test
//    public void testClassLocator() {
//        //navigate to google, find lin "celebrating women ..." and print out the text of the link
//        // and verify link text contains "future leaders"
//
//        //the new way we set up a driver -- independent from jar file
//        //this is new way you set up your driver - same as System.setProperty did
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.google.com/");
//        WebElement link = driver.findElement(By.className("pHiOh"));
//        String text = link.getText();
//        System.out.println(text);
//
//        Assert.assertTrue("Link text verification did not contain How Search works",text.contains("How Search works"));
//
//        driver.close();
//    }
//
//    //create a new test you navigate to
//    //use tag name locator and find the main heading on the page
//    //verify it contains word ""
//}

//how to do link text

//package basicLocators;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//public class PracticeBasicLocators {
//
//
//    @Test
//    public void testClassLocator() {
//    }
//
//    //lets go to google, click on gmail and verify url contain word mail
//    @Test
//    public void testLinkLocator() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//
//        driver.get("https://www.google.com/");
//
//        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
//
//        gmailLink.click();
//
//        Thread.sleep(3000);
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("maily"));
//
//        // driver.close();
//    }
//}