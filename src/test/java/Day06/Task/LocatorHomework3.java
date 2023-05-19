package Day06.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorHomework3 {

    /*
    Navigate to website  https://testpages.herokuapp.com/styled/index.html
Under the ORIGINAL CONTENTS
Click on Alerts
Print the URL
Navigate back
Print the URL
Click on Basic Ajax
Print the URL
Enter value 20 and Enter
And then verify Submitted Values is displayed open page
Close driver
     */


    @Test
    public void LocatorHomework() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement alert= driver.findElement(By.xpath("//a[@id='alert']"));
        alert.click();
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);
        driver.navigate().back();
        String backURL= driver.getCurrentUrl();
        System.out.println("backURL = " + backURL);
        WebElement basicAjax= driver.findElement(By.xpath("//a[@id='basicajax']"));
        basicAjax.click();
        String url2= driver.getCurrentUrl();
        System.out.println("url2 = " + url2);
        WebElement basicAjax2= driver.findElement(By.xpath("//input[@id='lteq30']"));
        basicAjax2.sendKeys("20");
        basicAjax2.submit();
        WebElement display =driver.findElement(By.xpath("//div[@id='_id']//..//p"));
        Assert.assertTrue(display.isDisplayed());

        Thread.sleep(2000);
        driver.quit();


    }
}
