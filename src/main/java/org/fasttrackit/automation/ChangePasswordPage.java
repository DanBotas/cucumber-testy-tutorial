package org.fasttrackit.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Dan Botas on 1/26/2017.
 */
public class ChangePasswordPage {

    @FindBy(name = "password")
    private WebElement currentPasswordField; //= driver.findElement(By.name("password"));
    @FindBy(name = "newPassword")
    private WebElement newPasswordField; //= driver.findElement(By.name("newPassword"));
    @FindBy(name = "newPasswordRepeat")
    private WebElement repeatPasswordField;//= driver.findElement(By.name("newPasswordRepeat"));

   public void changePassword(String currentPass, String newPass, String repeatnewPass){
        currentPasswordField.sendKeys("wrong.pass");
        newPasswordField.sendKeys("new.pass");
        repeatPasswordField.sendKeys("new.pass");
    }
}
