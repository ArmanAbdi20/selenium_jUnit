package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;
import org.openqa.selenium.interactions.Actions;

public class C04_Actions extends Base {



    @Test
    public void testActions() throws InterruptedException {



        /*
        Go to URL: https://demoqa.com/buttons
        Run the buttons on the page using the Actions Class.
        Verify the texts that appear after the buttons are operated.
         */

        driver.get("http://demoqa.com/buttons");
        Actions actions = new Actions(driver);

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        WebElement rightButton = driver.findElement(By.id("rightClickBtn"));

        WebElement clikbutton = driver.findElement(By.xpath("(//button)[4]"));

        actions.doubleClick(doubleClickButton).perform();
        Thread.sleep(500);
        actions.contextClick(rightButton).perform();
        Thread.sleep(500);
        actions.click(clikbutton).perform();

        //Action objesinde methodlar zincirlenebilir.

     //   actions.doubleClick(doubleClickButton).contextClick(rightButton).click(clikbutton).perform();


    }



}
