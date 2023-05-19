package SeleniumCodeChallenge;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class Test01 extends Base {

/*
//1-Test01 isimli bir class olusturun
//2- https://www.amazon.com/ adresine gidin
//3- Browseri tam sayfa yapin
//4-Sayfayi "refresh" yapin
//5-"Salesforce Apex Questions Bank" icin arama yapiniz
//6- Kac sonuc bulundugunu yaziniz
//7-Sayfayi kapatin
 */

    @Test
    public void test01(){

        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();
        driver.navigate().refresh();
        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("Salesforce Apex Questions Bank" + Keys.ENTER);
        System.out.println(driver.findElement(By.xpath("//span[text()='4 results for']")).getText());
        driver.close();

    }


}
