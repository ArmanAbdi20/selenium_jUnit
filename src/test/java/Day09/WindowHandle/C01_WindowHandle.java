package Day09.WindowHandle;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.devtools.v85.backgroundservice.BackgroundService;

public class C01_WindowHandle extends Base {



    @Test
    public void testWindowHandle() throws InterruptedException {

    //    driver.getWindowHandle();-> aktif olan pencerenin window handle değerinini verir.
     //   driver.getWindowHandles();->açık olan tüm pencelerin window handle değerini sete atar
     //   driver.switchTo().window();-> window handle değeri verilerek ilgili pencereye geçiş sağlar
    //    driver.switchTo().newWindow(TAB)-> Yeni sekme oluşturur
       // driver.switchTo().newWindow(WINDOW)-> Yeni pencere oluşturur


        //browser aç
        //açılan sekmede amazon aç
        //yeni sekme oluştur
        //açılan sekmede linedin aç
        // yeni pencere oluştur
        //açılan pencerede orangeHRM aç



        driver.get(" https://www.amazon.com/");
        Thread.sleep(1000);
        System.out.println("amazon sekmesinin window handle değeri :" + driver.getWindowHandle());
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(" https://www.linkedin.com/");
        Thread.sleep(1000);
        System.out.println(driver.getWindowHandle());
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(1000);
        System.out.println(driver.getWindowHandle());

        driver.quit();

    }



}
