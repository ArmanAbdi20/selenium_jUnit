package Day06;

import com.github.javafaker.Faker;
import org.junit.Test;

public class C05_Faker {



    @Test
    public void testFaker(){

        Faker faker = new Faker();

        String isim= faker.name().nameWithMiddle();
        System.out.println("isim = " + isim);

        String adress= faker.address().fullAddress();
        System.out.println("adress = " + adress);

        String phoneNumber = faker.phoneNumber().phoneNumber();
        System.out.println("phoneNumber = " + phoneNumber);




    }
}
