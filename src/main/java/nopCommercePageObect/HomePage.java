package nopCommercePageObect;


import org.openqa.selenium.By;

public class HomePage extends Utils {

    Loadprops loadprops = new Loadprops();
    private By _clickOnRegistration = (By.xpath("//a[@class='ico-register']"));
    private By _bookCategory = By.linkText("Books");


    public void clickOnRegistration() {
        clickButton(_clickOnRegistration);
    }

    public void clickOnBooksCategory(){
        clickButton(_bookCategory);
}


}
