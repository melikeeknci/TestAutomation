import io.github.bonigarcia.wdm.webdriver.OptionsWithArguments;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v121.console.Console;
import org.openqa.selenium.devtools.v121.network.Network;
import org.openqa.selenium.interactions.Actions;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Currency;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.DevToolsException;



public class Test_Currency extends BaseTest {


    DashboardPage dashboardpage;
    SearchBox searchBox;
    CurrencyPage currencyPage;
    CurrencyAddNewPage currencyAddNewPage;



    @Test
    @Order(1)
    public void Test_Currency() throws AWTException, InterruptedException {
        dashboardpage = new DashboardPage(driver);
        driver.navigate().refresh();


    }

    @Test
    @Order(2)
    public void search() throws InterruptedException {
        searchBox = new SearchBox(driver);
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        dashboardpage.searchBox().searchCurrency("Client Management");
    }


}


