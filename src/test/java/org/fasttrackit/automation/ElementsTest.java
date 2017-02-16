package org.fasttrackit.automation;

import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.CheckBox;
import com.sdl.selenium.web.utils.Utils;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ElementsTest extends TestBase {

    private LoginView loginView = new LoginView();
    private ElementView page = new ElementView();

    @Test
    public void checkboxesTest() {
        openLoginPage();

        loginView.login("eu@fast.com", "eu.pass");

        page.stopProcessCheckbox.click();
        page.labelWithEntercheckbox.click();

        Utils.sleep(2000);
        page.stopProcessLabel.click();
        page.withEnterLabel.click();

        Utils.sleep(2000);
        page.stopProcessLabel.click();
        page.withEnterLabel.click();

        assertThat("Stop the process is not selected!", page.stopProcessCheckbox.isSelected(), is(true));
        assertThat("Label with Enter.", page.labelWithEntercheckbox.isSelected(), is(true));


    }
    @Test
    public void dropDownTest(){
        openLoginPage();

        loginView.login("eu@fast.com", "eu.pass");

        page.autoOption.click();
        page.manualOption.click();
    }


}