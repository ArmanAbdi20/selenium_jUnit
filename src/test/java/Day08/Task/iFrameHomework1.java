package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iFrameHomework1 extends Base {

    /*
    https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
Web sitesini maximize yapınız.
İkinci emojiye tıklayınız.
Tüm ikinci emoji öğelerine tıklayınız.
Parent iframe geri dönünüz.
Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button’a basınız
     */


    @Test
    public void iFrameTest() throws InterruptedException {
        driver.get(" https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        driver.manage().window().maximize();

        WebElement iframe = driver.findElement(By.id("emoojis"));
        driver.switchTo().frame(iframe);

        //(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]
        driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]")).click();
        List<WebElement> emojiÖğeler = driver.findElements(By.xpath("//div[@id='nature']//div"));
        emojiÖğeler.stream().forEach(WebElement::click);
        driver.switchTo().parentFrame();

       // WebElement

        List<WebElement> textList = driver.findElements(By.xpath("//input[@class='mdl-textfield__input']"));
        List<String> text = new ArrayList<>(Arrays.asList("hello","world","biz","dostuz","barış","ve","huzur","getiriyoruz","bizi","liderinize","götürün"));

        for (int i = 0; i < textList.size(); i++) {
            textList.get(i).sendKeys(text.get(i));
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id ='send']")).click();






    }

}
