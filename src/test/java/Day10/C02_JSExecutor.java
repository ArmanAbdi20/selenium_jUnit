package Day10;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class C02_JSExecutor extends Base {


    @Test
    public void jsexecutor(){

        driver.get("https://www.amazon.com/");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        //jse.executeScript("alert(\"Merhaba Dünya!\");");

        //id = twotabsearchtextbox

//        jse.executeScript("console.log(\"JS kullanarak konsola siziyoruz\");");

        jse.executeScript("document.getElementById(\"twotabsearchtextbox\").style.backgroundColor = \"red\"");

    }


    @Test
    public void jsexecutor2() throws InterruptedException {

        //executeScript - ScrollBy () web sayfasını verilen piksel değeri kadar ileri gider.
        //executeScript - ScrollTo () web sayfasını verilen piksel değerine götürür.
        //scrollIntoView () web sayfasındaki bir öğenin görünürlüğüne göre kaydırır.

        driver.get("https://www.amazon.com");

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        jse.executeScript("window.scrollBy(0,800);");

        Thread.sleep(1000);

        jse.executeScript("window.scrollTo(0,0)"); //sayfanın en üstü

        Thread.sleep(1000);

        jse.executeScript("window.scrollIntTo(0,document.body.scrollHeight);");

        jse.executeScript("arguments[0].scrollIntoView()",driver.findElement(By.id("gw-sign-in-button")));
    }
}
