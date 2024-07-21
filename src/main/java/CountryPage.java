import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CountryPage extends BasePage
{

   By CountryAddNewLocator = new By.ById("123987");
   By CountryExportLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > div:nth-child(2) > button");
   By CountryExportCsvLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > div.btn-group.show > div > button:nth-child(2)");
   By CountryExportExcelLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > div.btn-group.show > div > button:nth-child(1)");
   By CountryEditLocator = new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/a");

    public CountryPage(WebDriver driver){
        super(driver);
    }

    public void clickCountryAddNew() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CountryAddNewLocator));
        click(CountryAddNewLocator);

    }
        public void clickCountryExport() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CountryExportLocator));
        click(CountryExportLocator);
        click(CountryExportCsvLocator);

    }
    public void clickCountryExportExcel(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CountryExportLocator));
        click(CountryExportLocator);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CountryExportLocator));
        click(CountryExportExcelLocator);
    }
    public void clickCountryEdit() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(CountryEditLocator));
        click(CountryEditLocator);
    }

}
