import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CityPage extends BasePage {

    By CityAddNewLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > button");
    By CityExportLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > div:nth-child(2) > button");
    By CityExportExcelLocator = new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/button[1]") ;
    By CityExportCsvLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > div.btn-group.show > div > button:nth-child(2)");

    public CityPage(WebDriver driver) {
        super(driver);
    }

    public void clickCityAddNew(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityAddNewLocator));
        click(CityAddNewLocator);
    }
    public void clickCityExport(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityExportLocator));
        click(CityExportLocator);
    }
    public void clickCityExportExcel(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityExportExcelLocator));
        click(CityExportExcelLocator);
    }
    public void clickCityExportCsv(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityExportCsvLocator));
        click(CityExportCsvLocator);
    }

}
