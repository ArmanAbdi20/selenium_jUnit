package SeleniumCodeChallenge;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Task03 extends Base {


    /*
    //1. "https://www.saucedemo.com" Adresine gidin
//2. Username kutusuna "standard_user" yazdirin
//3. Password kutusuna "secret_sauce" yazdirin
//4. Login tusuna basin
//5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
//6. Add to Cart butonuna basin
//7. Alisveris sepetine tiklayin
//8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
//9. Sayfayi kapatin
-----------------------------------------------
     */

    @Test
    public void testSau() throws InterruptedException {

        driver.get("https://www.saucedemo.com");

        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user"); // username sendKeys("standard_user")

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce"); // password sendKeys("secret_sauce")

        driver.findElement(By.xpath("//input[@id='login-button']")).click(); // login button click

        Thread.sleep(1000);

        String ilkUrun = driver.findElement(By.xpath("(//div[@class='inventory_item_name'])[1]")).getText(); // ilk ürünün ismi

        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click(); // add to cart button click

        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click(); // shopping cart button click

        String sepettekiUrun = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText(); // sepetteki ürünün ismi

        Assert.assertEquals(sepettekiUrun,ilkUrun);

        Thread.sleep(1000);

        driver.close();





    }

}
