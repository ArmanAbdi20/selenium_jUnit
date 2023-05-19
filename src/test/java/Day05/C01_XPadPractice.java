package Day05;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_XPadPractice extends Base {



    @Test
    public void test01Positive() throws InterruptedException {

        /*
        opensource sitesine git.
        UserName alanına "Admin" değeri gir
        Password alanına "admin123" değeri yaz
        Login butonuna bas
        Sisteme giriş yapıldığını doğrula (url değişimi, sağ üstte isim yazıyor,

        Expected result-->sisteme giriş yapılabilmeli
         */

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement userName= driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");
        Thread.sleep(3000);
        WebElement password= driver.findElement(By.xpath("//*[@placeholder][@type]]"));
        password.sendKeys("admin123");
        Thread.sleep(3000);
        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        String actualURL= driver.getCurrentUrl();
        String expectedURL= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals(expectedURL, actualURL);



    }
    @Test
    public void test02Negative() throws InterruptedException {
         /*
        opensource sitesine git.
        UserName alanına "yanlış" değeri gir
        Password alanına "admin123" değeri yaz
        Login butonuna bas
        Sisteme giriş yapılamadığını doğrula (url değişimi, sağ üstte isim yazıyor,

        Expected result-->invalid credentials uyarısını al
         */

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement negativeUser = driver.findElement(By.xpath("//input[starts-with(@name,'user')][contains(@placeholder,'name')]"));
        negativeUser.sendKeys("karl");

        WebElement negativePassword = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
        negativePassword.sendKeys("admin123");

        WebElement negativeLogin = driver.findElement(By.xpath("//button[contains(.,'Login')]"));
        negativeLogin.click();
        Thread.sleep(3000);

        WebElement errorMessage = driver.findElement(By.xpath("//p[.='Invalid credentials']"));

        String actualResult =driver.getCurrentUrl();
        String expectedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

        Assert.assertEquals(actualResult, expectedURL);

    }



}
