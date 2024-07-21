import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class BaseTest {

   protected WebDriver driver;


    @BeforeAll
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://192.168.1.177:9595/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#root > div > div > div > div > div > div.pt-0.card-body > div.p-2 > form > div > div:nth-child(1) > div > input")).sendKeys("melikeek");
        driver.findElement(By.cssSelector("#root > div > div > div > div > div > div.pt-0.card-body > div.p-2 > form > div > div:nth-child(2) > div > input")).sendKeys("1");
        driver.findElement(By.cssSelector("#root > div > div > div > div > div > div.pt-0.card-body > div.p-2 > form > div > div:nth-child(3) > div > button")).click();
    }

}