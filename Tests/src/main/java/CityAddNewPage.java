import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CityAddNewPage extends BasePage{

    By CityAddnewSaveLocator = new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > button.btn.btn-success.save-event");
    By CityAddnewCancelLocator= new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > button.btn.btn-secondary.save-customer");
    By CityAddanotherLocator= new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div > label > input");
    By CityCodeLocator= new By.ByCssSelector("#cityCode_div > input");
    By CityNameLocator= new By.ByCssSelector("#cityName_div > input");
    By CityCountryNameLocator= new By.ByCssSelector("#countryGuid > div > div > div.css-hlgwow > div.css-19bb58m");

    public CityAddNewPage(WebDriver driver) {
        super(driver);
    }
    public void clickCityAddNewSave() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityAddnewSaveLocator));
        click(CityAddnewSaveLocator);
    }
    public void clickCityAddNewCancel() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityAddnewCancelLocator));
        click(CityAddnewCancelLocator);
    }
    public void clickCityAddanother() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityAddanotherLocator));
        click(CityAddanotherLocator);
    }
    public void clickCityCode(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityCodeLocator));
        type(CityCodeLocator, text);
    }
    public void clickCityName(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityNameLocator));
        type(CityNameLocator, text);
    }
    public void clickCityCountryName(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityCountryNameLocator));
        type(CityCountryNameLocator, text);
    }



}
