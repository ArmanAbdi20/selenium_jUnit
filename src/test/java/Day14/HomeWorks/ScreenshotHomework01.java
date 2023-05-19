package Day14.HomeWorks;

import Utilities.Base;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotHomework01 extends Base {

    /*
    Go to amazon.com.
Take Page ScreenShot.
Spesific WebElement ScreenShot
     */

    @Test
    public void testScreenShot() throws IOException {

        driver.get("http://www.amazon.com/");
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshot = ts.getScreenshotAs(OutputType.FILE);


        FileHandler.copy(screenshot, new File(".\\test-output\\amazon.png"));

        WebElement img = driver.findElement(By.xpath("//img[@style='display:none']"));

        File source = img.getScreenshotAs(OutputType.FILE);

        FileHandler.copy(source, new File(".\\test-output\\mother.png"));



    }
}
