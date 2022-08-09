package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
    // driver
    private WebDriver driver;
    // create driver in constructor
    public RegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // web elements
    @FindBy(id = "firstname")
    private WebElement firstNameInputField;

    public void setFirstNameInputField(){
        firstNameInputField.sendKeys();
    }
}
