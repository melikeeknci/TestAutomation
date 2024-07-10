import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CurrencyAddNewPage extends BasePage {

    By currencyNameLocator = new By.ByCssSelector("input[name='currencyName']");
    By currencyAddAnother = new By.ByCssSelector("label[class='form-check-label']");
    By currencySaveLocator = new By.ByCssSelector("button[class$='save-event']");
    By currencyCancelLoator = new By.ByCssSelector("button[class$='save-customer']");


    public CurrencyAddNewPage(WebDriver driver) {

        super(driver);
    }
    public void currencyName(String text){
        type(currencyNameLocator, text);
    }
    public void clickSave(){
        click(currencySaveLocator);
    }
    public void clickcancel(){
        click(currencyCancelLoator);
    }





}
