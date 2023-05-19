package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ActionsHomework03 extends Base {

    /*
    Go to URL: https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html
Shift 34 units to the right and 34 units to the left on the vertical axis.
     */

    @Test
    public void testActionHomework() throws InterruptedException {

        driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement dikeyBar= driver.findElement(By.xpath("(//span[@class='range-slider-handle'])[1]"));

        actions.dragAndDropBy(dikeyBar,0,34).perform();

        Thread.sleep(1000);

        WebElement yatayBar = driver.findElement(By.xpath("(//span[@class='range-slider-handle'])[2]"));

        actions.dragAndDropBy(yatayBar,-34,0).perform();

        Thread.sleep(1000);

        driver.quit();
    }
}
