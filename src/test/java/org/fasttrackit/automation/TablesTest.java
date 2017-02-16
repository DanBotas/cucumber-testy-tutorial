package org.fasttrackit.automation;

import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.CheckBox;
import com.sdl.selenium.web.table.Cell;
import com.sdl.selenium.web.table.Row;
import com.sdl.selenium.web.table.Table;
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

    @Test
    public void selectRowByEmail(){
        openLoginPage();
        loginView.login("eu@fast.com", "eu.pass");

        Table table = new Table();

        Row row = table.getRow(new Cell(4,"davidmiller@mail.com"));

        CheckBox checkbox = new CheckBox(row);
        checkbox.click();

    }

}
