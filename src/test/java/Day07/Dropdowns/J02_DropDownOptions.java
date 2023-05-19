package Day07.Dropdowns;

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
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class J02_DropDownOptions {
    /*
    amazona gidip,
    dropdown menuden books u secelim
    sectiğimiz optionu yazdıralım

    dropdown'daki opsiyonların toplam sayısının
    28 olduğunu test edin
     */

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void BurakKaan() {
        driver.get("http://www.amazon.com");

        WebElement ddm = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select select = new Select(ddm);

        select.selectByVisibleText("Books");

        System.out.println(select.getFirstSelectedOption().getText());

        List<WebElement> tümOpsiyonlar= select.getOptions();
        int opsiyonSayısı= tümOpsiyonlar.size();
        System.out.println("Opsiyon Sayısı = " + opsiyonSayısı);
        Assert.assertEquals(opsiyonSayısı,28);


    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
