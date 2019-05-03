package com.trello.steps.cucumber;

import com.trello.pages.HomePage;
import com.trello.pages.LoginPage;
import com.trello.pages.BoardsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import java.util.Map;

public class CheckLoginWithValidUsernameAndPassword {

    @Steps
    private HomePage homePage;

    @Steps
    private LoginPage loginPage;

    @Steps
    private BoardsPage boardsPage;


    @Given("^user is on login page$")
    public void userIsOnLoginPage() {
        homePage.open();
        homePage.goIntoLoginPage();
    }

    @When("^user enter properly username$")
    public void userEnterProperlyUsername(Map<String,String> data) {
        loginPage.putEmail(data.get("username"));
    }

    @And("^user enter properly password and click enter$")
    public void userEnterProperlyPasswordAndClickEnter(Map<String,String> data) {
        loginPage.putPassword(data.get("password"));
    }

    @Then("^we are checking that we have successfully logged in$")
    public void weAreCheckingThatWeHaveSuccessfullyLoggedIn() {
        boardsPage.checkThatLoggedInSuccessfull();
    }
}
