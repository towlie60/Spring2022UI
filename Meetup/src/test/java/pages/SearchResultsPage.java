package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SearchResultsPage {

    public SearchResultsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindAll({
        @FindBy(xpath = "//p[@class='css-1jkijkx]")
    })
        public List<WebElement> onlineEventLinks;
    }


