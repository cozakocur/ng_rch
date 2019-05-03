package com.trello.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class BoardsPage extends PageObject {

    @FindBy(xpath = "//span[@class='header-btn-text'][contains(.,'Tablice')]")
    private WebElementFacade tabliceButton;

    public void checkThatLoggedInSuccessfull(){
        tabliceButton.isDisplayed();
    }

}
