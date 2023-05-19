package Day08;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C04_SentKeys extends Base {


    @Test
    public void test(){
        // amazon.com a git
        // arama kısmına herhangi birşey yaz
        // enter e tıklayarak gir.
        driver.get("https://www.amazon.com.tr/");

        WebElement arama = driver.findElement(By.id("twotabsearchtextbox"));

        arama.sendKeys("keyboard", Keys.ENTER);

    }

    @Test
    public void clear() throws InterruptedException {

        // java döngüsü kullanarak text bitene kadar BackSpace tuşu basılabilir

        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame(0);

        WebElement text = driver.findElement(By.tagName("p"));


        for (int i = 0; i < text.getText().length(); i++) {
            text.sendKeys(Keys.BACK_SPACE);
            Thread.sleep(1000);
        }
    }

}
