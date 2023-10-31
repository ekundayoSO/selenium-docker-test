package com.remote.topdandy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginNewTestPage {
    private WebDriver driver;

    By UserEmail = By.id("userEmail");
    By UserPassword = By.id("userPassword");
    By UserLogin = By.id("login");

    // Actions

    public LoginNewTestPage(WebDriver driver) {

        this.driver = driver;
    }

    public void enterUserEmail(String userEmail) {

        driver.findElement(UserEmail).sendKeys(userEmail);
    }

    public void enterUserPassword(String pwd) {

        driver.findElement(UserPassword).sendKeys(pwd);
    }

    public void clickOnLoginButton() {

        driver.findElement(UserLogin).click();
    }
}
