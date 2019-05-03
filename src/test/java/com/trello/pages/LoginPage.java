package com.trello.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

public class LoginPage extends PageObject {

    @FindBy(id = "user")
    private WebElementFacade emailInput;

    @FindBy(id = "password")
    private WebElementFacade passwordInput;

    @FindBy(id = "login")
    private WebElementFacade loginButton;

    @FindBy(xpath = "//p[contains(@class,'error-message')]")
    private WebElementFacade notValidPassword;

    @FindBy(xpath = "//p[contains(.,'Zbyt wiele nieprawidłowych prób podania hasła.')]")
    private WebElementFacade tooMuchAtteps;

    public void putEmail(String email){
        emailInput.click();
        emailInput.type(email);
    }
    public void putPassword(String password){
        passwordInput.click();
        passwordInput.typeAndEnter(password);
    }
    public void NotValidPasswordMessage(){
        notValidPassword.isDisplayed();
    }
    public void IsVisibleTooMuchAtteps(){
        tooMuchAtteps.isDisplayed();
    }

}
