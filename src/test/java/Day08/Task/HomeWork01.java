package Day08.Task;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;

public class HomeWork01 extends Base {

    /*
    Go to URL: http://demo.automationtesting.in/Alerts.html
    Click "Alert with OK" and click 'click the button to display an alert box:’
    Accept Alert(I am an alert box!) and print alert on console.
    Click "Alert with OK & Cancel" and click 'click the button to display a confirm box’
    Cancel Alert  (Press a Button !)
    Click "Alert with Textbox" and click 'click the button to demonstrate the prompt box’
    And then sendKeys «BootcampCamp» (Please enter your name)
    Finally print on console this message "Hello BootcampCamp How are you today" assertion these message.
     */


    @Test
    public void testAlert() throws InterruptedException {
        driver.get("http://demo.automationtesting.in/Alerts.html");

        driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
        Thread.sleep(1000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath(" //button[@class='btn btn-primary']")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        driver.switchTo().alert().sendKeys("Hello BootcampCamp!! How are you today?");
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.quit();



    }



}
