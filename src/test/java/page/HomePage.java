package page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    // driver
    private WebDriver driver;
    // create driver in constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // web elements
    @FindBy(css = ".skip-account .label")
    private WebElement accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElement loginLink;

    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(css = ".search-button")
    private WebElement searchButton;

    @FindBy(css = "#header-account > div > ul > li:nth-child(5) > a")
    private WebElement registerLink;

    // methods
    public void clickAccountLink(){

        accountLink.click();
    }
    public void clickLoginLink(){

        loginLink.click();
    }
    public void setSearchField(String value){

        searchField.sendKeys(value);
    }
    public void clickSearchButton(){

        searchButton.click();
    }
    public void clickRegisterLink(){
        registerLink.click();
    }
}
