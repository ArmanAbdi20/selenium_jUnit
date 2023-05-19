package Day12;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C03_Excel {


    @Test
    public void readExcel() throws IOException {

        String path = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook wb =  WorkbookFactory.create(fis);

       Sheet newSheet = wb.createSheet("TestAutomation");

      Row row1=  newSheet.createRow(0);

      Cell row1Cell1 = row1.createCell(0);

      row1Cell1.setCellValue("ISIM");

      Cell row1Cell2 = row1.createCell(1);

      row1Cell2.setCellValue("SOY ISIM");

        FileOutputStream fos = new FileOutputStream(path);
        wb.write(fos);// write metodu sayesinde yapmış olduğumuz değişiklikler FileOutputStream ile dosyaya yazılır

        fis.close();
        fos.close();
        wb.close();




    }
}
