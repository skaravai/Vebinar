import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {

    WebDriver driver;

    @BeforeTest
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @Test
    public void testOTUS(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://otus.ru");
        System.out.println(driver.getTitle()+"=========");

        System.out.println("push");
    }


    @AfterTest
    public void quit(){
        if(driver != null){
            driver.quit();
        }
    }
}
