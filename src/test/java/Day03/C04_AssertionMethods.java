package Day03;

import org.junit.Assert;
import org.junit.Test;

public class C04_AssertionMethods {

    @Test
    public void assertEqualsTest(){

        Assert.assertEquals(1,1);// 2 parametreli olursa parametreler karşılaştırılır, eşitse test passed olur değilse failed olur
    }

    @Test
    public void assetTrueTest (){

        Assert.assertTrue(true);//1 parametre alır, parametre true ise passed false ise failed olur.

    }

    @Test
    public void assetFalseTest (){

        Assert.assertFalse(false); // 1 parametre alır, parametre false ise passed true ise failed olur.

    }


    @Test
    public void assertNullTest (){

        Assert.assertNull(null); // 1 parametre alır, parametre null ise passed null olmayan değer için de failed olur
    }

    public void assertNotNullTest() {

        Assert.assertNotNull(null); // 1 parametre alır, parametre null olmayan değer için passed, null için ise failed olur
    }

    @Test
    public void assertSameTest(){

        Assert.assertSame("Usa","Usa"); // Obje kontrolü değer ve adresler ayni olmalıdır

    }

    @Test
    public void assertNotSameTest() {

        Assert.assertNotSame("Usa","Canada"); // Obje kontrolü

    }
    @Test
    public void assertArrayEqualsTest() {
        int [] arr1 ={1,2,3,4,5};
        int [] arr2 ={5,4,3,2,1};

        Assert.assertArrayEquals(arr1,arr2); //2 parametre alır verilen array lerin uzunlukları ve indexleri aynı olmalıdır


    }

    @Test
    public void assertEqualsTestWithMesage() {

        Assert.assertEquals("eşit değil",5,2);
    }

}
