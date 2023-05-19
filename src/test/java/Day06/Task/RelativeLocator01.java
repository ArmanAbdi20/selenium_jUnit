package Day06.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class RelativeLocator01 {
    /*
    https://www.dpu.edu.tr/ adresine git
    öğrenci sekmesine
    araştırma sekmesi üzerinde locator işlemi uygula

     */

    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test(){
        driver.get("https://www.dpu.edu.tr/");

        By duyuruİlk = RelativeLocator.with(By.tagName("div")).toLeftOf(By.xpath("//div[@class='baslik'][2]"));
       WebElement ilkDuyuru =driver.findElement(duyuruİlk);
       ilkDuyuru.click();
      String beklenenURL=" https://www.dpu.edu.tr/index/duyuru/2451/dpunun-ilk-international-staff-week-programi-basladi";
      String olusanURL= driver.getCurrentUrl();
      Assert.assertEquals(beklenenURL, olusanURL);
    }
}
