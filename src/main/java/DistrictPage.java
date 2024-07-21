import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DistrictPage extends BasePage {
    public DistrictPage(WebDriver driver) {
        super(driver);
    }
    By districtAddNewLocator  = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > button");
    By distrcitExportLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > div:nth-child(2) > button");
    By districtExcelExportLocator  = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > div.btn-group.show > div > button:nth-child(1)");
    By districtExcelCsvLocator  = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > div.btn-group.show > div > button:nth-child(2)");
    By districtEditLocator  = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-root-wrapper-body.ag-focus-managed.ag-layout-normal > div.ag-root.ag-unselectable.ag-layout-normal > div.ag-body.ag-layout-normal > div.ag-body-clipper.ag-layout-normal > div > div.ag-pinned-left-cols-container > div.ag-row-even.ag-row.ag-row-level-0.ag-row-position-absolute.ag-row-first.ag-row-not-inline-editing.ag-row-focus");
    By districtSearchLocator  = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > button");
    By districtNameLocator = new By.ByCssSelector("#districtName_div > input");
    By districtDescriptionLocator = new By.ByCssSelector("#description_div > textarea");
    By districtDistrictCodeLocator = new By.ByCssSelector("#districtCode_div > input");
    By districtCountryLocator = new By.ByCssSelector("#countryGuid > div > div > div.css-hlgwow > div.css-19bb58m");
    By districtCityNameLocator = new By.ByCssSelector("");
    By districtSaveLocator = new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > button.btn.btn-success.save-event");
    By districtCancelLocator = new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > button.btn.btn-secondary.save-customer");
    By districtAddAnotherLocator = new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div > label > input");



    public void clickDistrictAddNew(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtAddNewLocator));
        click(districtAddNewLocator);
    }
    public void clickDistrictExport(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(distrcitExportLocator));
        click(distrcitExportLocator);
    }
    public void clickDistrictExcelExport(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtExcelExportLocator));
        click(districtExcelExportLocator);
    }
    public void clickDistrictExcelCsv(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtExcelCsvLocator));
        click(districtExcelCsvLocator);
    }
    public void clickDistrictEdit(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtEditLocator));
        click(districtEditLocator);
    }
    public void clickDistrictSearch(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(districtSearchLocator));
        click(districtSearchLocator);

    }


}
