package Day07.Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class J01_DropDown {

    /*
    amazona gidip
    dropdown dan book seceneğini secip,
    Java aratalım.
    ve arama sonuclarının Java içerdiğini test edelim
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
    public void testDropDown(){
        driver.get("http://www.amazon.com");

        WebElement dropdownMenu = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        Select select = new Select(dropdownMenu);

        select.selectByVisibleText("Books");

        WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        search.sendKeys("Java", Keys.ENTER);

        WebElement result = driver.findElement(By.xpath("//*[text()='1-16 of over 20,000 results for']"));

        Assert.assertTrue(result.isDisplayed());


    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
