package Day14.HomeWorks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadHomework  extends Base {

    /*
    Go to URL: https://www.monsterindia.com/seeker/registration
Upload file.
     */

    @Test
    public void testUploadFile() throws InterruptedException {

        driver.get("http://www.monsterindia.com/seeker/registration");

        String path = System.getProperty("user.dir") + System.getProperty("file.separator") + "dokuman.doc";

        WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));

        uploadElement.sendKeys(path);

        Thread.sleep(2000);

        driver.quit();

    }
}
