package gmail.reg;

import gmail.reg.Pages.RegistrationFormPage;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidRegistration_Test extends BaseTestClass{

    @FindBy(xpath = "//*[@id='FirstName']")
    public WebElement firstName1;

    @Test
    public void validRegistration() throws InterruptedException{
        RegistrationFormPage regPage = new RegistrationFormPage(driver);
        System.out.println("findElement =" + driver.findElement(By.xpath("//*[@id='FirstName']")));
        System.out.println("FINDBY =" + regPage.firstName);
        Assert.assertTrue("findElement", driver.findElement(By.xpath("//*[@id='FirstName']")).isDisplayed());
        Assert.assertTrue("FINDBY", regPage.firstName.isDisplayed());

    }
}
