package Day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethod {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();

        driver.get("https://www.automationexercise.com/");
        driver.manage().window().maximize();

        WebElement sinUpButton = driver.findElement(By.xpath("//a[contains(.,'Signup / Login')]"));
        System.out.println("sinUpButton.isDisplayed() = " + sinUpButton.isDisplayed());
        System.out.println("sinUpButton.getText() = " + sinUpButton.getText());
        System.out.println("sinUpButton.getCssValue(\"background\") = " + sinUpButton.getCssValue("background"));
        System.out.println("sinUpButton.getAttribute(\"href\") = " + sinUpButton.getAttribute("href"));
        sinUpButton.click();




    }
}
