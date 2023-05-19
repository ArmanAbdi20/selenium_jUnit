package SeleniumCodeChallenge;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task01 extends Base {

    /*
     //Kaynak https://www.techlistic.com/p/selenium-tutorials.html

//    1. Open this url  http://automationpractice.pl/index.php
//    2. Click on sign in link.
//    3. Verify sign in page
//    3. Enter your email address in 'Create and account' section.
//    4. Click on Create an Account button.
//    5. Enter your Personal Information, Address and Contact info.
//    6. Click on Register button.
//    7. Validate that user is created.
     */

    @Test
    public void test01(){

        driver.get("http://automationpractice.pl/index.php");

        WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
        signIn.click();

        WebElement authenticate = driver.findElement(By.xpath("//h1[@class='page-heading']"));
        String text = authenticate.getText();
        System.out.println(text);

        Assert.assertEquals("AUTHENTICATION",text);







    }
}
