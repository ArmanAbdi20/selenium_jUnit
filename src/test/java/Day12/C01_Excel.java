package Day12;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Excel {


    @Test
    public void readExcel() throws IOException {

        //excel dosyası okunmak üzere path i yerleştiriliyor
        String path = System.getProperty("user.dir") + "/src/test/resources/excelData.xlsx";

        //path kullanılarak oluşturulan file input stream objesi
        FileInputStream fis = new FileInputStream(path);

        //file input stream ile oluşturulan workbook objesi
        Workbook wb = WorkbookFactory.create(fis);

        // okuma işlemler;

        //workbook
        //worksheet
        //row
        //cell

        //workbook.getSheet() --> sheet ismi ile
        // workbook.getSheetAt(); --> sheet indexi ile

        Sheet sheet = wb.getSheetAt(0);

        Row row4 = sheet.getRow(3);

          Cell cell4_6 = row4.getCell(5);

        String cellValue =  cell4_6.toString();

        System.out.println("cellValue = " + cellValue);

        wb.close();
        fis.close();

    }
}
