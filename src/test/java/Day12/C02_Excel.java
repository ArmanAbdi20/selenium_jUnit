package Day12;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class C02_Excel {

    @Test
    public void readExcedl() throws IOException {

        String path = System.getProperty("user.dir") + "/src/test/resources/excelfile.xlsx";

        FileInputStream fis = new FileInputStream(path);

        Workbook wb =  WorkbookFactory.create(fis);

        // java map objesine taşıyabiliriz (2 sütun olduğu taktirde)
        Map<String, String> data = new HashMap<>();

        Sheet sheet1 = wb.getSheetAt(0);

        int lastRowIndex = sheet1.getLastRowNum();
        System.out.println("lastRowIndex = " + lastRowIndex);

        int lastRowNumber = sheet1.getPhysicalNumberOfRows();

        System.out.println("lastRowNumber = " + lastRowNumber);



        for (int i = 0; i < lastRowIndex; i++) {
            //ilk row key, ikinci key value olarak eklenecek

            String country = sheet1.getRow(i).getCell(0).toString();
            String area = sheet1.getRow(i).getCell(1).toString();

            data.put(country,area);
            
        }
        System.out.println(data);

        System.out.println(sheet1.getRow(10).getCell(0).toString());

        //eğer sütun ve satır sayısı bilinmiyorsa iç içe 2 for döngüsüne ihtiyaç vardır
        //satır sayısı bilgisini sheet üzerinden sütun sayısını row üzerinden alırız

        int satırSayısı = sheet1.getLastRowNum();
        int sütunSayısı = sheet1.getRow(0).getLastCellNum();
        System.out.println("satırSayısı = " + satırSayısı);
        System.out.println("sütunSayısı = " + sütunSayısı);

        String [][] arr = new String[satırSayısı+1][sütunSayısı+1];

        for (int i = 0; i <= satırSayısı; i++) {
            for (int j = 0; j < sütunSayısı; j++) {
                arr[i][j] = sheet1.getRow(i).getCell(j).toString();
                System.out.println(arr[i][j]);

            }
            
        }

        System.out.println("arr[4][0] = " + arr[4][0]);


    }
}
