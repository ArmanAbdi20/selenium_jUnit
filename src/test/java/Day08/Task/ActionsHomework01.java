package Day08.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ActionsHomework01 extends Base {


    /*
    Go to URL: http://demo.guru99.com/test/drag_drop.html
Drag and drop the BANK button to the Account section in DEBIT SIDE
Drag and drop the SALES button to the Account section in CREDIT SIDE
Drag and drop the 5000 button to the Amount section in DEBIT SIDE
Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
Verify the visibility of Perfect text.

     */

    @Test
    public void testActionsHomework01() throws InterruptedException {

        driver.get("http://demo.guru99.com/test/drag_drop.html");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));

        WebElement bankButton = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement accountsDebit = driver.findElement(By.id("shoppingCart1"));

       actions.dragAndDrop(bankButton,accountsDebit).perform();
        Thread.sleep(2000);

        WebElement salesButton = driver.findElement(By.xpath("//a[text()=' SALES ']"));
        WebElement accountsCredit = driver.findElement(By.id("shoppingCart3"));

       actions.dragAndDrop(salesButton,accountsCredit).perform();

        Thread.sleep(2000);
        WebElement besbinButton = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
        WebElement amoutDebit = driver.findElement(By.id("amt7"));

        actions.dragAndDrop(besbinButton, amoutDebit).perform();

        Thread.sleep(2000);

        WebElement besbinButtonİki = driver.findElement(By.xpath("//a[text()=' 5000']"));
        WebElement amoutCredit =  driver.findElement(By.id("amt8"));

        actions.dragAndDrop(besbinButtonİki,amoutCredit).perform();

        WebElement perfect = driver.findElement(By.xpath("(//a[@class='button button-green'])[1]"));
        Assert.assertTrue( perfect.getText().equals("Perfect!"));





    }

}
