package org.fasttrackit.automation;

import com.sdl.selenium.web.WebLocator;
import org.fasttrackit.util.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TablesTest extends TestBase {


    @Test
    public void selectTableRowTest() {
        openLoginPage();
        loginView.login("eu@fast.com", "eu.pass");

        WebElement checkbox = driver.findElement(By.xpath("//table//input"));

        checkbox.click();
    }

    @Test
    public void selectTableRow3Test() {
            openLoginPage();
        loginView.login("eu@fast.com", "eu.pass");

        //WebElement checkbox = driver.findElement(By.xpath("//table//tr[3]//input"));
        WebLocator checkbox = new WebLocator().setElPath("//table//tr[3]//input");

        checkbox.click();
    }


}
