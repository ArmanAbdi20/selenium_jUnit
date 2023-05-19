package Day09.WindowHandle;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class C02_WindowHandle extends Base {



    @Test
    public void testWindowHandle(){

      /*
      // 1- browser ac
// 2- yeni sekme olustur
// 3- yeni pencere olustur
// 4- 2. sekmede https://www.linkedin.com/ ac
// 5- son pencerede https://opensource-demo.orangehrmlive.com/web/index.php/auth/login sitesini ac
// 6- Ilk sekmede https://www.amazon.com/ ac
       */

        String firstWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        String secondWindow = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.WINDOW);
        String thirdWindow = driver.getWindowHandle();
        driver.switchTo().window(secondWindow);
        driver.get("https://www.linkedin.com/");
        driver.switchTo().window(thirdWindow);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.switchTo().window(firstWindow);
        driver.get("https://www.amazon.com/");




    }
}
