package Day07.Task;

import Utilities.Base;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownFakerClass extends Base {

    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/
Login with Username: Admin
Login with Password: admin123
Click login button
Click on PIM
Click on Employee List
Employee Name → Use Faker Class
ID -> Use Faker Class
Employment Status → select by index: 2
Include → selectByVisibleText: Current and Past Employees
Supervisor Name → Use Faker Class
Job Title ->selectByValue: IT Manager
Sub Unit ->selectByValue: 3
Click search button
Verify text visible : "No Records Found"
     */

    @Test
    public void testDropDownFaker() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement userName= driver.findElement(By.xpath("//input[@name='username']"));
        userName.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("admin123");

        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();

        WebElement pim = driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]"));
        pim.click();

        WebElement employee = driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]"));
        employee.click();

        Faker faker = new Faker();

        String name= faker.name().fullName();
        WebElement fakeName = driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]"));
        fakeName.sendKeys(name);

        String idFake = faker.idNumber().toString();
        WebElement fakeId = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
        fakeId.sendKeys(idFake);

        WebElement statusSelect=  driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]"));

        Select select = new Select(statusSelect);

        select.selectByIndex(2);

        WebElement includeSelect = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]"));

        select.selectByVisibleText("Current and Past Employees");

        WebElement fakeSubName = driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[2]"));

       String subName= faker.name().fullName();

       fakeSubName.sendKeys(subName);

       WebElement jobTitle = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[3]"));

       select.selectByValue("IT Manager");

       WebElement subUnit = driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[4]"));

       select.selectByValue("3");

       WebElement button= driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']"));

       button.click();




    }
}
