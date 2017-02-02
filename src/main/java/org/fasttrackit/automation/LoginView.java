package org.fasttrackit.automation;

import com.sdl.selenium.web.WebLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Dan Botas on 1/26/2017.
 */
public class LoginView {

    private WebLocator emailField = new WebLocator().setId("email");

    private WebLocator passField = new WebLocator().setName("password");

    private WebLocator loginBtn = new WebLocator().setClasses("login-btn");


    public void login(String email, String pass ){
        emailField.sendKeys(email);
        passField.sendKeys(pass);
        loginBtn.click();
    }



}
