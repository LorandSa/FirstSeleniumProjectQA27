import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChangeLanguageTest {
    private WebDriver driver;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test");
        wait(5);
    }


    @Test
    public void changeLanguageTest(){
//        select-language
        Select selectLanguageDropdown = new Select(driver.findElement(By.id("select-language")));
        selectLanguageDropdown.selectByVisibleText("German");
    }
    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @After
    public void closeDriver(){
        driver.quit();
    }
}
