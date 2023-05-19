package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectHomework extends Base {

    /*
    Go to URL: https://demoqa.com/select-menu
Select options in Standard multiple select

     */

    @Test
    public void testSelect() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");

        WebElement standartMS = driver.findElement(By.xpath("//select[@name='cars']"));

        Select select = new Select(standartMS);
        select.selectByVisibleText("Volvo");
        Thread.sleep(1000);
        select.selectByValue("saab");
        Thread.sleep(1000);
        select.selectByIndex(3);
        Thread.sleep(1000);
        select.deselectAll();

    }

}
