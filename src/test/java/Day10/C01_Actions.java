package Day10;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C01_Actions extends Base {


    @Test
    public void test01(){

        /*
        google a git
        arama kısmına chatGPT yaz
         */

        driver.get("https://www.google.com.tr/");
        WebElement search = driver.findElement(By.name("q"));

        //mouse de basılı tutma işlemi clickAndHold ile yapılır bırakmak için release ile yapılır

       // search.sendKeys("searchgpt");

        //keyDown klavyeden bir tuşa basılı tutmaya yarar
        //keyUp klavyeden basılı tuşu bırakmaya yarar.

        actions.
                moveToElement(search).
                click().
                sendKeys("chat").
                keyDown(Keys.SHIFT).
                sendKeys("gpt").
                keyUp(Keys.SHIFT).perform();

    }
}
