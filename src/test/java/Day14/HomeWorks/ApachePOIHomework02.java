package Day14.HomeWorks;

import Utilities.Base;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ApachePOIHomework02 extends Base {

    /*
    Store the path of the file as string and open the file.
Open the workbook.
Open the first worksheet.
Go to the first row.
Create a cell on the 3rd column (2nd index) on the first row.
Write “POPULATION” on that cell.
Create a cell on the 2nd row 3rd cell(index2), and write data.
Create a cell on the 3rd row 3rd cell(index2), and write data.
Create a cell on the 4th row 3rd cell(index2), and write data.
Write and save the workbook.
Close the file.
Close the workbook.
     */


    @Test
    public void testApachePOI() throws IOException {

        String path = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook wb =  WorkbookFactory.create(fis);

        Sheet sheet1 = wb.getSheetAt(0);

       Row row1 = sheet1.getRow(0);

       Cell cell1_3 = row1.createCell(2);

       cell1_3.setCellValue("Population");

       Cell cell2_3 = sheet1.getRow(1).createCell(2);
       cell2_3.setCellValue("on yüz bin milyon");
        System.out.println("cell2_3 = " + cell2_3);

        Cell cell3_4= sheet1.getRow(2).createCell(2);
       cell3_4.setCellValue("milyar tirilyar");
        System.out.println("cell3_4 = " + cell3_4);

       Cell cell4_5 = sheet1.getRow(3).createCell(2);
       cell4_5.setCellValue("trilbört tane");
        System.out.println("cell4_5 = " + cell4_5);

        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);

        fis.close();
        fos.close();
        wb.close();



    }
}
