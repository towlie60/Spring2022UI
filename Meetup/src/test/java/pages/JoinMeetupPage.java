package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class JoinMeetupPage {

    public JoinMeetupPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/main/div/div/div/section/form/div[3]/a[1]")
    public WebElement continueWithFaceBook;

    //here you will have to add the rest of the elements from this page
    //that you use in your scenario
}
