package gmail.reg;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseTestClass {

    public WebDriver driver;

    private String sourceURL = "https://accounts.google.com/SignUp";

    private final int DEFAULT_IMPLICITLY_WAIT = 15000;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(sourceURL);
        driver.manage().timeouts().implicitlyWait(DEFAULT_IMPLICITLY_WAIT, TimeUnit.MILLISECONDS);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}