package Day03.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {


    public static void main(String[] args) throws InterruptedException {


        /*
        • Set Path.
        • Create chrome driver.
        • Maximize the window.
        • Open google home page https://www.google.com/
        • Verify that you are Google in the title.
         */

        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        String titleGoogle= driver.getTitle();
        System.out.println("titleGoogle = " + titleGoogle);

        System.out.println(titleGoogle.equals("Google") ? "Test is Passed" : "Test is Failed");

        Thread.sleep(3000);

        driver.quit();


    }




    @Test
    public void testGoogle (){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        String expected = "Google";
        Assert.assertTrue(driver.getTitle().contains(expected));
        driver.quit();

    }




}
