import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CitysearchPage extends BasePage {

    By cityClickSearchLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-root-wrapper-body.ag-focus-managed.ag-layout-normal > div.ag-root.ag-unselectable.ag-layout-normal > div.ag-header.ag-pivot-off.ag-header-allow-overflow > div.ag-header-viewport > div > div > div:nth-child(1) > div.ag-header-cell-comp-wrapper > div > span > span");
    By citySearchLocator = new By.ById("ag-128-input");
    By cityApplyLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-theme-alpine.ag-popup > div > div.ag-tabs-body.ag-menu-body > div > form > div.ag-filter-apply-panel > button:nth-child(1)");
    By cityResetLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-theme-alpine.ag-popup > div > div.ag-tabs-body.ag-menu-body > div > form > div.ag-filter-apply-panel > button:nth-child(2)");
    By cityLineLocator = new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[1]/span[2]/span");
    By cityPinColumnslocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-theme-alpine.ag-popup > div > div.ag-tabs-body.ag-menu-body > div > div:nth-child(2) > span.ag-menu-option-part.ag-menu-option-text");
    By cityPinLeftLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div:nth-child(7) > div > div > div:nth-child(3) > span.ag-menu-option-part.ag-menu-option-text");


    public CitysearchPage(WebDriver driver) {
        super(driver);
    }

    public void clickCitySearch() {
        click(cityClickSearchLocator);
    }
    public void CitySearch(String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(citySearchLocator));
        type(citySearchLocator, text);

    }
    public void clickCityApply() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityApplyLocator));
        click(cityApplyLocator);
    }
    public void CityReset() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityResetLocator));
        click(cityResetLocator);
    }
    public void CityLine() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityLineLocator));
        click(cityLineLocator);
    }
    public void CityPinColumns() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityPinColumnslocator));
        click(cityPinColumnslocator);
    }
    public void CityPinLeft() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cityPinLeftLocator));
        click(cityPinLeftLocator);
    }

}
