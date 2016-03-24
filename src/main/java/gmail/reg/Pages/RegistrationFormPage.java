package gmail.reg.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Dmitri.Korobtsov on 3/22/2016.
 */
public class RegistrationFormPage extends BasePage {

    public RegistrationFormPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='wrapper']")
    public WebElement formSelector;

    @FindBy(xpath = "//*[@id='FirstName']")
    public WebElement firstName;

    @FindBy(xpath = "//*[@id='LastName']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='GmailAddress']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='Passwd']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='PasswdAgain']")
    public WebElement passwordConfirm;

    @FindBy(xpath = "//*[@id='BirthDay']")
    public WebElement birthDay;

    @FindBy(xpath = "//*[@id='BirthMonth']")
    public WebElement birthMonthComboBox;

    @FindBy(xpath = "//*[@id='BirthYear']")
    public WebElement birthYear;

    @FindBy(xpath = "//*[@id='Gender']")
    public WebElement genderComboBox;

    @FindBy(xpath = "//*[@id='RecoveryPhoneNumber']")
    public WebElement recoveryPhoneNumber;

    @FindBy(xpath = "//*[@id='RecoveryEmailAddress']")
    public WebElement recoveryEmailAddress;

    @FindBy(xpath = "//*[@id='SkipCaptcha']")
    public WebElement skipCaptchaCheckbox;

    @FindBy(xpath = "//*[@id='CountryCode']")
    public WebElement locationComboBox;

    public void selectMonth(int index) {
        Select month = new Select(birthMonthComboBox);
        month.selectByIndex(index);
    }

    public void selectGender(String gender) {
        Select month = new Select(genderComboBox);
        month.selectByValue(":" + gender);
    }

    public void selectLocation(String country) {
        Select location = new Select(locationComboBox);
        location.selectByVisibleText(country);
    }
}
