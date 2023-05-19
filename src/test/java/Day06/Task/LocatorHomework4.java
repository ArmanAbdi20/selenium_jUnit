package Day06.Task;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorHomework4 {

    /*
    https://id.heroku.com/login sayfasına gidiniz.
Bir mail adresi giriniz.
Bir password giriniz.
Login butonuna tıklayınız.
"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
Tüm sayfaları kapatınız.

     */

    @Test
    public void LocatorHomework4() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://id.heroku.com/login");
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
       email.sendKeys("ebik@gabık.com");
        Thread.sleep(1000);
       WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
       password.sendKeys("agamaselam");
        Thread.sleep(1000);
       WebElement login = driver.findElement(By.xpath("//button[@name='commit']"));
       login.submit();
       String error= driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
        Thread.sleep(1000);
       if(error.equals("There was a problem with your login.")){
           System.out.println("Kayıt Yapılamadı");
        }else System.out.println("Kayıt Yapıldı");
       Thread.sleep(1000);
       driver.quit();




    }
}
