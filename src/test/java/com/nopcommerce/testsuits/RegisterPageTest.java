package com.nopcommerce.testsuits;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterPageTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    LoginPage loginPage;
    RegisterPage registerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        computerPage=new ComputerPage();
        desktopsPage=new DesktopsPage();
        loginPage=new LoginPage();
        registerPage=new RegisterPage();
        buildYourOwnComputerPage=new BuildYourOwnComputerPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegister();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(registerPage.verifyRegisterText(),"Register","");
        softAssert.assertAll();
    }
    @Test(groups = {"smoke","regression"})
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(
    ){
        homePage.clickOnRegister();
        registerPage.clickOnRegisterButton1();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(registerPage.verifyFirstname(),"First name is required.","");
        softAssert.assertEquals(registerPage.verifyLastName(),"Last name is required.","");
        softAssert.assertEquals(registerPage.verifyemail(),"Email is required.","");
        softAssert.assertEquals(registerPage.verifypassword(),"Password is required.","");
        softAssert.assertEquals(registerPage.verifyconfirmPassword(),"Password is required.","");
        softAssert.assertAll();
    }
    @Test(groups = {"regression"})
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnRegister();
        registerPage.setFirstName("prime");
        registerPage.setLastname("patel");
        registerPage.selectBirthDate("1");
        registerPage.selectBirthMonth("January");
        registerPage.selectBirthYear("2003");
        registerPage.setEmail("prime011@gmail.com");
        registerPage.setpassword("prime1234");
        registerPage.setConfirmPassword("prime1234");
        registerPage.clickOnRegisterButton1();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(registerPage.verifyYourRegisterCompletedText(),"Your registration completed","");
        softAssert.assertAll();
    }
}
