package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class RegisterTest extends BaseTest{

    private WebDriver driver;

    @Test

    public void validRegisterTest(){
        homePage.clickAccountLink();
        homePage.clickRegisterLink();

    }
}
