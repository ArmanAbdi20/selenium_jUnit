package Day03;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class C03_Assertions {



    public int bölme(int a, int b){

    return  a/b;
    }
    // bölme adında methodda iki parametre veriliyor, ilkini ikinci böler
    //Seneryo1: birbirine tam bölünen iki sayı verilirse; çıktı bölüm olmalı
    //Seneryo2: birbirine tam bölünemeyen iki sayı verilirse; bölüm ondalıklı sayı olmalı
    //Seneryo3: ikinci sayı sıfır verilirse method -1 vermeli

    @Test
    public void seneryo01(){
    int expected =5;
    double actual = bölme(10,2);
        Assert.assertEquals(expected,actual);
    }

    //assertEquals()


    @Test
    public void seneryo02(){
        double expected = 2.5;
        double actual = bölme(5,2);

        System.out.println(expected);
        System.out.println(actual);
       Assert.assertTrue(expected==actual);
    }
    @Test
    public void seneryo03(){
        int expected = -1;
        double actual = bölme(9,0);



    }



}
