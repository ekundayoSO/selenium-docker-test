package com.remote.topdandy;

import base.BaseTest;
import com.remote.topdandy.pages.LoginTestPage;
import org.testng.annotations.Test;
import utilities.ConfigurationReader;

import java.io.IOException;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() throws IOException {

        ConfigurationReader data = new ConfigurationReader();
        LoginTestPage login = new LoginTestPage(driver);


        driver.get(data.geURL());
        driver.manage().window().maximize();



        login.enterUserEmail(data.getLoginEmail());
        login.enterUserPassword(data.getPassword());
        login.clickOnLoginButton();


    }


}
