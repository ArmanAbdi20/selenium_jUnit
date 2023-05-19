package Day11.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;

public class FileUploadHomework extends Base {

    /*
    Go to URL: https://www.monsterindia.com/seeker/registration
Upload file.
     */


    @Test
    public void testUploadFile(){

            driver.get("https://www.monsterindia.com/seeker/registration");

            String path = System.getProperty("user.dir") + System.getProperty("file.separator")+ "fileExists.txt";

        WebElement element = driver.findElement(By.xpath("//div[@class='uploadResumeContent']"));

        element.sendKeys(path);


    }
}
