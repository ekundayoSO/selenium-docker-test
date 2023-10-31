package com.newtests;

import base.TestBase;
import com.remote.topdandy.pages.RegistrationTestPage;
import org.testng.annotations.Test;
import utilities.GenerateRandomEmail;

public class RegistrationTest extends TestBase {

    @Test
    public void registerNewUser() {

        driver.get(CONFIG.getProperty("url"));
        driver.manage().window().maximize();

        RegistrationTestPage rp = new RegistrationTestPage(driver);

        rp.clickOnRegisterHereLink();
        rp.fillUserInformation(CONFIG.getProperty("userFirstName"), CONFIG.getProperty("userLastName"),
                GenerateRandomEmail.generateRandomEmail(),CONFIG.getProperty("userPhone"));
        rp.selectUserOccupation("Engineer");
        rp.clickOnGender();
        rp.enterUserCredentials("password", "confirm-password");
        rp.clickOnTermsAndRegisterButton();


     }


}
