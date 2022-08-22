package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest extends BaseTest {

    private WebDriver driver;


    @Test

    public void validLoginTest() {
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField(userEmail);
        loginPage.setPasswordField(userPass);
        loginPage.clickLoginButton();
        Assert.assertEquals("Hello, TestFirstName TestLastName!", accountPage.getWelcomeText());
    }
}
