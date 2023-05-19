package Day07.Task;

import Utilities.Base;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect extends Base {
    /*
    Go to URL: https://demoqa.com/select-menu
Select options in Standard multiple select
     */



    @Test
    public void multipleSelect(){
        driver.get("https://demoqa.com/select-menu");
        WebElement multipleSelect = driver.findElement(By.xpath("(//div[@class=' css-1wa3eu0-placeholder'])[3]"));
        multipleSelect.click();

    }

}
