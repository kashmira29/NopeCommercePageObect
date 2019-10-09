package nopCommercePageObect;

import org.openqa.selenium.By;

    public class RefferedProduct extends Utils {

    Loadprops loadprops = new Loadprops();

    private By _ContinueHomepage = By.name("register-continue");
    private By _ComputerCategory = (By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/computers\"]"));
    private By _SelectNotebook = By.xpath("//h2/a[@href=\"/notebooks\"]");
    private By _productSelect = By.xpath("//h2/a[@href=\"/apple-macbook-pro-13-inch\"]");
    private By _clickOnEmailAFriend = By.className("email-a-friend");
    private By _friendEmail = By.className("friend-email");
    private By _youremail = By.id("YourEmailAddress");
    private By _personalText = By.id("PersonalMessage");
    private By _clickOnSendEmail = By.name("send-email");

    public void refferedAProductToFriend() {

        clickButton(_ContinueHomepage);
        clickButton(_ComputerCategory);
        clickButton(_SelectNotebook);
        clickButton(_productSelect);
        clickButton(_clickOnEmailAFriend);
        enterText(_friendEmail, loadprops.getProperty("friend-email"));
        enterText(_personalText, loadprops.getProperty("PersonalMessage"));
        clickButton(_clickOnSendEmail);

    }


    public void nonRegisteredUser(){

        clickButton(_ComputerCategory);
        clickButton(_ComputerCategory);
        clickButton(_SelectNotebook);
        clickButton(_productSelect);
        clickButton(_clickOnEmailAFriend);
        enterText(_friendEmail,loadprops.getProperty("friend-email"));
        enterText(_youremail,loadprops.getProperty("yourEmail"));
        enterText(_productSelect,loadprops.getProperty("PersonalMessage"));
        clickButton(_clickOnSendEmail);

    }


}
