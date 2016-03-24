package gmail.reg.Pages;


import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;

public class BasePage {

    protected WebDriver driver;

    private static final int DEFAULT_IMPLICITLY_WAIT = 15000;

    public BasePage(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITLY_WAIT, TimeUnit.MILLISECONDS);
        this.driver = driver;
    }

}

