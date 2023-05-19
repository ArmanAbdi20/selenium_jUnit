package Day08.Alerts;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C01_Alerts extends Base {

    /*
    Alertler; görüntüleyen ve belirli işlemler için izin isteyen bazı bilgileri kullanıcıya bildiren küçük açılır
kutular/pencerelerdir. Ek olarak, bunları uyarı amaçlı da kullanabiliriz. Bazen kullanıcı uyarı kutusuna birkaç
bilgi de girebilir.

Simple
Alert :Bu uyarılar yalnızca bilgi amaçlı uyarılardır ve
üzerlerinde bir OK düğmesi bulunur.
Kullanıcılar, uyarı kutusunda görüntülenen
mesajı okuduktan sonra OK düğmesine
tıklayabilir.

Promp
Alert :Bu uyarılar kullanıcının uyarı kutusuna girmesi
gereken metin şeklinde bazı giriş
gereksinimleri vardır. Kullanıcının kullanıcı
adını girip OK düğmesine basabileceği veya
herhangi bir ayrıntı girmeden uyarı kutusunu
iptal edebilir.

Confirmation Alert: Kullanıcıdan mesaj kutusunu kabul etme
veya reddetme şeklinde bir miktar onay
alır. Kullanılabilir metin kutusu olmadığı için
kullanıcının hiçbir şey giremeyeceği şekilde
istem uyarılarından farklıdırlar. Kullanıcılar
sadece OK/ Cancel düğmesine basarak
mesajı okuyabilir ve girişleri sağlayabilir.


     */

    @Test
    public void testAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    // click for JS alert buttonuna tıklama;
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        buttons.get(0).click();

        driver.switchTo().alert().accept();

        Thread.sleep(2000);

   // click for JS confirm buttonuna tıklama;

            buttons.get(1).click();
            driver.switchTo().alert().dismiss();

        Thread.sleep(2000);

    // click for JS Prompt buttonuna tıklama;

        buttons.get(2).click();
        driver.switchTo().alert().sendKeys("agama bolca selam :)");
        driver.switchTo().alert().accept();


    }
}
