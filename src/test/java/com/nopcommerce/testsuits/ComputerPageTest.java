package com.nopcommerce.testsuits;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ComputerPageTest extends BaseTest {
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
    public void verifyUserShouldNavigateToComputerPageSuccessfully() throws InterruptedException {

        homePage.clickOnComputer();
        Thread.sleep(2000);
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(computerPage.getComputerText(),"Computers","");
        softAssert.assertAll();

    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {

        homePage.clickOnComputer();
        Thread.sleep(2000);
        computerPage.clickOnDesktopLink();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(desktopsPage.getDesktopText(),"Desktops","");
        softAssert.assertAll();
    }
    //@Test(dataProvider = "credentials", dataProviderClass = TestData.class,groups = {"regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickOnComputer();
        computerPage.clickOnDesktopLink();
        desktopsPage.clickOnbuildOwnComputer();
        buildYourOwnComputerPage.SelectProcessorDropDown(processor);
        buildYourOwnComputerPage.SelectRam(ram);
        buildYourOwnComputerPage.getHdd(hdd);
        buildYourOwnComputerPage.getOsRadio(os);
        buildYourOwnComputerPage.clickOnSoftwareCheckBox(software);
        buildYourOwnComputerPage.clickOnAddToCard();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(buildYourOwnComputerPage.verifyProductAddEdInToCardText(),"The product has been added to your shopping cart","");
        softAssert.assertAll();
    }
}
