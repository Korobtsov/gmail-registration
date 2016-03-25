package gmail.reg;

import gmail.reg.Pages.RegistrationFormPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ValidRegistration_Test extends BaseTestClass{

    @Test
    public void validRegistration() throws InterruptedException{
        RegistrationFormPage regPage = PageFactory.initElements(driver, RegistrationFormPage.class);
        System.out.println("findElement =" + driver.findElement(By.xpath("//*[@id='FirstName']")));
        System.out.println("FINDBY =" + regPage.firstName);
        Assert.assertTrue("findElement", driver.findElement(By.xpath("//*[@id='FirstName']")).isDisplayed());
        Assert.assertTrue("FINDBY", regPage.firstName.isDisplayed());

    }
}
