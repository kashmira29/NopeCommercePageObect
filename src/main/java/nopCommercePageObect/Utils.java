package nopCommercePageObect;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Utils extends BasePage {

    //method to findElement(By, by) and click() to Click on any element of the webpage
    public void clickButton(By by)
    {
        driver.findElement(by).click();
    }

    //findElement(By, by) with sendKeys()
    public void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //getText() is a method that gets you the inner text of the web element
    public String getText(By by)
    {
        return driver.findElement(by).getText();
    }

    //RandomDate method to make email address dynamic
    public static String randomDate() {
        DateFormat format = new SimpleDateFormat("ddMMyyHHmmss");
        return format.format(new Date());
    }

    //select the dropdown using "select by visible text"
    public static void SelectVisibleText(By by, String VisibleText) {
        Select selObj = new Select(driver.findElement(by));
        selObj.selectByVisibleText(VisibleText);
    }
    //select the dropdown using "select by value"
    public static void SelectValue(By by, String Value) {
        Select selObj = new Select(driver.findElement(by));
        selObj.selectByValue(Value);
    }
    //select the dropdown using "select by index"
    public static void SelectIndex(By by, int IndexValue) {
        Select selObj = new Select(driver.findElement(by));
        selObj.selectByIndex(IndexValue);
    }


}
