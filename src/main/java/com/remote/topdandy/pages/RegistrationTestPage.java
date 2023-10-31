package com.remote.topdandy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class RegistrationTestPage {
    WebDriver driver;
    By RegisterHereLinkText = By.className("text-reset");
    By FirstNameField = By.id("firstName");
    By LastNameField = By.id("lastName");
    By UserEmailField = By.id("userEmail");
    By UserPhoneNumber = By.id("userMobile");
    By SelectOccupation = By.xpath("//select[@formcontrolname='occupation']");
    By SelectGender = By.xpath("//input[@value='Male']");
    By PasswordInput = By.id("userPassword");
    By ConfirmPasswordInput = By.id("confirmPassword");
    By TermsAndCondition = By.xpath("//input[@type='checkbox']");
    By RegisterButton = By.id("login");
    By Assertion = By.xpath("//hi[@contains(text()), 'Account Created Successfully']");


    // Actions

    public RegistrationTestPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickOnRegisterHereLink() {

        driver.findElement(RegisterHereLinkText).click();
    }

    public void fillUserInformation(String fName, String lName, String email, String phone) {
        driver.findElement(FirstNameField).sendKeys(fName);
        driver.findElement(LastNameField).sendKeys(lName);
        driver.findElement(UserEmailField).sendKeys(email);
        driver.findElement(UserPhoneNumber).sendKeys(phone);
    }

    public void selectUserOccupation(String profession) {
        Select occupation = new Select(driver.findElement(SelectOccupation));
        occupation.selectByVisibleText(profession);
    }

    public void clickOnGender() {

        driver.findElement(SelectGender).click();
    }

    public void enterUserCredentials(String passwd, String confirmPwd) {
        driver.findElement(PasswordInput).sendKeys(passwd);
        driver.findElement(ConfirmPasswordInput).sendKeys(confirmPwd);

    }

    public void clickOnTermsAndRegisterButton() {
        driver.findElement(TermsAndCondition).click();
        driver.findElement(RegisterButton).click();
    }




}
