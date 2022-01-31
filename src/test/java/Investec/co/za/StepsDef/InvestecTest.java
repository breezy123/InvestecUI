package Investec.co.za.StepsDef;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import static Investec.co.za.core.Base.*;

public class InvestecTest {

    @Before(order=1)
    public void BeforeStep()throws Exception{
        setUpSeleniumWebDriver("chrome");
        initializePageObjects();
    }
    @Given("^User needs to be on the Investec public site$")
    public void userNeedsToBeOnTheInvestecPublicSite() { Assert.assertTrue(investecPO.navigateToPage());}

    @And("^User clicks on search Icon$")
    public void userClicksOnSearchIcon() { Assert.assertTrue(investecPO.clickSearchIcon());}

    @And("^User clicks on search filed$")
    public void userClicksOnSearchFiled() { Assert.assertTrue(investecPO.clickSearchTextfield());}

    @And("^User searches for Cash Investment Rates \"([^\"]*)\"$")
    public void userSearchesForCashInvestmentRates(String searchValue) throws Throwable {Assert.assertTrue(investecPO.enterSearchValue(searchValue)); }

    @And("^User removes information from the text$")
    public void userRemovesInformationFromTheText() { Assert.assertTrue(investecPO.backSpaceText());}

    @And("^User clicks on Search button$")
    public void userClicksOnSearchButton() { Assert.assertTrue(investecPO.clickSearchButton());}

    @And("^User scrolls down and click on Understanding cash investment interest rates$")
    public void userScrollsDownAndClickOnUnderstandingCashInvestmentInterestRates() throws Exception {
        Assert.assertTrue(investecPO.scrollDownTocashInvest());
        Thread.sleep(500);
        Assert.assertTrue(investecPO.clickTextinvestRate());
    }

    @And("^User scroll to SignUp and clicks on SignUp button$")
    public void userScrollToSignUpAndClicksOnSignUpButton() throws Exception{
        Assert.assertTrue(investecPO.scrollDownSignUpButton());
        Thread.sleep(500);
        Assert.assertTrue(investecPO.clickSignUpButton());
    }

    @And("^User enters first name \"([^\"]*)\"$")
    public void userEntersFirstName(String firstName) throws Throwable { Assert.assertTrue(investecSignUp.enterFirstName(firstName));}

    @And("^User enters surname \"([^\"]*)\"$")
    public void userEntersSurname(String surname) throws Throwable {
        Thread.sleep(500);
        Assert.assertTrue(investecSignUp.enterSurname(surname));
    }

    @And("^User enters email address \"([^\"]*)\"$")
    public void userEntersEmailAddress(String emailAddress) throws Throwable {
        Thread.sleep(500);
        Assert.assertTrue(investecSignUp.enterEmailAddress(emailAddress));
    }

    @And("^User selects Myself as an insight$")
    public void userSelectsMyselfAsAnInsight() { Assert.assertTrue(investecSignUp.clickCheckBoxMyself()); }

    @And("^User clicks on button Submit$")
    public void userClicksOnButtonSubmit() { Assert.assertTrue(investecSignUp.clickButtonSubmit());
    }

    @And("^User validates successful message$")
    public void userValidatesSuccessfulMessage() {
        Assert.assertTrue(investecSignUp.waitForThankMessage());
        Assert.assertTrue(investecSignUp.waitForThankMessage1());
    }

    @Then("^close browser$")
    public void closeBrowser() {
//        driver.quit();
//        driver =null;
    }

}
