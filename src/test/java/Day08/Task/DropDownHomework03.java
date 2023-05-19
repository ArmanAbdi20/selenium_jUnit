package Day08.Task;

import Day04.C01_Locators;
import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHomework03 extends Base {

    /*
    Launch the browser.
Open "https://demoqa.com/select-menu".
Select the Standard Multi-Select using the element id.
Verifying that the element is multi-select.
Select 'Opel' using the index and deselect the same using index.
Select 'Saab' using value and deselect the same using value.
Deselect all the options.
Close the browser.
     */

    @Test
    public void DropDownMultiSelectTest() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement multiSelect = driver.findElement(By.id("cars"));
        Select selection = new Select(multiSelect);
        Assert.assertTrue(selection.isMultiple());
        selection.selectByIndex(2);
        Thread.sleep(1000);
        selection.deselectByIndex(2);
        Thread.sleep(1000);
        selection.selectByValue("saab");
        Thread.sleep(1000);
        selection.deselectByValue("saab");
        Thread.sleep(500);
        selection.selectByIndex(0);
        Thread.sleep(500);
        selection.selectByIndex(1);
        Thread.sleep(500);
        selection.selectByIndex(2);
        Thread.sleep(500);
        selection.selectByIndex(3);
        Thread.sleep(1000);
        selection.deselectAll();
        Thread.sleep(1000);
        driver.quit();

    }
}
