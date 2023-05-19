package SeleniumCodeChallenge;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task02 extends Base {


    /*
1. http://zero.webappsecurity.com sayfasina gidin
2. Signin buttonuna tiklayin
3. Login alanine  "username" yazdirin
4. Password alanine "password" yazdirin
5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
6. Online Banking menusunden Pay Bills sayfasina gidin
7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
8. tarih kismina "2020-09-10" yazdirin
9. Pay buttonuna tiklayin
10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin
*/


    @Test
    public void test() throws InterruptedException {

        driver.get("http://zero.webappsecurity.com");
        driver.findElement(By.id("signin_button")).click(); //signin button click

        driver.findElement(By.id("user_login")).sendKeys("username"); //login alanına "username" yazdirin

        driver.findElement(By.id("user_password")).sendKeys("password"); // password alanı "password" yaz

        driver.findElement(By.xpath("//input[@name='submit']")).click(); //signin button click

        driver.navigate().back();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//strong[text()='Online Banking']")).click(); //online banking button click

        Thread.sleep(1000);

        driver.findElement(By.id("pay_bills_link")).click(); // pay bills link click

        Thread.sleep(1000);

        driver.findElement(By.id("sp_amount")).sendKeys("10000"); // amount send keys:10000

        driver.findElement(By.xpath("//input[@id='sp_date']")).sendKeys("2020-09-10"); // date send keys:2020-09-10

        driver.findElement(By.xpath("//input[@id='pay_saved_payees']")).click(); // pay button click

        Thread.sleep(1000);

        String message = driver.findElement(By.xpath("//span[text()='The payment was successfully submitted.']")).getText(); // message

        Assert.assertTrue(message.contains("The payment was"));

        Thread.sleep(1000);

        driver.close();










    }


}
