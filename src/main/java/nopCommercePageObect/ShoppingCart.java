package nopCommercePageObect;

import org.openqa.selenium.By;

public class ShoppingCart extends Utils {
    Loadprops loadprops = new Loadprops();

    private By _SelectBook = By.linkText("Pride and Prejudice");
    private By _addItemInBasket = By.id("add-to-cart-button-39");
    private By _clickAddItem =  By.linkText("Shopping cart");
    private By _termsCondition = By.id("termsofservice");
    private By _checkout = By.id("checkout");

    public void buyaproduct(){
        clickButton(_SelectBook);
        clickButton(_addItemInBasket);
        clickButton(_clickAddItem);
        clickButton(_termsCondition);
        clickButton(_checkout);
    }
}
