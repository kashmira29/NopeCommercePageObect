package nopCommercePageObect;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {

    Loadprops loadprops = new Loadprops();

    private By _FirstName = By.id("FirstName");
    private By _LastName = By.id("LastName");
    private By _email = By.name("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.name("register-button");



    public void registrationPageDetails() {
        enterText(_FirstName, loadprops.getProperty("FirstName"));
        enterText(_LastName, loadprops.getProperty("LastName"));
        enterText(_email,"testtest"+ randomDate()+ "@test.com");
        enterText(_password,loadprops.getProperty("password"));
        enterText(_confirmPassword,loadprops.getProperty("confirmPassword"));
        clickButton(_registerButton);


    }
}