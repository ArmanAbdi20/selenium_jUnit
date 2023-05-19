package Day08.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

public class WindowHandleHomework02 extends Base {

    /*
    Go to URL: https://the-internet.herokuapp.com/windows
Verify the text: “Opening a new window”
Verify the title of the page is “The Internet”
Click on the “Click Here” button
Verify the new window title is “New Window”
Go back to the previous window and then verify the title: “The Internet”

     */

    @Test
    public void windowHandleTest() {

        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement text = driver.findElement(By.xpath("//h3[.='Opening a new window']"));

        String verifyText = text.getText();

        Assert.assertTrue(verifyText.equals("Opening a new window"));
        String homeId= driver.getWindowHandle();
        System.out.println("homeId = " + homeId);


        driver.findElement(By.xpath("//a[.='Click Here']")).click();
        Set<String> windowIds = driver.getWindowHandles();
        for (String newİd :windowIds) {
            if(!newİd.equals(homeId)){
                driver.switchTo().window(newİd);
            }

        }
        String newTabİd = driver.getWindowHandle();
        System.out.println("newTabİd = " + newTabİd);


        driver.switchTo().window(newTabİd);
        String textNewTab = driver.findElement(By.xpath("//h3[.='New Window']")).getText();

        Assert.assertTrue(textNewTab.equals("New Window"));

        driver.switchTo().window(homeId);
        String titleHome = driver.getTitle();

        Assert.assertTrue(titleHome.equals("The Internet"));





    }
}
