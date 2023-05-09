package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div/div/ul[1]/li[1]/a[1]")
    WebElement ComputersText;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement DesktopsLink;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]")
    WebElement NotebooksLink;
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/h2[1]/a[1]")
    WebElement SoftwareLink;


    public String getComputerText(){
        Reporter.log("getting  text from ComputersText"+ComputersText.toString()+"<br>");
        return getTextFromElement(ComputersText);
    }



    public void clickOnDesktopLink(){
        Reporter.log("Clicking on DesktopsLink "+DesktopsLink .toString()+ "<br>");
        clickOnElement(DesktopsLink);
    }


    public void clickOnNotepadLink(){
        Reporter.log("Clicking on NotebooksLink"+ NotebooksLink.toString()+ "<br>");
        clickOnElement(NotebooksLink);}



    public void clickOnSoftWareLink(){
        Reporter.log("Clicking on SoftwareLink "+ SoftwareLink.toString()+ "<br>");
        clickOnElement(SoftwareLink);}


}
