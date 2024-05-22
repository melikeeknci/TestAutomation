import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.DevToolsException;


import java.util.concurrent.TimeUnit;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestResultLogger.class)
public class BaseTest {

    WebDriver driver;

    @BeforeAll
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://192.168.1.54:9595/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#root > div > div > div > div > div > div.pt-0.card-body > div.p-2 > form > div > div:nth-child(1) > div > input")).sendKeys("melikeek");
        driver.findElement(By.cssSelector("#root > div > div > div > div > div > div.pt-0.card-body > div.p-2 > form > div > div:nth-child(2) > div > input")).sendKeys("1");
        driver.findElement(By.cssSelector("#root > div > div > div > div > div > div.pt-0.card-body > div.p-2 > form > div > div:nth-child(3) > div > button")).click();
    }
}