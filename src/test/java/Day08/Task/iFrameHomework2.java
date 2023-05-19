package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class iFrameHomework2 extends Base {
    /*
    Go to URL: http://demo.guru99.com/test/guru99home/
Find the number of iframes on the page.
Link to the fourth iframe (JMeter Made Easy) (https://www.guru99.com/live selenium project.html) click here.
Exit the iframe and return to the main page.
     */


    @Test
    public void iFrameHomeWorkTest(){

        driver.get("http://demo.guru99.com/test/guru99home/");

        int iframeNumber = driver.findElements(By.tagName("iframe")).size();
        System.out.println("iframeNumber = " + iframeNumber);

        driver.switchTo().frame("a077aa5e");

        driver.findElement(By.xpath("/html/body/a")).click();

        driver.switchTo().defaultContent();

    }
}
