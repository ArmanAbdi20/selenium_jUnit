package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandleHomework01 extends Base {

    /*
    Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
    Print the existing windowHandles ids by clicking all the links on the page.
    Click on the links that open a new page.
    Close other pages other than the home page.
    Set the driver back to the main page.
     */

    @Test
    public void testWindowHandles() throws InterruptedException {

        driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-popup-blocking");

        String homeId= driver.getWindowHandle();

        List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));

             links.get(0).click();
            links.get(1).click();

//        for (WebElement linkler:links) {
//            linkler.click();
//        }

        System.out.println("link sayısı : " +links.size());

        Thread.sleep(2000);

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> iter = windows.iterator();

        while (iter.hasNext()) {
            driver.switchTo().window(iter.next());

            if (driver.getWindowHandle().equals(homeId)) {
                continue;
            }
            driver.close();
        }


    }
}
