package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "Email")
    WebElement EmailField;
    @FindBy(name = "Password")
    WebElement passwordField;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement LoginButton;
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement WelcomeText;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]")
    WebElement ErrorMsg;

    public void setEmailField(String emailField) {
        Reporter.log("Enter Email"+emailField + "to Email field"+ EmailField.toString() + "<br>");
        sendTextToElement(EmailField, emailField);
    }

    public void setPasswordField(String Password) {
        Reporter.log("Enter password "+ Password+ " to password field "+ passwordField.toString() + "<br>");
        sendTextToElement(passwordField, Password);
    }
    public void clickOnLoginButton() {
        Reporter.log("Clicking on loginButton"+ LoginButton.toString()+ "<br>");
        clickOnElement(LoginButton);
    }
    public String verifyWelcomeText() {
        Reporter.log("getting welcome text from " +WelcomeText.toString() + "<br>");
        return getTextFromElement(WelcomeText);
    }
    public String verifyErrorMsgText() {
        Reporter.log("getting Error text from " + ErrorMsg.toString() + "<br>");
        return getTextFromElement(ErrorMsg);
    }
}
