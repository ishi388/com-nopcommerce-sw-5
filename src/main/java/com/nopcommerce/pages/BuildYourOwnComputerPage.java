package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement BuildyourowncomputerText;

    public String verifBuildComputerText() {
        Reporter.log("getting  text from BuildyourowncomputerText"+BuildyourowncomputerText.toString()+"<br>");
        return getTextFromElement(BuildyourowncomputerText);
    }

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement ProcessorDropDown;

    public void SelectProcessorDropDown(String processor) {
        Reporter.log("Selecting ProcessorDropDown "+ processor+" from dropdown "+ProcessorDropDown.toString() + "<br>");
        selectByVisibleTextFromDropDown(ProcessorDropDown, processor);
    }

    @FindBy(xpath = "//select[@name='product_attribute_2']")
    WebElement Ramdropdown;

    public void SelectRam(String Ram) {
        Reporter.log("Selecting Ramdropdown "+Ram +" from dropdown "+Ramdropdown.toString() + "<br>");
        selectByVisibleTextFromDropDown(Ramdropdown, Ram);
    }

    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement HDDradios320;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement HDDradios400;

    public void getHdd(String Hddtext) {
        if (Hddtext == "320GB") {
            Reporter.log("Clicking on 320GB"+ HDDradios320.toString()+ "<br>");
            clickOnElement(HDDradios320);
        } else {
            Reporter.log("Clicking on 400GB"+ HDDradios400.toString()+ "<br>");
            clickOnElement(HDDradios400);
        }
    }

    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement VistaPremium;

    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement VistaHome1;

    public void getOsRadio(String radio) {
        if (radio == "VistaHome") {
            Reporter.log("Clicking on VistaHome "+ VistaHome1.toString()+ "<br>");
            clickOnElement(VistaHome1);
        } else {
            Reporter.log("Clicking on VistaPremium"+ VistaPremium.toString()+ "<br>");
            clickOnElement(VistaPremium);

        }
    }

    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement TotalCommander1;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement MicrosoftOffice1;

    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement AcrobatReader1;

    public void clickOnSoftwareCheckBox(String software) {
        if (software == "MicrosoftOffice") {
            Reporter.log("Clicking on MicrosoftOffice"+ MicrosoftOffice1.toString()+ "<br>");
            clickOnElement(MicrosoftOffice1);
        }
        if (software == "TotalCommander") {
            Reporter.log("Clicking on TotalCommander"+ TotalCommander1.toString()+ "<br>");
            clickOnElement(TotalCommander1);
        }
        if (software == "AcrobatReader") {
            Reporter.log("Clicking on AcrobatReader"+ AcrobatReader1.toString()+ "<br>");
            clickOnElement(AcrobatReader1);
        }
    }

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement AddToCardbutton;

    public void clickOnAddToCard() {
        Reporter.log("Clicking on AddToCardbutton"+AddToCardbutton.toString()+ "<br>");
        clickOnElement(AddToCardbutton);
    }

    @FindBy(xpath = "//p[@class='content']")
    WebElement Theproducthasbeenaddedtoyourshoppingcart;

    public String verifyProductAddEdInToCardText() {
        Reporter.log("getting  text from The product has been added to your shopping cart"+ Theproducthasbeenaddedtoyourshoppingcart.toString()+"<br>");
        return getTextFromElement(Theproducthasbeenaddedtoyourshoppingcart);
    }
}
