package Day06.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxHomework1 {

    /*
    Go to https://the-internet.herokuapp.com/checkboxes
Locate the elements of checkboxes.
Then click on checkbox 1 if box is not selected.
Then click on checkbox 2 if box is not selected.
Then verify that checkbox 1 is checked.
     */

    @Test
    public void CheckboxHomework() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        Thread.sleep(3000);
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        Thread.sleep(3000);
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        if (checkbox2.isSelected()){
            checkbox2.click();
        }
        Thread.sleep(3000);
        checkbox1.click();
        checkbox2.click();

        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());

    }
}
