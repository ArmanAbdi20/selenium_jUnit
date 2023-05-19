package Day12;

import Utilities.Base;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class C04_ScreenShots extends Base {


    @Test
    public void testScreenShots() throws IOException {


        // ekran görüntüsü alacak objemizi oluşturuyoruz
        // ekran görüntüsü alma metodunu çağırıyoruz
        // alınan görüntüyü saklıyoruz
        //alınan görüntüyü dosyaya yazıyoruz

        driver.get("https://www.linkedin.com/");

        TakesScreenshot ts = (TakesScreenshot)driver;

      File source =  ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(source, new File(".\\test-output\\photo.jpg"));

      //  FileHandler.copy(source, new File(".\\test-output\\photo.jpg")); // ikinci yöntem
    }
}
