package Day06.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonHomework {

/*
Go to URL: https://demoqa.com/radio-button
Soruya verilen 3 seçeneğin de seçilme durumlarını doğrulayınız.
Her bir seçenek seçildiğinde aşağıda çıkan text’leri konsolda yazdırınız.

 */
    @Test
    public void testRadioButton() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/radio-button");
        WebElement yes= driver.findElement(By.xpath("//label[@class='custom-control-label'][1]"));
        yes.click();
        Thread.sleep(1000);
        WebElement yesMessage= driver.findElement(By.xpath("//span[@class='text-success']"));
        System.out.println("yesMessage.getText() = " + yesMessage.getText());
        Thread.sleep(1000);
        System.out.println("yes.isSelected() = " + yes.isSelected());
        WebElement imprevissive = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        imprevissive.click();
        Thread.sleep(1000);
        WebElement imprevissiveMessage= driver.findElement(By.xpath("//span[@class='text-success']"));
        System.out.println("imprevissiveMessage.getText() = " + imprevissiveMessage.getText());
        Thread.sleep(1000);
        System.out.println("imprevissive.isSelected() = " + imprevissive.isSelected());
        WebElement no= driver.findElement(By.xpath("//label[@for='noRadio']"));
        System.out.println("no.isDisplayed() = " + no.isDisplayed());


    }
}
