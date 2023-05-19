package Day03.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {


    public static void main(String[] args) {

          /*
        Go to Amazon homepage.
        Do the following tasks by creating 2 different test methods.
        1- Test if the URL contains Amazon.
        2- Test if the title does not contain Facebook.
         */







    }
    @Test
    public void testURL(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        String expected = "amazon";
        String actual = driver.getCurrentUrl();
        Assert.assertTrue(actual.contains(expected));
        driver.quit();

    }

    @Test
    public void testTitle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        String expected = "Facebook";
        String actual = driver.getTitle();
        Assert.assertFalse(actual.contains(expected));
        driver.quit();

    }

}
