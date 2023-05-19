package Day06.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorHomework5 {
    /*
    Navigate to https://testpages.herokuapp.com/styled/indx.html
Click on Calculate under Micro Apps.
Type any number in the first input.
Type any number in the second input.
Click on Calculate.
Get the result.
Print the result.
     */


    @Test
    public void LocatorHomework5() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Thread.sleep(1000);
        WebElement calculating = driver.findElement(By.xpath("//a[@id='calculatetest']"));
        calculating.click();
        Thread.sleep(1000);
        WebElement number1= driver.findElement(By.xpath("//input[@id='number1']"));
        number1.sendKeys("1453");
        Thread.sleep(1000);
        WebElement number2= driver.findElement(By.xpath("//input[@id='number2']"));
        number2.sendKeys("1071");
        Thread.sleep(1000);
        WebElement calculate = driver.findElement(By.xpath("//input[@id='calculate']"));
        calculate.click();
        Thread.sleep(1000);
        WebElement answer= driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println("answer.getText() = " + answer.getText());
        String actual = answer.getText();
        String expect = "2524";
        Assert.assertEquals(expect,actual);


    }
}
