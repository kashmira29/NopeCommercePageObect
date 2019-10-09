package nopCommercePageObect;

import org.openqa.selenium.By;

public class GuestUser extends Utils {

    Loadprops loadprops = new Loadprops();

    private By _Guestuser = By.xpath("//input[@value=\"Checkout as Guest\"]");
    private By _firstNmae = By.id("BillingNewAddress_FirstName");
    private By _lastName = By.id("BillingNewAddress_LastName");
    private By _email = By.id("BillingNewAddress_Email");




    public void chckoutAsaGuest(){
        clickButton(_Guestuser);
        enterText(_firstNmae,loadprops.getProperty("FirstName"));
        enterText(_lastName,loadprops.getProperty("LastName"));
        enterText(_email,loadprops.getProperty("email"));



    }

}
