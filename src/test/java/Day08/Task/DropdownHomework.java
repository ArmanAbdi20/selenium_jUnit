package Day08.Task;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownHomework extends Base {

    /*
    Go to URL: https://the-internet.herokuapp.com/dropdown
Create method selectByIndexTest and Select Option 1 using index .
Create method selectByValueTest Select Option 2 by value.
Create method selectByVisibleTextTest Select Option 1 value by visible text.
Create method printAllTest Print all dropdown value.
Verify the dropdown has Option 2 text.
Create method printFirstSelectedOptionTest Print first selected option.
Find the size of the dropdown, Print "Expected Is Not Equal Actual" if there are not 3 elements in the dropdown.

     */

    @Test
    public void selectByIndexTest() {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement selectOption = driver.findElement(By.id("dropdown"));
        Select select = new Select(selectOption);
        select.selectByIndex(1);

        Assert.assertTrue(driver.findElement(By.xpath("//option[@selected='selected']")).isSelected());

    }

    @Test
    public void selectByValueTest() {
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement selectOption = driver.findElement(By.id("dropdown"));
        Select select = new Select(selectOption);
        select.selectByValue("2");
        Assert.assertTrue(driver.findElement(By.xpath("//option[@selected='selected']")).isSelected());

    }

    @Test
    public void selectByVisibleTextTest() {

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement selectOption = driver.findElement(By.id("dropdown"));
        Select select = new Select(selectOption);
        select.selectByVisibleText("Option 1");
        String actual= driver.findElement(By.xpath("//option[@selected='selected']")).getText();
        String expected = "Option 1";

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void printAllTest(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement selectOption = driver.findElement(By.id("dropdown"));
        Select select = new Select(selectOption);
        List<WebElement> options= select.getOptions();
        List<String> optionsList = options.stream().map(a->a.getText()).toList();
        System.out.println("options list :" + optionsList);

    }

    @Test
    public void  dropdownHasOption2Test(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement selectOption = driver.findElement(By.id("dropdown"));
        Select select = new Select(selectOption);
        select.selectByVisibleText("Option 2");
        String actual2= driver.findElement(By.xpath("//option[@selected='selected']")).getText();
        Assert.assertTrue(actual2.contains("Option 2"));


    }

    @Test
    public void printFirstSelectedOptionTest(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement selectOption = driver.findElement(By.id("dropdown"));
        Select select = new Select(selectOption);
        System.out.println(select.getFirstSelectedOption().getText());

    }

    @Test
    public void sizeTest(){
        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement selectOption = driver.findElement(By.id("dropdown"));
        Select select = new Select(selectOption);
        List<WebElement> options= select.getOptions();
        List<String> optionsList = options.stream().map(a->a.getText()).toList();

        if(optionsList.size()!=3){
            System.out.println("Expected Is Not Equal Actual :(");
        }else
            System.out.println("Expected Is Equal Actual :)");

    }
}
