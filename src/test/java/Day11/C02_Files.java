package Day11;

import org.junit.Test;

public class C02_Files {


    @Test
    public void testFile(){

        //Dosya ayıracı win için "\" mac içi : '/'
       String fileSperator= System.getProperty("file.separator");
        System.out.println("fileSperator = " + fileSperator);


        // calışma ortamı (projenin content rootu)
        String project = System.getProperty("user.dir");
        System.out.println("project = " + project);

        //home path
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
    }
}
