package com.trello.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class HomePage extends PageObject {

    @FindBy(xpath = "//a[@href='/login']")
    private WebElementFacade loginButton;

    public void goIntoLoginPage(){
        loginButton.click();
    }

}
