package Day08.Iframe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class J01_Iframe {


    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement baslıkElementi = driver.findElement(By.xpath("//*[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertTrue(baslıkElementi.isEnabled());
        System.out.println(baslıkElementi.getText());

        WebElement iframeElement = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframeElement);
        Thread.sleep(2000);
        WebElement textKutusu= driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        textKutusu.clear();
        textKutusu.sendKeys("Agama bolca selam olsun :)");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();

        WebElement linkElement = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        System.out.println(linkElement.getText());
        Assert.assertTrue(linkElement.isDisplayed());

    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }
}
