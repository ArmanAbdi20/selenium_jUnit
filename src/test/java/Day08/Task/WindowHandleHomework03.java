package Day08.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;

public class WindowHandleHomework03 extends Base {


    /*
    Go to URL: https://testproject.io/
Selenium’s 4 newWindow() method to open a new Window for TestProject’s Blog page.
https://blog.testproject.io/

     */


    @Test
    public void testWindowHandle() throws InterruptedException {

        driver.get("https://testproject.io/");

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://blog.testproject.io/");

       Assert.assertTrue(driver.findElement(By.xpath("//h1[text()='Test Automation Blog']")).getText().contains("Test Automation Blog"));

        Thread.sleep(2000);
        driver.quit();


    }

}
