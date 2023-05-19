package Day07.Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class J03_DropDown {

    /*
    https://the-internet.herokuapp.com/dropdown adresine gidin,
    1- index kullanarak seçenek 1 i seçin ve yazdırın
    2- value kullanarak seçenek 2 i seçin ve yazdırın
    3- visible text kullanarak seçenek 1 i seçin ve yazdırın
    4- tüm drop down değerleri yazdırın
    5- dropdown boyutunu bulup 4 öğe varsa true , değilse false yazdırın

     */
    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void testDropDown() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        Thread.sleep(2000);

        WebElement ddm = driver.findElement(By.xpath("//select[@id='dropdown']"));

        Select select = new Select(ddm);

        select.selectByIndex(1);

        System.out.println(select.getFirstSelectedOption().getText());

        Thread.sleep(2000);

        select.selectByValue("2");

        System.out.println(select.getFirstSelectedOption().getText());

        Thread.sleep(2000);

        select.selectByVisibleText("Option 1");

        System.out.println(select.getFirstSelectedOption().getText());

        Thread.sleep(2000);

        List<WebElement> tumOpsiyonlar= select.getOptions();

        for (WebElement each:tumOpsiyonlar) {
            System.out.println(each.getText());
        }

        Thread.sleep(2000);

        int index =tumOpsiyonlar.size();
        System.out.println("index = " + index);

        if (index==4){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
