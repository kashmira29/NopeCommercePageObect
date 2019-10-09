package nopCommercePageObect;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();

    //before method to open the browser
    @BeforeMethod

    public void setUpBrowser() {
        browserSelector.setUpBrowser();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
        driver.get("https://demo.nopcommerce.com");
    }

    @AfterMethod
   public void closeBrowser() {
        driver.quit();

    }


}
