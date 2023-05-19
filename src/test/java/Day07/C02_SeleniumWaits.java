package Day07;

import Utilities.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C02_SeleniumWaits extends Base {

    //selenium wait ler selenium için kritik bir konsept tir.
    //senkronize bir şekilde elementleri bulmamızı ve "elementnotfound" gibi hataları almamızı engeller

    /*
    Implicit Wait-->sayfa ilk yüklendiğinde unable to locate element, element notfound gibi hataları engeller
                    sadece eelement locate bekleme konusunda yardımcı olur
                    global bir wait türüdür.
                    belirlenen süre boyunca element located edirmeye çalışılır, bulunamazsa hata fırlatılır.

    Explicit Wait-->Bir sonraki adım çalışmadan önce belirtilen şartın gerçekleşmesi için beklemeyi sağlayan kod parçasıdır.
                        ElementNotVisibleException bu hatayı vermeden önce maksimum bekleme süresi tanımlanır.

    Fluent Wait
     */




    public void explicitWait(){

        // Explicit Wait kullanımı;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));



        // wait objesine until metoduna istediğimiz conditions sağlanır

        // Expected conditions

        // varsayım: kodumuzun element yükleme durumunda olduğundan locate edilebilir ancak tıklanamıyorsa;

        By locator = By.id("elementId");
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click(); //1. yol
        driver.findElement(locator).click(); //2.yol

        // wait until ifadesi şart gerçekleştiğinde farklı formlara bürünebilir.
        //webelement
        //webdriver
        //boolean
        //alert
    }
}
