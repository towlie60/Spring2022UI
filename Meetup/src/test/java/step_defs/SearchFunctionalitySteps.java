package step_defs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.MainPage;
import pages.SearchResultsPage;
import utilities.Driver;

import javax.naming.directory.SearchResult;
import java.util.List;

public class SearchFunctionalitySteps {

    WebDriver driver = Driver.getDriver();
    MainPage mainPage = new MainPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    @When("^the user executes the search for \"([^\"]*)\" in \"([^\"]*)\"$")
    public void the_User_Executes_The_Search_For_In(String searchCriteria, String location) throws InterruptedException {
        mainPage.search(searchCriteria, location);
        Thread.sleep(5000);
    }

    @Then("^verify the resultset contains search criteria in the title$")
    public void verify_The_Resultset_Contains_Search_Criteria_In_The_Title() {
        String expectedTitle = "Socratic Seminar";
        List<WebElement> searchResults = searchResultsPage.onlineEventLinks;

    }

//    for(
//    int i = 0; i<searchResults.size();i++)
//        System.out.println(searchResultsPage.got(i).getText());
//        Assert.assertTrue(searchResults.get(i).getText().contains(expectedTitle));
    }

