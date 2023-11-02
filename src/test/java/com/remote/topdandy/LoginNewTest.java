package com.remote.topdandy;

import base.TestBase;
import com.remote.topdandy.pages.LoginNewTestPage;
import org.testng.annotations.Test;

public class LoginNewTest extends TestBase {

    @Test
    public void loginNewTest() {

        LoginNewTestPage login2 = new LoginNewTestPage(driver);

        driver.get(CONFIG.getProperty("url"));
        driver.manage().window().maximize();

        login2.enterUserEmail(CONFIG.getProperty("username"));
        login2.enterUserPassword(CONFIG.getProperty("password"));
        login2.clickOnLoginButton();


    }


}
