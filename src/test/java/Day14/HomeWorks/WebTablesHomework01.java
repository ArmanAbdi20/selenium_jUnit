package Day14.HomeWorks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesHomework01 extends Base {

    /*
    Go to URL: http://demo.guru99.com/test/web-table-element.php
To find third row of table
To get 3rd row's 2nd column data
Get all the values of a Dynamic Table
     */

    @Test
    public void testWebTables(){

        driver.get("http://demo.guru99.com/test/web-table-element.php");

        WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));

        WebElement row3column2 = table.findElement(By.xpath(".//tr[3]//td[2]"));

        System.out.println("row3column2.getText() = " + row3column2.getText());

        int rowNumber = table.findElements(By.xpath(".//tr")).size();
        int columNumber = table.findElements(By.xpath(".//tr[1]//td")).size();

        for (int i = 1 ; i < rowNumber; i++) {
            for (int j = 1 ; j <columNumber; j++) {
                WebElement cell = table.findElement(By.xpath(".//tr["+i+"]//td["+j+"]"));
                String text = cell.getText();
                System.out.println(text + "-");
            }
        }





    }
}
