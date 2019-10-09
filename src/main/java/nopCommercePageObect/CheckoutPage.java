package nopCommercePageObect;

import org.openqa.selenium.By;

public class CheckoutPage extends Utils {

    Loadprops loadprops = new Loadprops();

    private By _country = By.xpath("//*[@id=\"BillingNewAddress_CountryId\"]");
    private By _city = By.id("BillingNewAddress_City");
    private By _firstLineaddress = By.id("BillingNewAddress_Address1");
    private By _zipCode = By.id("BillingNewAddress_ZipPostalCode");
    private By _phoneNumber = By.name("BillingNewAddress.PhoneNumber");
    private By _continue = By.id("billing-buttons-container");
    private By _continueNextStep = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/input");
    private By _cardType = By.id("paymentmethod_1");
    private By _continueToPayment = By.xpath("//*[@id=\"payment-method-buttons-container\"]/input");
    private By _selectcard = By.id("CreditCardType");
    private By _cardHolderName = By.id("CardholderName");
    private By _cardNumber = By.id("CardNumber");
    private By _expirationMonth = By.xpath("//select[@id=\"ExpireMonth\"]");
    private By _expirationYear = By.xpath("//*[@id=\"ExpireYear\"]");
    private By _cardCode = By.id("CardCode");
    private By _continueToConfirmationPage = By.xpath("//input[@class=\"button-1 payment-info-next-step-button\"]");
    private By _confirmOrder = By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input");

    public void checkoutPagedetails(){

        SelectVisibleText(_country,"United Kingdom");
        enterText(_city,loadprops.getProperty("city"));
        enterText(_firstLineaddress,loadprops.getProperty("address1"));
        enterText(_zipCode,loadprops.getProperty("zipCode"));
        enterText(_phoneNumber,loadprops.getProperty("phonenumber"));
        clickButton(_continue);
        clickButton(_continueNextStep);
        clickButton(_cardType);
        clickButton(_continueToPayment);
        SelectValue(_selectcard,"MasterCard");
        enterText(_cardHolderName,loadprops.getProperty("cardHolderName"));
        enterText(_cardNumber,loadprops.getProperty("cardNumber"));
        SelectValue(_expirationMonth,loadprops.getProperty("expirationMonth"));
        SelectValue(_expirationYear,loadprops.getProperty("expirationyear"));
        enterText(_cardCode,loadprops.getProperty("cardCode"));
        clickButton(_continueToConfirmationPage);
        clickButton(_confirmOrder);
    }

}
