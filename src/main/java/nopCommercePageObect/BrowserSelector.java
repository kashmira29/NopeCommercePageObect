package nopCommercePageObect;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends Utils {

    Loadprops loadprops = new Loadprops();

    public void setUpBrowser(){

        String Browser = loadprops.getProperty("browser");

        if (Browser.equalsIgnoreCase("Firefox"))
        {
            System.setProperty("webdriver.gecko.driver","src\\test\\WebDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (Browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src\\test\\WebDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (Browser.equalsIgnoreCase("IE"))
        {
            System.setProperty("webdriver.ie.driver","src\\test\\WebDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else {
            System.out.println("Browser name is wrong: " + Browser);
        }
    }

}
