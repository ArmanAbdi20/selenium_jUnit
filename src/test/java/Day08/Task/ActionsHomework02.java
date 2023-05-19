package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;

public class ActionsHomework02 extends Base {

    /*
    Go to URL: https://rangeslider.js.org/
    Shift 100 units to the right and 100 units to the left on the horizontal axis.
     */

    @Test
    public void testActionHomework(){

        driver.get("https://rangeslider.js.org/");

        WebElement greenBar = driver.findElement(By.xpath("(//div[@class='rangeslider__handle'])[1]"));

        actions.dragAndDropBy(greenBar, 100,0).dragAndDropBy(greenBar, -100,0).perform();
    }
}
