package Day06.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHomework2 {

/*
Go to URL: https://demoqa.com/
Click on Elements.
Click on Checkbox.
Verify if Home checkbox is selected.
Verify that "You have selected" is visible
 */

    @Test
    public void checkboxHomework() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/");

        WebElement element = driver.findElement(By.xpath("//div[@class='card mt-4 top-card'][1]"));
        element.click();
        Thread.sleep(1000);

        WebElement checkbox = driver.findElement(By.xpath("//li[@id='item-1']"));

        checkbox.click();
        Thread.sleep(1000);
        WebElement checkbox2 = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));
        checkbox2.click();
        Thread.sleep(1000);
        WebElement slect = driver.findElement(By.xpath("//span[text()='You have selected :']"));

        String message= slect.getText();
        System.out.println("message = " + message);


    }


}
