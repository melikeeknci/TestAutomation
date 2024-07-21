import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchBox extends BasePage {

    By searchBoxLocator = new By.ByCssSelector("#search");//#side-menu > li:nth-child(6) > a > i//#side-menu > li:nth-child(6) > a
    By adressManagmentLocator = new By.ByXPath("//*[@id=\"side-menu\"]/li/a/span");
    By countryLocator = new By.ByXPath("//*[@id=\"side-menu\"]/li/ul/li[1]/a");
    By cityLocator = new By.ByXPath("//*[@id=\"side-menu\"]/li/ul/li/a");
    By districtLocator = new By.ByCssSelector("#side-menu > li.mm-show > ul > li.mm-show > a");
    By clientManagmentLocator = new By.ByXPath("//li/a/span[contains(text() , 'Client Management')]");
    By currencyLocator = new By.ByXPath("//li/a[contains(text() , 'Currency')]");
    By clientLocator = new By.ByXPath("//*[@id=\"side-menu\"]/li[1]/ul/li[1]/a");
    By branchLocator = new By.ByXPath("//li/a[contains(text() , 'Branch')]");
    By retailStoreLocator= new By.ByXPath("//li/a[contains(text() , 'Retail Store')]");
    By keyTypeLocator = new By.ByXPath("//li/a[contains(text() , 'Key Type')]");
    By domesticBankLocator = new By.ByXPath("//li/a[contains(text() , 'Domestic Bank')]");
    By clientHsmLmkLocator = new By.ByXPath("//li/a[contains(text() , 'Client Hsm Lmk')]");
    By cilentBinRangeKeyLocator = new By.ByXPath("//li/a[contains(text() , 'Client Bin Range Key')]");
    By mccLocator = new By.ByXPath("//li/a[contains(text() , 'Mcc')]");

    By clientBinLocator= new By.ByXPath("//li/a[contains(text() , 'Client Bin')]");
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLocator));
        type((By) searchBoxLocator, text);
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLocator));
        type((By) searchBoxLocator, text);
        click((By) clientManagmentLocator);
        click((By) currencyLocator);
    }

    public void searchClient(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLocator));
        type((By) searchBoxLocator, text);
        click((By) clientManagmentLocator);
        click((By) clientLocator);
    }

    public void searchBranch(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLocator));
        type((By) searchBoxLocator, text);
        click((By) clientManagmentLocator);
        click((By) branchLocator);

    }
    public void searchReatilStore(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLocator));
        type((By) searchBoxLocator, text);
        click((By) clientManagmentLocator);
        click((By) retailStoreLocator);
    }
    public void searcKeyType(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLocator));
        type((By) searchBoxLocator, text);
        click((By) clientManagmentLocator);
        click((By) keyTypeLocator);
    }
    public void searchDomesticBank(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLocator));
        type((By) searchBoxLocator, text);
        click((By) clientManagmentLocator);
        click((By) domesticBankLocator);
    }
    public void searchClientHsmLmk(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLocator));
        type((By) searchBoxLocator, text);
        click((By) clientManagmentLocator);
        click((By) clientHsmLmkLocator);
    }
    public void searchClientBinRangeKey(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLocator));
        type((By) searchBoxLocator, text);
        click((By) clientManagmentLocator);
        click((By) cilentBinRangeKeyLocator);
    }
    public void searchMcc(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLocator));
        type((By) searchBoxLocator, text);
        click((By) clientManagmentLocator);
        click((By) mccLocator);
    }
    public void searchClientBin(String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBoxLocator));
        type((By) searchBoxLocator, text);
        click((By) clientManagmentLocator);
        click((By) clientBinLocator);
    }
}
