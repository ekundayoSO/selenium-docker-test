package com.remote.topdandy;

import base.BaseTest;
import com.remote.topdandy.pages.LoginNewTestPage;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.io.IOException;

public class LoginNewTest extends BaseTest {

    @Test
    public void loginNewTest() throws IOException {

        ConfigurationReader data = new ConfigurationReader();
        LoginNewTestPage login2 = new LoginNewTestPage(driver);

        driver.get(data.geURL());
        driver.manage().window().maximize();

        login2.enterUserEmail(data.getLoginEmail());
        login2.enterUserPassword(data.getPassword());
        login2.clickOnLoginButton();


    }


}
