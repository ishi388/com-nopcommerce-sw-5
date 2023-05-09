package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopsPage extends Utility {

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement Desktopstext;
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement Sortby;
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement Display;
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement selectProductList;
    @FindBy(xpath ="//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildOwnComputer;


    public String getDesktopText() {
        Reporter.log("getting  text from DeskTop"+Desktopstext.toString()+"<br>");
        return getTextFromElement(Desktopstext);
    }



    public void setSelectSortByProductList(String sortBy) {
        Reporter.log("Selecting Sortby"+sortBy+" from dropdown "+Sortby.toString() + "<br>");
        selectByVisibleTextFromDropDown(Sortby, sortBy);
    }


    public void setSelectDisplayProductList(String display) {
        Reporter.log("Selecting Display"+display+" from dropdown "+Display.toString() + "<br>");
        selectByVisibleTextFromDropDown(Display, display);
    }


    public void clickOnList() {
        Reporter.log("Clicking on ProductList"+ selectProductList.toString()+ "<br>");
        clickOnElement(selectProductList);
    }


    public void clickOnbuildOwnComputer() {
        Reporter.log("Clicking on buildOwnComputer "+ buildOwnComputer.toString()+ "<br>");
        clickOnElement(buildOwnComputer);
    }

}
