package Day14.HomeWorks;

import Utilities.Base;
import org.apache.poi.ss.usermodel.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class ApachePOIHomework01 extends Base {

    /*
    Add the excel file on the resources folder.
Open the file.
Open the workbook using file input stream.
Open the first worksheet.
Go to first row.
Go to first cell on that first row and print.
Go to second cell on that first row and print.
Go to 2nd row first cell and assert if the data equal to Russia.
Go to 3rd row 2nd cell-chain the row and cell.
Find the number of used row.
Print country, area key value pairs as map object.
     */

    @Test
    public void testApachePOI() throws IOException {

        String path = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";


        FileInputStream fis = new FileInputStream(path);

        Workbook wb = WorkbookFactory.create(fis);

        Sheet sheet = wb.getSheetAt(0);

        Row rw = sheet.getRow(0);

        Cell firstCell = rw.getCell(0);

        String firstCellValue = firstCell.toString();
        String firstCellValue2 = sheet.getRow(0).getCell(0).toString();
        System.out.println("firstCellValue = " + firstCellValue);
        System.out.println("firstCellValue2 = " + firstCellValue2);

        Cell secondCell = rw.getCell(1);
        String secondCellValue = secondCell.toString();
        System.out.println("secondCellValue = " + secondCellValue);

        String cell2_1Value= sheet.getRow(1).getCell(0).toString();
        Assert.assertEquals(cell2_1Value,"Rusya");

        String cell3_2Value = sheet.getRow(2).getCell(1).toString();
        System.out.println("cell3_2Value = " + cell3_2Value);

        int rowNumber = sheet.getLastRowNum()+1;
        System.out.println("rowNumber = " + rowNumber);

       Map<String, String> coutryAreas = new HashMap<>();

        for (int i = 0; i < rowNumber; i++) {
            String coutry = sheet.getRow(i).getCell(0).toString();
            String area = sheet.getRow(i).getCell(1).toString();
            coutryAreas.put(coutry, area);

        }
        System.out.println("coutryAreas = " + coutryAreas);


    }
}
