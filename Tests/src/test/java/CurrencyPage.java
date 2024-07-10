import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CurrencyPage extends BasePage {
    By currencyAddNewLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > button");
    By currencyExportLocator= new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > div:nth-child(2) > button");
    By currencyExcelExportLocator= new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > div.btn-group.show > div > button:nth-child(1)");
    By currencyCSVExportLocator= new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.d-flex.align-items-center > div.d-flex.flex-wrap.gap-3.align-items-center > div > div.btn-group.show > div > button:nth-child(2)");
    By currencyEditLocator = new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[2]/div/div[1]/div/a/i");
    By currencyEditButtonLocator = new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[2]/div/div[1]/div/div/a[1]/i");
    By currencyDetailsButtonLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-root-wrapper-body.ag-focus-managed.ag-layout-normal > div.ag-root.ag-unselectable.ag-layout-normal > div.ag-body.ag-layout-normal > div.ag-body-clipper.ag-layout-normal > div > div.ag-pinned-left-cols-container > div.ag-row-odd.ag-row.ag-row-level-0.ag-row-position-absolute.ag-row-not-inline-editing.ag-row-focus > div > div:nth-child(1) > div > div > a:nth-child(3) > i");
    By currencyEditDetailsCancelLocator= new By.ByXPath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[2]/div[2]/div/button");
    By currencyEditCancelLocator = new By.ByXPath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[2]");
    By currencyEditUpdateLocator = new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > button.btn.btn-success.save-event");
    By currencyEditName = new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(1) > div > div > input");
    By currencySearchButtonLocator= new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/span/span");
    By curencySearchLocator=new By.ById("ag-88-input");
    By currencySearchBox=new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-theme-alpine.ag-popup > div > div.ag-tabs-body.ag-menu-body > div > form > div.ag-filter-body-wrapper.ag-set-filter-body-wrapper > div > div.ag-set-filter-list > div > div.ag-virtual-list-container.ag-filter-virtual-list-container > div:nth-child(2) > div > div > div.ag-wrapper.ag-input-wrapper.ag-checkbox-input-wrapper.ag-checked");
    By currencyApplyLocator= new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[2]/button[1]");
    By currencyResetLocator= new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-theme-alpine.ag-popup > div > div.ag-tabs-body.ag-menu-body > div > form > div.ag-filter-apply-panel > button:nth-child(2)");
    By currencyLineLocator= new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[1]/span[2]/span");
    By searchPanel= new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[1]/span[1]/span");
    By selectAllLocator= new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[1]/div/div[4]/div/div[2]/div[1]/div/div/div[2]");
    By currencyColumnsButtonLocator= new By.ByXPath("//*[@id=\"ag-9-button\"]/div/span");
    By currencyColumnsSearchLocator= new By.ByXPath("//*[@id=\"ag-16-input\"]");
    By currencyColumnsClick= new By.ByXPath("//*[@id=\"ag-71-input\"]");





    public CurrencyPage(WebDriver driver) {
        super(driver);
    }

    public void currencyAddNew() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(currencyAddNewLocator)).click();

    }
    public void currencyExport() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(currencyExportLocator)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(currencyExcelExportLocator)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(currencyExportLocator)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(currencyCSVExportLocator)).click();

    }

    public void edit(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(currencyEditLocator)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(currencyEditButtonLocator)).click();

    }

    public void editUpdate(){
        find(currencyEditName).sendKeys("fv");
        click(currencyEditUpdateLocator);
    }

    public void editCancel(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(currencyEditLocator)).click();
        click(currencyEditButtonLocator);
        click(currencyEditCancelLocator);
    }
    public void editDetails(){
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(currencyEditLocator)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(currencyDetailsButtonLocator)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(currencyEditDetailsCancelLocator)).click();


    }
    public void currencyClickSearch(){
       click(currencySearchButtonLocator);
    }
    public void currencyClickButton(){
        click(currencySearchBox);

    }
    public void apply(){
        click(currencyApplyLocator);
    }
    public void reset(){
        click(currencyResetLocator);

    }

    public void currencySearch(String text){
        type(curencySearchLocator,text);
    }

    public void currencyLine(){
        click(currencyLineLocator);
    }
    public void currencyPanel(){
        click(searchPanel);
    }
    public void selectAll(){
    click(selectAllLocator);
    }
    public void columns(){
        click(currencyColumnsButtonLocator);
        click(currencyColumnsClick);
    }
    public void columnsSearch(String text){
        type(currencyColumnsSearchLocator,text);
    }
}
