package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;
import utilities.Driver;
import utilities.EnvironmentManager;

public class LoginFlowSteps {

    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage();

//    @Given("^the user on Meetup home page\\)$")
//    public void theUserOnMeetupHomePage() {
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////        driver.manage().window().maximize();
////        driver.get("https://www.meetup.com/");
//        driver.get(EnvironmentManager.baseUrl);
//    }

    @Then("^User should be able to see \"([^\"]*)\" button$")
    public void user_should_be_able_to_see_button(String button) {
        //   WebElement buttonToVerify =  driver.findElement(By.xpath("//a[text()='" +button+ "'][1]"));
        if (button.equalsIgnoreCase("Log in")) {
            Assert.assertTrue("Button is not displayed", mainPage.loginButton.isDisplayed());
        } else if (button.equalsIgnoreCase("sign up")) {
            Assert.assertTrue("Button is not displayed", mainPage.signupButton.isDisplayed());

        } else if (button.equalsIgnoreCase("join meetup")) {
            Assert.assertTrue("Button is not displayed", mainPage.joinMeetupButton.isDisplayed());
        }

    }
}
