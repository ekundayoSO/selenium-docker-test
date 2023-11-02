package com.local.topdandy;

import base.TestBase;
import com.remote.topdandy.pages.RegistrationTestPage;
import org.testng.annotations.Test;
import utilities.GenerateRandomEmail;

import java.io.IOException;

public class RegistrationTest extends TestBase {

    @Test
    public void registerNewUser() {

        RegistrationTestPage register = new RegistrationTestPage(driver);

        driver.get(CONFIG.getProperty("url"));
        driver.manage().window().maximize();

        register.clickOnRegisterHereLink();
        register.fillUserInformation
                (
                        CONFIG.getProperty("userFirstName"),
                        CONFIG.getProperty("userLastName"),
                        GenerateRandomEmail.generateRandomEmail(),
                        CONFIG.getProperty("userPhone")
                );
        register.selectUserOccupation("Engineer");
        register.clickOnGender();
        register.enterUserCredentials
                (
                        CONFIG.getProperty("password"),
                        CONFIG.getProperty("confirm-password")
                );
        register.clickOnTermsAndRegisterButton();
    }


}
