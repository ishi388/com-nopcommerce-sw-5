package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class RegisterPage extends Utility {

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[text()='Register']")
    WebElement RegisterText;

    public String verifyRegisterText() {
        Reporter.log("getting registration Text" + RegisterText.toString() + "<br>");
        return getTextFromElement(RegisterText);
    }


    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement maleRadioButton;

    public void clickOnMaleButton() {
        Reporter.log("Clicking on maleRadioButton " + maleRadioButton.toString() + "<br>");
        clickOnElement(maleRadioButton);
    }


    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement femaleradioButton;

    public void clickOnFemaleButton() {
        Reporter.log("Clicking on femaleradioButton" + femaleradioButton.toString() + "<br>");

        clickOnElement(femaleradioButton);
    }


    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement Firstname;

    public void setFirstName(String fname) {

        Reporter.log("Enter fname" + fname + " to first name field " + Firstname.toString() + "<br>");
        sendTextToElement(Firstname, fname);
    }


    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastname;

    public void setLastname(String Lname) {

        Reporter.log("Enter Lastname" + Lname + " to  Lastname field " + lastname.toString() + "<br>");
        sendTextToElement(lastname, Lname);
    }


    @FindBy(name = "DateOfBirthDay")
    WebElement DateofBirth;

    public void selectBirthDate(String birthDate) {
        Reporter.log("Selecting date" + birthDate + " from dropdown " + DateofBirth.toString() + "<br>");
        selectByValueFromDropDown(DateofBirth, birthDate);
    }


    @FindBy(name = "DateOfBirthMonth")
    WebElement MonthofBirth;

    public void selectBirthMonth(String birthMonth1) {
        Reporter.log("Selecting month" + birthMonth1 + " from dropdown " + MonthofBirth.toString() + "<br>");
        selectByVisibleTextFromDropDown(MonthofBirth, birthMonth1);
    }


    @FindBy(name = "DateOfBirthYear")
    WebElement YearofBirth;

    public void selectBirthYear(String birthYear) {
        Reporter.log("Selecting year" + birthYear + " from dropdown " + YearofBirth.toString() + "<br>");
        selectByValueFromDropDown(YearofBirth, birthYear);
    }


    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    public void setEmail(String Email) {
        Reporter.log("Enter email" + Email + " to email field " + email.toString() + "<br>");
        sendTextToElement(email, Email);
    }


    @FindBy(xpath = "//input[@id='Password']")
    WebElement Password;

    public void setpassword(String password) {
        Reporter.log("Enter password " + password + " to password field " + Password.toString() + "<br>");
        sendTextToElement(Password, password);
    }


    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement ConfirmPassword;

    public void setConfirmPassword(String confirmPassword) {
        Reporter.log("Enter confirmpassword" + confirmPassword + " to confirmpassword  field " + ConfirmPassword.toString() + "<br>");
        sendTextToElement(ConfirmPassword, confirmPassword);
    }


    @FindBy(xpath = "//button[@id='register-button']")
    WebElement RegisterButton;

    public void clickOnRegisterButton1() {

        Reporter.log("Clicking on register Button" + RegisterButton.toString() + "<br>");
        clickOnElement(RegisterButton);
    }

    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement Firstname1;

    public String verifyFirstname() {
        Reporter.log("getting FirstName text from " + Firstname1.toString() + "<br>");
        return getTextFromElement(Firstname1);
    }

    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement LastName1;

    public String verifyLastName() {
        Reporter.log("getting lastname text from " + LastName1.toString() + "<br>");
        return getTextFromElement(LastName1);
    }

    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement email1;

    public String verifyemail() {
        Reporter.log("getting email text from " + email.toString() + "<br>");
        return getTextFromElement(email1);
    }

    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement password1;

    public String verifypassword() {
        Reporter.log("getting  password text from " + password1.toString() + "<br>");
        return getTextFromElement(password1);
    }


    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPassword1;

    public String verifyconfirmPassword() {
        Reporter.log("getting confirmPassword text from " + confirmPassword1.toString() + "<br>");
        return getTextFromElement(confirmPassword1);
    }


    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement Yourregistrationcompleted;

    public String verifyYourRegisterCompletedText() {
        Reporter.log("getting registration text from " + Yourregistrationcompleted.toString() + "<br>");
        return getTextFromElement(Yourregistrationcompleted);
    }
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement countinue;
    public void clickOnCountinue() {
        Reporter.log("Clicking on continue Button" + countinue.toString() + "<br>");
        clickOnElement(countinue);
    }
}