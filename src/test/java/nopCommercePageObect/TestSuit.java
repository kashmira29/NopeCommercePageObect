package nopCommercePageObect;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RefferedProduct refferedProduct = new RefferedProduct();
    ShoppingCart shoppingCart = new ShoppingCart();
    GuestUser guestUser = new GuestUser();
    CheckoutPage checkoutPage = new CheckoutPage();
    Loadprops loadprops = new Loadprops();

   @Test (priority = 0)
   public void userShouldBeRegisteredSuccesfully()

   {
      homePage.clickOnRegistration();
      registrationPage.registrationPageDetails();

       String expectedMessage = loadprops.getProperty("expectedMessageRegistraion");
       String actualMessage = getText(By.xpath("//div[@class='result']"));

       Assert.assertEquals(expectedMessage,actualMessage);

   }

   @Test (priority = 1)
   public void userShouldBeAbleToSendReferedaLinkToFriend(){

       homePage.clickOnRegistration();
       registrationPage.registrationPageDetails();
       refferedProduct.refferedAProductToFriend();

       String expectedMessage = loadprops.getProperty("expectedMessagerefferedLink");
       String actualMessage = getText(By.className("result"));

       Assert.assertEquals(expectedMessage,actualMessage);
   }

   @Test (priority = 2)
   public void nonRegisterdUserShouldnotBeableToRefferedALinkToaFriend(){

      refferedProduct.nonRegisteredUser();

      String expectedResult = loadprops.getProperty("Nonregisterduser");
      String actualresult = getText(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));

      Assert.assertEquals(expectedResult,actualresult);
   }

   @Test (priority = 3)
   public void guestUserShouldBeCheckoutSuccessfully(){
    homePage.clickOnBooksCategory();
    shoppingCart.buyaproduct();
    guestUser.chckoutAsaGuest();
    checkoutPage.checkoutPagedetails();

    String Expected = "Your order has been successfully processed!";
    String Actual = getText(By.xpath("//div[@class=\"page checkout-page order-completed-page\"]" +
            "//div[@class=\"title\"] "));
    Assert.assertEquals(Expected,Actual);

   }

   @Test (priority = 4)
   public void userShouldBeAbleToBuyProductSuccesfully(){
      homePage.clickOnRegistration();
      registrationPage.registrationPageDetails();
      homePage.clickOnBooksCategory();
      shoppingCart.buyaproduct();
      checkoutPage.checkoutPagedetails();

      String Expected = "Your order has been successfully processed!";
      String Actual = getText(By.xpath("//div[@class=\"page checkout-page order-completed-page\"]" +
              "//div[@class=\"title\"] "));
      Assert.assertEquals(Expected,Actual);
   }


}
