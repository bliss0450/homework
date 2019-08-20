package lesson_11;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    private ChromeDriver driver;

    @DataProvider(name = "email")
    public static Object[][] email() {
        return new Object[][] { { "testuser_1@contr.com" }, { "testuser_2@contr.com" }};
    }

    @DataProvider(name = "email+name")
    public static Object[][] emailName() {
        return new Object[][] { { "testuser_1@contr.com", "Anton" }, { "testuser_2@contr.com", "Boris" }};
    }

    @DataProvider(name = "email+name+surname")
    public static Object[][] emailNameSurname() {
        return new Object[][] { { "testuser_1@contr.com", "Anton", "Lemmy" }, { "testuser_2@contr.com", "Boris", "Konskiy" }};
    }

    @DataProvider(name = "email+name+surname+pass")
    public static Object[][] emailNameSurnamePass() {
        return new Object[][] { { "testuser_1@contr.com", "Anton", "Lemmy", "asdasdasd" }, { "testuser_2@contr.com", "Boris", "Konskiy", "sdfsfsdf" }};
    }

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\ithillel\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test(dataProvider = "email", groups = "smoke")
    public void check8errors(String email) {
        SoftAssert softAssert = new SoftAssert();
        Login loginPage = new Login(driver);
        softAssert.assertEquals(loginPage.get8Errors(email),"There are 8 errors");
    }

    @Test(dataProvider = "email+name")
    public void check7errors(String email, String name) {
        SoftAssert softAssert = new SoftAssert();
        Login loginPage = new Login(driver);
        softAssert.assertEquals(loginPage.get7Errors(email, name),"There are 7 errors");
    }

    @Test(dataProvider = "email+name+surname")
    public void check6errors(String email, String name, String surname) {
        SoftAssert softAssert = new SoftAssert();
        Login loginPage = new Login(driver);
        softAssert.assertEquals(loginPage.get6Errors(email, name, surname), "There are 6 errors");
    }

    @Test(dataProvider = "email+name+surname+pass", groups = "smoke")
    public void check5errors(String email, String name, String surname, String pass) {
        SoftAssert softAssert = new SoftAssert();
        Login loginPage = new Login(driver);
        softAssert.assertEquals(loginPage.get5erros(email, name, surname, pass), "There are 5 errors");
    }
}