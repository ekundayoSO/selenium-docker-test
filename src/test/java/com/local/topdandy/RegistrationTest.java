package com.local.topdandy;

import base.BaseTest;
import com.remote.topdandy.pages.RegistrationTestPage;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;
import utilities.GenerateRandomEmail;

import java.io.IOException;

public class RegistrationTest extends BaseTest {

    @Test
    public void registerNewUser() throws IOException {

        ConfigurationReader data = new ConfigurationReader();
        RegistrationTestPage register = new RegistrationTestPage(driver);

        driver.get(data.geURL());
        driver.manage().window().maximize();

        register.clickOnRegisterHereLink();
        register.fillUserInformation(data.getFirstName(), data.getLastName(), GenerateRandomEmail.generateRandomEmail(), data.getUserPhone());
        register.selectUserOccupation("Engineer");
        register.clickOnGender();
        register.enterUserCredentials(data.getPassword(), data.getConfirmPassword());
        register.clickOnTermsAndRegisterButton();
    }

}
