package Day13;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_WebTables extends Base {


    @Test
    public void testWebTables(){

        driver.get("http://demo.guru99.com/test/web-table-element.php");

        WebElement tableData = driver.findElement(By.xpath("//table[@class='dataTable']//tbody"));

        WebElement row1cell3 =tableData.findElement(By.xpath(".//tr[1]//td[3]"));

        String cellTex = row1cell3.getText();

        System.out.println(cellTex);

        // tabloda gezinmek için iç içe iki for döngüsü yazılır
        //satur ve sütun sayılarına ihtiyaç var

        int satırSayısı = tableData.findElements(By.xpath(".//tr")).size();
        int sütunSayısı = tableData.findElements(By.xpath(".//tr[1]//td")).size();

//        for (int i = 1; i <= satırSayısı; i++) {
//            for (int j = 1; j <= sütunSayısı ; j++) {
//                WebElement cell = tableData.findElement(By.xpath(".//tr["+i+"]//td["+j+"]"));
//                String cellValue = cell.getText();
//                System.out.print(cellValue+ " - ");
//
//
//            }
//            System.out.println();
//        }

        System.out.println(getTableCellValue(tableData, 6, 1));
    }

    public String getTableCellValue(WebElement table, int satır, int sütun){

        By locator = By.xpath(".//tr["+satır+"]//td["+sütun+"]");

        WebElement cell = table.findElement(locator);


        return cell.getText();
    }
}
