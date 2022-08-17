package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MainPage {
    //in this class we will store all the web elements from the main page of Meetup


    //don't add all of the elements right away
    //instead, create your scenarios first and then add webelements to the page as you need them
    public MainPage(){
        //this line will initialize all the webelements on this page
        PageFactory.initElements(Driver.getDriver(),this);

    }

    //here we will add all the elements that belong to the main page
    //before every single webelement we need to tell how to find it
    //we use @FindBy annotation (xpath="your xpath here"

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/header/div[2]/div/div[1]/div/div[2]/a[1]")
           // "//a[text()='Log in'][1]")
    public WebElement loginButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/header/div[2]/div/div[1]/div/div[2]/a[2]" )
    public WebElement signupButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/main/div[2]/div/a")
    public WebElement joinMeetupButton;

    @FindBy(id = "  Assert.assertTrue(")
    public WebElement searchInputField;
    //here you can add more elements that you are using in your tests

    @FindBy(id = "search-button")
    public WebElement searchButton;

    @FindBy(xpath = "//input[@aria-label='Search for location by city or zip code']")
    public WebElement locationInputField;
    //in the page class you can add basic methods that you performed on the elements of this page

    @FindBys({
            @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/main/div[1]/div[4]/div[3]/div/div/div[2]/a[1]"),
            @FindBy(xpath = "//a[@aria-label='Online']")
    })
    public WebElement onlineLink;


    @FindAll({
            @FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/main/div[1]/div[4]/div[3]/div/div/div[2]/a[1]"),
            @FindBy(xpath = "//a[@aria-label='Online']")
    })

    public List<WebElement> someElement;
    public void clickJoinMeetup(){
        //you will need explicit waits before performing an action
        joinMeetupButton.click();
    }

    public void search(String searchCriteria, String location){
        searchInputField.sendKeys(searchCriteria);
        if(location!=null){
        //locationInputField.clear();
            locationInputField.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
            locationInputField.sendKeys(location);
        }
        searchButton.click();
    }

}
