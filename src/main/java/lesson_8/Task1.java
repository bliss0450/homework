package lesson_8;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//        Открыть главную страницу automationpractice.com
//        Открыть форму регистрации нового клиента (Sign in )
//        В секции Create an account ввести корректный емейл
//        Нажать Create an account
//        На форме регистрации заполнить ВСЕ ОБЯЗАТЕЛЬНЫЕ поля , КРОМЕ
//        выпадающих списков
//
//        Нажать Register
//        Проверить что сообщение валидации содержит текст ,
//        например “There are 3 errors”
public class Task1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\ithillel\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//*[@title=\"Log in to your customer account\"]")).click();
        String mail = RandomStringUtils.randomAlphanumeric(5);
        String domain = RandomStringUtils.randomAlphanumeric(5);
        driver.findElement(By.cssSelector("#email_create")).sendKeys(mail + "@" + domain + ".com");
        driver.findElement(By.cssSelector("#SubmitCreate")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("#id_gender1")).click();
        driver.findElement(By.cssSelector("#customer_firstname")).sendKeys(mail);
        driver.findElement(By.cssSelector("#customer_lastname")).sendKeys(domain);
        driver.findElement(By.cssSelector("#passwd")).sendKeys(domain);
        driver.findElement(By.cssSelector("#company")).sendKeys(domain);
        driver.findElement(By.cssSelector("#address1")).sendKeys(domain);
        driver.findElement(By.cssSelector("#city")).sendKeys(domain);
        driver.findElement(By.cssSelector("#postcode")).sendKeys("12345");
        driver.findElement(By.cssSelector("#phone_mobile")).sendKeys("12345");
        driver.findElement(By.cssSelector("#submitAccount")).click();
        if (driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p[contains(text(),'There are 3 errors')]")).isDisplayed()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
