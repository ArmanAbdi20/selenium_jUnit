package Day11;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;

import java.util.Iterator;
import java.util.Set;

public class C01_Cookies extends Base {

/*
Go to URL: https://kitchen.applitools.com/ingredients/cookie
Get Cookie.
Find the total number of cookies.
Print all the cookies.
Add Cookie.
Edit Cookie.
Delete Cookie.
Delete All Cookies.
 */

    public void printcookies(){
        Set<Cookie> cookies = driver.manage().getCookies();


        Iterator<Cookie> iter = cookies.iterator();

        //print all cookies
        while (iter.hasNext()) {
            Cookie corrent = iter.next();
            String nameCookie = corrent.getName();
            String valueCookie = corrent.getValue();

            System.out.println("name : " + nameCookie + " \n cookie value :" + valueCookie );
        }
        System.out.println("\n");

    }
    @Test
    public void testCookies(){

        driver.get("https://kitchen.applitools.com/ingredients/cookie");

        Set<Cookie> cookies = driver.manage().getCookies();

        // Number of all cookies
        int size = cookies.size();
        System.out.println("Cookies size = " + size);


        // all cookies

        printcookies();
        //add cookies
        System.out.println("***********cookie ekleniyor****************");
        Cookie cookie = new Cookie("dessert","güllaç");

        driver.manage().addCookie(cookie);

        printcookies();

        Assert.assertEquals("Cookie ekleme islemi basarisiz!",size+1, driver.manage().getCookies().size());
        Assert.assertEquals(cookie.getValue(), driver.manage().getCookieNamed(cookie.getName()).getValue());

        Assert.assertEquals(cookie.getValue(),driver.manage().getCookieNamed(cookie.getName()).getValue());

        //edit cookie;
        System.out.println("***********cookie editleniyor****************");
        // cookie eklemek için ayrıca bir metod yoktur.
        //varolan isimde yeni bir cookie eklediğimizde cookie nin değeri update edilecektir.
        //varolan name ile bir cookie eklemeye biz edit cookie demiş oluyoruz
        driver.manage().addCookie(new Cookie("dessert","baklava"));

        printcookies();


        // delete cookie
        System.out.println("***********cookie siliniyor****************");
        driver.manage().deleteCookieNamed("vegetable");

        printcookies();

        // delete all cookies
        System.out.println("***********cookielerin hepsi siliniyor****************");

        driver.manage().deleteAllCookies();

        printcookies();

    }

}
