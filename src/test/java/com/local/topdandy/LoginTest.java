package com.local.topdandy;

import base.TestBase;
import com.remote.topdandy.pages.LoginTestPage;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest() {
        LoginTestPage login = new LoginTestPage(driver);

        driver.get(CONFIG.getProperty("url"));
        driver.manage().window().maximize();

        login.enterUserEmail(CONFIG.getProperty("username"));
        login.enterUserPassword(CONFIG.getProperty("password"));
        login.clickOnLoginButton();


    }


}
