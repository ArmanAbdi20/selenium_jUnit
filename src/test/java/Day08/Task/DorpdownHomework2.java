package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DorpdownHomework2 extends Base {

    /*
    Launch the browser.
    Open "https://demoqa.com/select-menu".
    Select the Old Style Select Menu using the element id.
    Print all the options of the dropdown.
    Select 'Purple' using the index.
    After that, select 'Magenta' using visible text.
    Select an option using value.
     Close the browser.
     */




    @Test
    public void DropDownTest() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
       WebElement selectOpt= driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(selectOpt);
        List<WebElement> selectWE = select.getOptions();
        List<String> selectOptionsList = selectWE.stream().map(a->a.getText()).toList();
        System.out.println("select options list :" + selectOptionsList);

        select.selectByIndex(4);
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        select.selectByVisibleText("Magenta");
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        select.selectByValue("7");
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(1000);
        driver.quit();
    }

}
