import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GridPage extends BasePage {

    By gridLocator= new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-root-wrapper-body.ag-focus-managed.ag-layout-normal > div.ag-root.ag-unselectable.ag-layout-normal > div.ag-header.ag-pivot-off.ag-header-allow-overflow > div.ag-pinned-left-header > div > div > div.ag-header-cell-comp-wrapper > div > span > span");
    By selectorLocator = new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[1]/div/div[4]/div/div[2]/div[1]/div/div/div[2]");
    By gridApplyLocator= new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[2]/button[1]");
    By gridResetLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-theme-alpine.ag-popup > div > div.ag-tabs-body.ag-menu-body > div > form > div.ag-filter-apply-panel > button:nth-child(2)");

    public GridPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnGrid() {
        wait.until(ExpectedConditions.elementToBeClickable(gridLocator));
        click(gridLocator);

    }
    public void clickSelector() {
        wait.until(ExpectedConditions.elementToBeClickable(selectorLocator));
        click(selectorLocator);

    }
    public void clickApply() {
        wait.until(ExpectedConditions.elementToBeClickable(gridApplyLocator));
        click(gridApplyLocator);
    }
    public void clickReset() {
        wait.until(ExpectedConditions.elementToBeClickable(gridResetLocator));
        click(gridResetLocator);
    }

}
