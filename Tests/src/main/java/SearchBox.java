import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;

public class SearchBox extends BasePage {

    By searchBoxLocator = new By.ByCssSelector("#search");//#side-menu > li:nth-child(6) > a > i//#side-menu > li:nth-child(6) > a
    By adressManagmentLocator = new By.ByCssSelector("#side-menu > li > a > span");
    By countryLocator = new By.ByCssSelector("#side-menu > li.mm-active > ul > li:nth-child(2) > a");
    By cityLocator = new By.ByCssSelector("#side-menu > li > ul > li > a");
    By districtLocator = new By.ByCssSelector("#side-menu > li.mm-show > ul > li.mm-show > a");
    By clientManagmentLocator = new By.ByXPath("//li/a/span[contains(text() , 'Courier Management')]");
    By currencyLocator = new By.ByXPath("//ul/li/a[contains(text() , 'Courier Company')]");
    public SearchBox(WebDriver driver) {
        super(driver);
    }

    public void searchCountry(String text) {


        type((By) searchBoxLocator, text);
        LocalStorage local = ((WebStorage) driver).getLocalStorage();
        local.setItem("clickNewTab", "false");
        click((By) adressManagmentLocator);
        click((By) countryLocator);
     //   driver.navigate().refresh();

    }

    public void searchCity(String text) {
        type((By) searchBoxLocator, text);
        LocalStorage local = ((WebStorage) driver).getLocalStorage();
        local.setItem("clickNewTab", "false");
        click((By) adressManagmentLocator);
        click((By) cityLocator);

    }
    public void searchDistrict(String text) {
        type((By) searchBoxLocator, text);
        LocalStorage local = ((WebStorage) driver).getLocalStorage();
        local.setItem("clickNewTab", "false");
        click((By) adressManagmentLocator);
        click((By) districtLocator);
        driver.navigate().refresh();

    }

    public void searchCurrency(String text) {
        type((By) searchBoxLocator, text);
        click((By) clientManagmentLocator);
        click((By) currencyLocator);
    }



}
