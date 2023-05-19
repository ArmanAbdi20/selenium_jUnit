package Day07.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetOptionsTest extends Base {
    /*
    Get all the options of the dropdown
    Options size
Print all test
Verify the dropdown has option "Black"
Print FirstSelectedOptionTest
Select option "Yellow
     */


    @Test
    public void getOptions() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement oldStyleMenu = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));

        Select select = new Select(oldStyleMenu);

        List<WebElement> oldStyleMenuElements= select.getOptions();
        List<String> optionsValues= oldStyleMenuElements.stream().map(e -> e.getText()).toList();
        System.out.println("optionsValues = " + optionsValues);
        int size= oldStyleMenuElements.size();
        System.out.println("Options size = " + size);
        Thread.sleep(1000);
        select.selectByVisibleText("Black");
        String actual= select.getFirstSelectedOption().getText();
        String expected= "Black";
        Assert.assertEquals(expected, actual);
        Thread.sleep(1000);

        select.selectByIndex(3);

        String actual2= select.getFirstSelectedOption().getText();
        String expected2= "Yellow";

        Assert.assertEquals(expected2, actual2);





    }
}
