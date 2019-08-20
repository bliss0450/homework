package lesson_11;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author a.lemeshchuk
 */
public class MainPage {
    private static final String MAIN_PAGE_URL ="http://automationpractice.com";
    private ChromeDriver driver;

    @FindBy(xpath="//*[@name=\"submit_search\"]")
    WebElement searchButton;

    @FindBy(id="search_query_top")
    WebElement searchBar;

    public MainPage (ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public MainPage openMainPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public SearchPage searchBarEnterText(String s) {
        searchBar.sendKeys(s);
        searchButton.click();
        return new SearchPage(driver);
    }
}
