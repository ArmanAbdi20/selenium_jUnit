package Day11.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Iterator;
import java.util.Set;

public class CookiesHomework01 extends Base {

    /*
    Go to URL: http://facebook.com
getCookies,
addCookie,
deleteCookieNamed,
deleteAllCookies.
     */

    @Test
    public void testCookies(){

        driver.get("http://facebook.com");

        Set<Cookie> cookies = driver.manage().getCookies();
        Iterator<Cookie> iter = cookies.iterator();
        while(iter.hasNext()){
            Cookie corrent = iter.next();
            String name = corrent.getName();
            String value = corrent.getValue();

            System.out.println("cookies names :"+name + "cookie value :"+value);
        }

        System.out.println("cookies number = " + cookies.size());

        Cookie newCookie = new Cookie("newCookie","FacebookCookieValue");

        cookies.add(newCookie);

       driver.manage().deleteCookieNamed("_js_datrcookie");

       driver.manage().deleteAllCookies();




    }
}
