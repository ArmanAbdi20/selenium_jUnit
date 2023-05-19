package Day04.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task03 {
    /*
    Navigate to website  https://testpages.herokuapp.com/styled/index.html
Under the ORIGINAL CONTENTS
Click on Alerts
Print the URL
Navigate back
Print the URL
Click on Basic Ajax
Print the URL
Enter value 20 and Enter
And then verify Submitted Values is displayed open page
Close driver.
     */

    @Test
    public void testBKA(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.herokuapp.com/styled/index.html");


    }
}
