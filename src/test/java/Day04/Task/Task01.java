package Day04.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {

    /*
         Go to http://automationpractice.com/index.php
        When we write an e-mail without the @ sign in the e-mail box and press enter.
        Let's test the "Invalid email address" warning.
     */
@Test
    public void testInvalidEmail() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.pl/index.php?controller=authentication&back=my-account");
       WebElement emailAdress= driver.findElement(By.xpath("//input[starts-with(@name,'email_cre')]"));
      //  WebElement emailAdress= driver.findElement(By.id("email_create"));
       // WebElement emailAdress= driver.findElement(By.name("email_create"));
      //  WebElement emailAdress= driver.findElement(By.xpath("//input[@type='text'][@id='email_create']"));
//    WebElement emailAddress = driver.findElement(By.xpath("//input[contains(@class,'account')][contains(@name,'create')]"));
        emailAdress.sendKeys("ebikGabık");
   // Thread.sleep(2000);
       emailAdress.submit();
   // Thread.sleep(3000);
       // WebElement errorMsg= driver.findElement(By.linkText("Invalid email address."));
       String actualErrorMsg = driver.getCurrentUrl();
       String expected ="http://automationpractice.pl/index.php?controller=authentication&back=my-account";
       Assert.assertEquals(expected,actualErrorMsg);
//    WebElement mailInput = driver.findElement(By.xpath("//input[@id='email_create']"));
//    mailInput.sendKeys("examplemail123.com");
//    Thread.sleep(2000);
//    mailInput.submit();
//    Thread.sleep(3000);
//    String error = driver.findElement(By.xpath("//div[@id='create_account_error']//li")).getText();
//    Assert.assertEquals("Invalid email address.",error);


    }
}
