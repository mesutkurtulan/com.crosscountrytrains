package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CrossCountryTrainsHomePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class EmailRegistration {

    @Test
    public void Test01(){
        CrossCountryTrainsHomePage homePage = new CrossCountryTrainsHomePage();
        Faker faker = new Faker();
        // Given I am a customer who does not have an account
        Driver.getDriver().get(ConfigurationReader.getProperty("crosscountrytrains_url"));
        // When I go to the register page and enter my details
        homePage.registerButtonHome.click();
        homePage.firstNameField.sendKeys(faker.name().firstName());
        homePage.lastNameField.sendKeys(faker.name().lastName());
        homePage.eMailField.sendKeys(faker.internet().emailAddress());
        homePage.passwordField.sendKeys(faker.internet().password());
        homePage.registerButtonRegister.click();
        // Then I should have an account created
        Assert.assertTrue(homePage.myBookingsButton.isDisplayed());
    }
}
