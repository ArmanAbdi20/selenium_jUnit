package Day08.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class SelectHomework extends Base {

    /*
    Go to URL: https://demoqa.com/select-menu
    Get all the options of the dropdown
    Options size
    Print all test
    Verify the dropdown has option "Black"
    Print FirstSelectedOptionTest
    Select option "Yellow"
     */

    @Test
    public void testSelect() throws InterruptedException {

        driver.get("https://demoqa.com/select-menu");

        WebElement oldElement = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));

        Select select = new Select(oldElement);

        List<WebElement> selectOptions = select.getOptions();

        List<String> selectedOptionsList = selectOptions.stream().map(t->t.getText()).toList();

        for (int i = 0; i <selectedOptionsList.size(); i++) {
            System.out.println(selectedOptionsList.get(i));

        }
        int option = selectedOptionsList.size();
        System.out.println("Options size = "+ option);
        select.selectByVisibleText("Black");
        Thread.sleep(1000);
        String actual  = select.getFirstSelectedOption().getText();
        String expected = "Black";
        Assert.assertTrue(actual.contains(expected));
        Thread.sleep(1000);
        select.selectByIndex(3);

        String actual2= select.getFirstSelectedOption().getText();
        String expected2= "Yellow";

        Assert.assertEquals(expected2, actual2);





    }

}
