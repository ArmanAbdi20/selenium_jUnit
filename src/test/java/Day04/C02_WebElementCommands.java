package Day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_WebElementCommands {

//    sendKeys() command // methodu elementimize gönderilen değeri klavye ile yazıyormuş gibi komut verir
//    isDisplayed() command //Web sayfasında bir web öğesinin varlığını doğrular.
//    isSelected() command //Web öğesinin seçilip seçilmediğini doğrular
//    isEnabled() command //Web öğesinin Web sayfası içinde etkinleştirilip etkinleştirilmediğini veya devre dışı bırakıldığını doğrulayın.
//    submit() command // formları submit yani göndermemize yardımcı olur. enter tuşu vazifesi görür
//    click() command // methodu elementimize mouse ile sol tık yapar
//    getLocation() command // methodu elementimizin sayfa üzerindeki konumunu verir
//    clear() command // input alanlarındaki yazıları silmeye yarar
//    getText() command // elementin content ini getirir
//    getAttribute() command // bize elementin istedğimiz attributes değerini getirir
//    getSize() command // elementin size nı getirir

    @Test
    public void webElementCommands() {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchBox= driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("İlk selenium kodumuzdan merhabalar...");


        WebElement serchButton = driver.findElement(By.id("nav-search-submit-button"));

        serchButton.click();

    }

    @Test
    public void id(){

    }
    @Test
    public void name(){


    }
    @Test
    public void className(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchBox= driver.findElement(By.className("nav-input"));





    }
    @Test
    public void tagName(){

    }
    @Test
    public void linkText(){

        //LinkText locatur u sadece <a> elementlerinde kullanılır

    }

    @Test
    public void partialLinkText(){

    }

    @Test
    public void xpad(){
        ///html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input -->absolute xpad hiç kullanılmaz değişebileceğinden hiç kullanılmaz

        // relative xpad--> sytax : //tagName[@attribute='value']
        //id locatur //input[@id='twotabsearchtextbox']
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchBox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        searchBox.sendKeys("xpad yöntemi çalışıyor...");



    }
}
