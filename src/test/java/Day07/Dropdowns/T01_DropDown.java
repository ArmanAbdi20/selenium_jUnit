package Day07.Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class T01_DropDown {
    /*
    https://www.vivense.com/ a git
    oturma odası sekmesindeki
    berjer i tıkla
    çıkan sonuçları yazdır
     */

    WebDriver driver;
    @Before
    public void setUp(){
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
    public void test() throws InterruptedException {
        driver.get("https://www.vivense.com/");
        WebElement oturmaOdası = driver.findElement(By.xpath("//a[@class='main_category_name'][2]"));
        Select select = new Select(oturmaOdası);
        select.selectByVisibleText("Berjer");
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);


    }
}
