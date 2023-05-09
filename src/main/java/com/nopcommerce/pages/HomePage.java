package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "Computers")
    WebElement computerTab;
    @FindBy(linkText = "Electronics")
    WebElement ElectronicsTab;
    @FindBy(linkText = "Apparel")
    WebElement ApparelTab;
    @FindBy(linkText = "Digital downloads")
    WebElement DigitaldownloadsTab;
    @FindBy(linkText = "Books")
    WebElement BooksTab;
    @FindBy(linkText = "Jewelry")
    WebElement JewelryTab;
    @FindBy(linkText = "Gift Cards")
    WebElement GiftCardsTab;
    @FindBy(linkText = "Log in")
    WebElement loginlink;
    @FindBy(linkText = "Register")
    WebElement registertionLink;
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;
    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement logoLink;
    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement myAccountLink;

    public void clickOnComputer() {
        Reporter.log("Clicking on computerTab" + computerTab.toString() + "<br>");
        clickOnElement(computerTab);
    }

    public void clickOnElectronics() {
        Reporter.log("Clicking on ElectronicsTab " + ElectronicsTab.toString() + "<br>");
        clickOnElement(ElectronicsTab);
    }

    public void clickOnApparel() {
        Reporter.log("Clicking on ApparelTab" + ApparelTab.toString() + "<br>");
        clickOnElement(ApparelTab);
    }

    public void clickOnDigital() {
        Reporter.log("Clicking on DigitaldownloadsTab" + DigitaldownloadsTab.toString() + "<br>");
        clickOnElement(DigitaldownloadsTab);
    }

    public void clickOnBooks() {
        Reporter.log("Clicking on BooksTab " + BooksTab.toString() + "<br>");
        clickOnElement(BooksTab);
    }

    public void clickOnJewelry() {
        Reporter.log("Clicking on JewelryTab" + JewelryTab.toString() + "<br>");
        clickOnElement(JewelryTab);
    }

    public void clickOnGiftCard() {
        Reporter.log("Clicking on GiftCardsTab" + GiftCardsTab.toString() + "<br>");
        clickOnElement(GiftCardsTab);
    }

    public void clickOnLogin() {
        Reporter.log("Clicking on loginlink" + loginlink.toString() + "<br>");
        clickOnElement(loginlink);
    }

    public String verifyloginText() {
        Reporter.log("getting  text from loginlink" + loginlink.toString() + "<br>");
        return getTextFromElement(loginlink);
    }

    public void clickOnRegister() {
        Reporter.log("Clicking on registertionLink" + registertionLink.toString() + "<br>");
        clickOnElement(registertionLink);
    }

    public void clickOnLogOutLink() {
        Reporter.log("Clicking on logOutLink" + logOutLink.toString() + "<br>");
        clickOnElement(logOutLink);
    }

    public String verifyLogOutText() {
        Reporter.log("getting  text from logOutLink" + logOutLink.toString() + "<br>");
        return getTextFromElement(logOutLink);
    }
    public void clickOnLogo() {
        Reporter.log("Clicking on logoLink" + logoLink.toString() + "<br>");
        clickOnElement(logoLink);
    }
    public void clickOnMyAccount() {
        Reporter.log("Clicking on myAccountLink" + myAccountLink.toString() + "<br>");
        clickOnElement(myAccountLink);
    }
}
