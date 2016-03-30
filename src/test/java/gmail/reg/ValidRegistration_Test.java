package gmail.reg;

import gmail.reg.Pages.RegistrationFormPage;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import org.junit.runners.Parameterized.Parameters;


import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidRegistration_Test extends BaseTestClass{

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String passwordConfirm;
    private String birthDay;
    private String birthYear;
    private String mobile;
    private String emailRecovery;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { "Uno", "DoubleUno", "asdfghjklqwertyuiop", "123456", "123456","11", "1977", "661234567", "dsfsdfdsfsfdsf@sdsfdsfsfd.net"  }

        });
    }

    public ValidRegistration_Test(String firstName, String lastName, String email, String password, String passwordConfirm, String birthDay, String birthYear, String mobile, String emailRecovery) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.mobile = mobile;
        this.emailRecovery = emailRecovery;
    }

    @Test
    public void validRegistration() throws InterruptedException{
        RegistrationFormPage regPage = PageFactory.initElements(driver, RegistrationFormPage.class);
        Assert.assertTrue("Registration Form is present", regPage.formSelector.isDisplayed());
      /*  regPage.firstName.sendKeys(firstName);
        regPage.lastName.sendKeys(lastName);
        regPage.email.sendKeys(email);
        regPage.password.sendKeys(password);
        regPage.passwordConfirm.sendKeys(passwordConfirm);*/
        //month
        regPage.selectMonth(2);
        regPage.birthDay.sendKeys(birthDay);
        regPage.birthYear.sendKeys(birthYear);
        //gender
        regPage.selectGender("f");
        regPage.recoveryPhoneNumber.sendKeys(mobile);
        regPage.recoveryEmailAddress.sendKeys(emailRecovery);
        regPage.skipCaptchaCheckbox.click();
        //locaton
        regPage.selectLocation("Ukraine");
        regPage.privacyCheckBox.click();
    //    regPage.submitButton.click();


    }
}
