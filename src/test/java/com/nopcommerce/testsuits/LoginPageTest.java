package com.nopcommerce.testsuits;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    LoginPage loginPage;
    RegisterPage registerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }

    @Test(groups = {"sanity","smoke","regression"})
    public void userShouldNavigateToLoginPageSuccessFully() {
        homePage.clickOnLogin();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.verifyWelcomeText(), "Welcome, Please Sign In!", "");
        softAssert.assertAll();
    }

    @Test(groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        homePage.clickOnLogin();
        loginPage.setEmailField("prime123@gmail.com");
        loginPage.setPasswordField("12345");
        loginPage.clickOnLoginButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(loginPage.verifyErrorMsgText(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", "");
        softAssert.assertAll();
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homePage.clickOnLogin();
        loginPage.setEmailField("prime011@gmail.com");
        loginPage.setPasswordField("prime1234");
        loginPage.clickOnLoginButton();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.verifyLogOutText(), "Log out", "");
        softAssert.assertAll();
    }

    @Test(groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() {
        homePage.clickOnLogin();
        loginPage.setEmailField("prime011@gmail.com");
        loginPage.setPasswordField("prime1234");
        loginPage.clickOnLoginButton();
        homePage.clickOnLogOutLink();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(homePage.verifyloginText(), "Log in", "");
        softAssert.assertAll();

    }
}
