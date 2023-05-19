package Day08.BasicAuthentication;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_BasicAuthentication extends Base {


    @Test
    public void testBasicAuthentication(){

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        WebElement congratulations = driver.findElement(By.tagName("p"));
        Assert.assertTrue(congratulations.getText().contains("Congratulations"));


    }
}
