package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import  io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.EnvironmentManager;

public class BasicValidationSteps {

    WebDriver driver = Driver.getDriver();

    @Given("^the user is on the meetup homepage$")
    public void the_user_is_on_the_meetup_homepage() {
//    WebDriverManager.chromedriver().setup();
//    driver = new ChromeDriver();
//    driver.manage().window().maximize();
//    driver.get("https://www.meetup.com/");
        driver.get(EnvironmentManager.baseUrl);

 }
    @Then("^verify the title contains \"([^\"]*)\"$")
    public void verifyTheTitleContains(String expectedTitle) {
//        WebDriverWait wait = new WebDriverWait(driver,2);
//        wait.until(ExpectedConditions.titleContains(expectedTitle));
       String actualTitle = driver.getTitle();
       Assert.assertTrue(actualTitle.contains(expectedTitle));
//        driver.close();
//        driver.quit();
    }

    @Then("^verify homepage contains \"([^\"]*)\"$")
    public void verifyHomepageContains(String expectedUrl) {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.equals(expectedUrl));
       // driver.close();
        //driver.quit();
    }

}