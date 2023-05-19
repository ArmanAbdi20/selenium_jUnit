package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandleHomework04 extends Base {

    /*
    Go to URL: https://demoqa.com/browser-windows
Click on the windows - "WindowButton"
Click on all the child windows.
Print the text present on all the child windows in the console.
Print the heading of the parent window in the console.
     */


    @Test
    public void testWindowHandle(){

        driver.get("https://demoqa.com/browser-windows");
//
//        List<WebElement> buttons = driver.findElements(By.tagName("button"));
//
//        buttons.stream().forEach(WebElement::click);

        driver.findElement(By.xpath("//button[@id='tabButton']")).click();
        driver.findElement(By.xpath("//button[@id='windowButton']")).click();
        driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();

        Set<String> windows = driver.getWindowHandles();

        for (String win:windows) {
            driver.switchTo().window(win);
            System.out.println(driver.getTitle());
        }






    }
}
