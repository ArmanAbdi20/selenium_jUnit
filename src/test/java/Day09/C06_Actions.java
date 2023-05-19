package Day09;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C06_Actions extends Base {

/*
Go to URL: http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
Fill in capitals by country.
 */
    @Test
    public void testActions() throws InterruptedException {


        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions = new Actions(driver);

        WebElement rome = driver.findElement(By.id("box6"));

        WebElement washington = driver.findElement(By.id("box3"));

        WebElement italy = driver.findElement(By.id("box106"));

        WebElement USA = driver.findElement(By.id("box103"));

        // yöntem01
        actions.dragAndDrop(rome,italy).perform();

        Thread.sleep(1000);

        //yöntem02;

        // elemente git tıkla ve basılı tut , diğer elemente git ve basılı tutmayı bırak;

        actions.moveToElement(washington).clickAndHold().moveToElement(USA).release().perform();


    }
}
