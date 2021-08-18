package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CrossCountryTrainsHomePage {

    public CrossCountryTrainsHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText="Register")
    public WebElement registerButtonHome;

    @FindBy(id="formInput-fname")
    public WebElement firstNameField;

    @FindBy(id="formInput-lname")
    public WebElement lastNameField;

    @FindBy(id="formInput-email")
    public WebElement eMailField;

    @FindBy(id="formInput-password")
    public WebElement passwordField;

    @FindBy(css="button[class='jsx-1981171952']")
    public WebElement registerButtonRegister;

    @FindBy(linkText="My Bookings")
    public WebElement myBookingsButton;



}
