package com.trello.steps.cucumber;

import com.trello.pages.BoardsPage;
import com.trello.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.Map;

public class CheckTooManyAttemptsOfWrongCredentials {

    @Steps
    private LoginPage loginPage;

    @Steps
    private BoardsPage boardsPage;


    @And("^user enter not valid password five times$")
    public void userEnterNotValidPasswordFiveTimes(Map<String,String> data) {
        loginPage.putPassword(data.get("password"));
        loginPage.NotValidPasswordMessage();
        loginPage.putPassword(data.get("password"));
        loginPage.NotValidPasswordMessage();
        loginPage.putPassword(data.get("password"));
        loginPage.NotValidPasswordMessage();
        loginPage.putPassword(data.get("password"));
        loginPage.NotValidPasswordMessage();
        loginPage.putPassword(data.get("password"));
        loginPage.NotValidPasswordMessage();
    }

    @Then("^we are checking that we received message about blockade$")
    public void weAreCheckingThatWeReceivedMessageAboutBlockade() {
    loginPage.IsVisibleTooMuchAtteps();
    }
}
