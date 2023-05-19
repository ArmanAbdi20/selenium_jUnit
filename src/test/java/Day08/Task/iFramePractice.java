package Day08.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFramePractice extends Base {
    /*
    https://demoqa.com/frames
Bu sayfada pratik yapabilirsiniz.
     */

    @Test
    public void test() throws InterruptedException {
        driver.get("https://demoqa.com/frames");

        int iframeNumber = driver.findElements(By.tagName("iframe")).size();
        System.out.println("iframeNumber = " + iframeNumber);

        WebElement iframe = driver.findElement(By.xpath("//iframe[@id='frame1']"));

        driver.switchTo().frame(iframe);
        String iframeText= driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]")).getText();

        Assert.assertTrue(iframeText.contains("sample"));

        Thread.sleep(1000);
        driver.close();
    }

}
