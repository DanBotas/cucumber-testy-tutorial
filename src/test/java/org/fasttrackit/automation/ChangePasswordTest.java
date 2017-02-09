package org.fasttrackit.automation;

import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Dan Botas on 1/26/2017.
 */
    public class ChangePasswordTest extends TestBase {

    private LoginPage loginPage;
    private ChangePasswordPage page;

    public ChangePasswordTest() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        page = PageFactory.initElements(driver, ChangePasswordPage.class);
    }
    private void openPage(){
        openLoginPage();

        loginPage.login("eu@fast.com", "eu.pass");
        WebElement preferencesBtn = driver.findElement(By.xpath("//button[@data-target='#preferences-win']"));
        preferencesBtn.click();

        Utils.sleep(1000);
    }

    @Test
    public void changePasswordWithInvalidRepeatPassword() {
       openPage();
        page.changePassword("eu.pass", "new1.pass", "new2.pass");
        assertThat(page.getStatusMessage(), is("Password does not match the confirm password!"));
    }


    @Test
    public void changePasswordWithInvalidCurrentPassword() {
        openPage();
        page.changePassword("wrong.pass", "new.pass", "new.pass");
        assertThat(page.getStatusMessage(), is("Your preview password is incorrect!"));
    }
}

