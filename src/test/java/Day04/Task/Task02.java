package Day04.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    /*
    Go to http://www.google.com
    Type "Green Mile" in the search box and print the number of results.
    Type "Premonition" in the search box and print the number of results.
    Type "The Curious Case of Benjamin Button" in the search box and print the number of results.
     */




    @Test
    public void testGreenMile() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        Thread.sleep(3000);
        WebElement serch= driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        serch.sendKeys("Green Mile");
        serch.submit();
        System.out.println("sonuç : " + driver.findElement(By.id("result-stats")).getText());

        driver.quit();

    }

    @Test
    public void testPremonition() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        Thread.sleep(3000);
        WebElement serch= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
        serch.sendKeys("Premonition");
        serch.submit();
        System.out.println("sonuç : " + driver.findElement(By.id("result-stats")).getText());

        driver.quit();
    }



    @Test
    public void testBenjaminButton() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        Thread.sleep(3000);

        WebElement serch= driver.findElement(By.xpath("//textarea[starts-with(@data-ved,'0ahUK')]"));
        serch.sendKeys("The Curious Case of Benjamin Button");
        serch.submit();
        System.out.println("sonuç :"  + driver.findElement(By.id("result-stats")).getText());

        driver.quit();

    }
}
