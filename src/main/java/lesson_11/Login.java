package lesson_11;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    private static final String MAIN_PAGE_URL ="http://automationpractice.com";

    @FindBy(xpath = "//*[@title=\"Log in to your customer account\"]")
    WebElement login;

    @FindBy(id = "email_create")
    WebElement email;

    @FindBy(id = "SubmitCreate")
    WebElement submitEmail;

    @FindBy(id = "id_gender1")
    WebElement mister;

    @FindBy(id = "customer_firstname")
    WebElement firsName;

    @FindBy(id = "customer_lastname")
    WebElement lastName;

    @FindBy(id="passwd")
    WebElement pass;

    @FindBy(id = "company")
    WebElement company;

    @FindBy(id = "address1")
    WebElement adress;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "postcode")
    WebElement postalcode;

    @FindBy(id = "phone_mobile")
    WebElement phone;

    @FindBy(id = "submitAccount")
    WebElement submit;

    @FindBy(xpath = "//*[@id=\"center_column\"]/div/p")
    WebElement error;

    private ChromeDriver driver;
    public Login(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public Login openLoginPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public void moveToCreateAnAccountForm(String emailAdress) {
        openLoginPage();
        login.click();
        email.sendKeys(emailAdress);
        submitEmail.click();
    }

    public String getErrorText() {
        return error.getText();
    }

    public String get8Errors(String emailAdress) {
        moveToCreateAnAccountForm(emailAdress);
        submit.click();
        return getErrorText();
    }

    public String get7Errors(String emailAdress, String name) {
        moveToCreateAnAccountForm(emailAdress);
        firsName.sendKeys(name);
        submit.click();
        return getErrorText();
    }

    public String get6Errors(String emailAdress, String name, String surname) {
        moveToCreateAnAccountForm(emailAdress);
        firsName.sendKeys(name);
        lastName.sendKeys(surname);
        submit.click();
        return getErrorText();
    }

    public String get5erros(String emailAdress, String name, String surname, String password) {
        moveToCreateAnAccountForm(emailAdress);
        firsName.sendKeys(name);
        lastName.sendKeys(surname);
        pass.sendKeys(password);
        submit.click();
        return getErrorText();
    }
}
