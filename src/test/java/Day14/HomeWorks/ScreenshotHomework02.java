package Day14.HomeWorks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotHomework02 extends Base {

    /*
    Go to n11.com.
Take Full Page Screenshot.
Take Page ScreenShot.
Spesific WebElement ScreenShot
     */

    @Test
    public void testScreenshot() throws IOException {

        driver.get("http://www.n11.com");

        TakesScreenshot ts =(TakesScreenshot)driver;
        File screenshot = ts.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot, new File(".\\test-output\\n11.png"));

        WebElement resim = driver.findElement(By.xpath("(//img[@class='lazy cardImage'])[1]"));

        File screenShot2 = resim.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenShot2, new File(".\\test-output\\resim.png"));

        driver.quit();

    }
}
