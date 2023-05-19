package Day14.HomeWorks;

import Utilities.Base;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.junit.Test;

import java.io.*;

public class ApachePOIHomework03 extends Base {


    /*
    Create an object of File class to open xlsx file.
Create an object of FileInputStream class to read excel file.
Create an object of FileInputStream class to read excel file.
Creating workbook instance that refers to .xlsx file.
Creating a Sheet object.
Get all rows in the sheet.
Create a row object to retrieve row at index 3.
Create a cell object to enter value in it using cell Index.
Write the data in excel using output stream.
     */

    @Test
    public void testApachePOI() throws IOException {

        String path = "C:\\Users\\Abdi Arman\\IdeaProjects\\JunitSelenium\\src\\test\\resources\\filehomewoerk.xlsx";

        File file = new File(path);

        Workbook wb = new SXSSFWorkbook();

        Sheet sheet = wb.createSheet("Sheet01");

        Row row = sheet.createRow(3);

        Cell cell = row.createCell(1);
        cell.setCellValue("Aloha!!");

        FileOutputStream fos = new FileOutputStream(file);
        wb.write(fos);

        fos.close();
        wb.close();








    }
}
