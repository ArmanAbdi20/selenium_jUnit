package Day08.Iframe;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class C01_iFrame extends Base {


    /*
    • switchTo.frame (int frame Number)
    • switchTo.frame (string frame Name Or Id)
    • switchTo.frame (WebElement frame Element)
     */

    /*
    Go to URL: https://the-internet.herokuapp.com/iframe
Verify the Bolded text contains “Editor”
Locate the text box
Delete the text in the text box
Type “Hi everyone”
Verify the text Elemental Selenium text is displayed on the page.
     */
    @Test
    public void testİframe(){

        driver.get("https://the-internet.herokuapp.com/iframe");

        WebElement editör= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(editör.getText().contains("Editor"));

        driver.switchTo().frame(0);

        WebElement texBox = driver.findElement(By.id("tinymce"));

        texBox.clear();
        texBox.sendKeys("Agama bolca selam :)");
        driver.switchTo().parentFrame();

        WebElement elementSelenium = driver.findElement(By.partialLinkText("Elemental"));
        Assert.assertTrue(elementSelenium.isDisplayed());


    }
}
