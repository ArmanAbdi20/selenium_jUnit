package Day14.HomeWorks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WebTablesHomework02 extends Base {


    /*
    Go to URL: https://the-internet.herokuapp.com/tables
Print the entire table
Print All Rows
Print Last row data only
Print column 5 data in the table body
Write a method that accepts 3 parameters
parameter 1 = table
parameter 2 = row number
parameter 3 = column number
printData(table,3,4); => prints
printData(table, 3,4,) => prints data in 3rd row 4th Column of table specified
     */


    @Test
    public void testWebTables02(){

        driver.get("https://the-internet.herokuapp.com/tables");

        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));

        int satır = table.findElements(By.xpath(".//tr")).size();
        int sütun = table.findElements(By.xpath(".//tr[1]//td")).size();

        for (int i = 1; i < satır ; i++) {
            for (int j = 1; j < sütun ; j++) {
                WebElement hücre = driver.findElement(By.xpath(".//tr["+i+"]//td["+j+"]"));
                String hücreVerisi = hücre.getText();
                System.out.println(hücreVerisi + "-");
            }
        }
        System.out.println();

    List<WebElement> satırlar = table.findElements(By.xpath(".//tr"));

        for (WebElement row :satırlar) {
            List<WebElement> sütunlar = row.findElements(By.xpath(".//tr[1]//td"));
            for (WebElement colum :sütunlar) {
                System.out.println(colum+ " - ");
            }
        }
        System.out.println();

        WebElement sonSatır = driver.findElement(By.xpath("(//tbody/tr[last()])[1]"));

        System.out.println("sonSatır.getText() = " + sonSatır.getText());

        System.out.println();

        WebElement besinciSütun= driver.findElement(By.xpath("(//tbody/tr/td[5])[4]"));
        System.out.println(besinciSütun.getText());

        System.out.println();

        System.out.println(ucParametreli(table, 3, 2));


    }

    private String ucParametreli(WebElement table, int row , int col) {

        By locator = By.xpath(".//tr["+row+"]//td["+col+"]");

        WebElement cell = table.findElement(locator);


        return cell.getText();


    }


}
