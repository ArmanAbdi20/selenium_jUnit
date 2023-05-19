package Day03;


import org.junit.*;


public class C02_FirstTestClass {


    @Before
    public void beforetestMethod(){
        System.out.println("\tTestten önce yapılacak işlemler yapıldı");
    }


  @Test
    public void test01(){
        System.out.println("\t\t Test01 executed...");
    }

    @Ignore
    @Test
    public void test02(){
        System.out.println("\t\t Test02 executed...");
    }

    @After
    public void aftertestMethod(){
        System.out.println("\t browser kapatıldı....");
    }
    @BeforeClass
    public static void beforClassMethod(){
        System.out.println("before class çalıştı");

    }
    @AfterClass
    public static void afterClassMethod(){

        System.out.println("after class çalıştı");
    }
}
