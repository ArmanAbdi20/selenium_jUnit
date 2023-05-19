package Day07;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class C01_DropDown extends Base {
    /*
    dropdown özel etkileşimler gerektirdiğinden dolayı selenium tarafından dropdown için ayrı class oluşturulmuştur.
    bu class Select dir.
    drodown ile çalışırken;
    1-<select> elementi locate edilir
    2- Select elementini kullanarak Select objesi oluşturulur
    Select select = new Select(element)
    3- Select objesiyle özel metodlar kullanılır
     */

    @Test
    public void testDropDown(){
        driver.get("https://demoqa.com/select-menu");
        WebElement selecTitle = driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder'][2]"));
        Select select = new Select(selecTitle);
        //select class ı kullanılırken elementimiz kesinlikle select olmalıdır.


    }

    @Test
    public void testDropDown2() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        WebElement selecOldStyle = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
        Select select = new Select(selecOldStyle);
        //select elementi ile seçim yapmaya yarayan 3 metod;
        //1. metod-->select by index
        //2. metod-->select by value
        //3. metod-->select by visible text
        select.selectByIndex(4);//5. sıradaki purple rengi seçilir

        Thread.sleep(2000);

        select.selectByValue("red"); // value attribute red olan Red seçilir

        Thread.sleep(2000);

        select.selectByVisibleText("Magenta"); //content i Magenta olan Magenta seçilir

        //select elementinde seçimi kaldırmamıza yarayan metodlar;(sadece multi select lerde kullanılır)
        //1. metod-->deselect by index
        //2. metod-->deselect by value
        //3. metod-->deselect by visible text
        //4. metod-->deselectAll --> bütün seçimleri kaldırır.

        // info amacıyla kullanılan metodlar
        select.getAllSelectedOptions();
        select.getFirstSelectedOption();
        select.getOptions();// --> select elementinin tüm optionları list halinde getirir
        select.isMultiple();// --> select elementin multi seçime uygun olup olmadığını verir
    }

    @Test
    public void getOptionsUsage(){
        driver.get("https://demoqa.com/select-menu");
        WebElement selecOldStyle = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
        Select select = new Select(selecOldStyle);

        // get options metodu ile elimize option lar List <WebElement> olarak geçmiş olur.
        //bu listeyi lambda nın map metodu kullanarak bu elementlerin value veya text lerini alabiliriz

        List<WebElement> options = select.getOptions();

        List<String> optionsValue= options.stream().map(x->x.getAttribute("value")).toList();

        System.out.println(optionsValue);

    }

}
