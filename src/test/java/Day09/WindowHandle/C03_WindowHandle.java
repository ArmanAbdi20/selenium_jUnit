package Day09.WindowHandle;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;

import java.util.Iterator;
import java.util.Set;

public class C03_WindowHandle extends Base {

    /*
    //browser aç
        //açılan sekmede amazon aç
        //yeni sekme oluştur
        //açılan sekmede linedin aç
        // yeni pencere oluştur
        //açılan pencerede orangeHRM aç
     */


    @Test
    public void testWindowHandles(){

       driver.get("https://www.amazon.com/");
       driver.switchTo().newWindow(WindowType.TAB);
       driver.get("https://www.linkedin.com/");
       driver.switchTo().newWindow(WindowType.WINDOW);
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


       Set<String> windowHandles= driver.getWindowHandles();

        Iterator<String> itr = windowHandles.iterator();

        while (itr.hasNext()) {
            String current = itr.next();
            driver.switchTo().window(current);
            System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

            if (driver.getTitle().toLowerCase().contains("amazon")){
                break;
            }

        }


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Amazon sekmesini buldun");
    }




    }

