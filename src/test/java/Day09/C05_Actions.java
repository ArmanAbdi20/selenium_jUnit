package Day09;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C05_Actions extends Base {

/*
/ https://www.amazon.com/ a git
// Accounts and Lists linkinin uzerine gel
// Cikan pencerede Orders linkine tikla
// Login ekraninin acildigini dogrula

 */


    @Test
    public void testActions() {
        driver.get("https://www.amazon.com/");

        Actions actions = new Actions(driver);

        WebElement accountList = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

        WebElement orderList = driver.findElement(By.xpath("(//span[@class='nav-text'])[1]"));

        actions.moveToElement(accountList).click(orderList).perform();

        System.out.println(driver.getTitle());

        Assert.assertTrue(driver.getTitle().contains("Your List"));



    }
}
