import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CountryDetailsPage extends BasePage {

    By detailsLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-root-wrapper-body.ag-focus-managed.ag-layout-normal > div.ag-root.ag-unselectable.ag-layout-normal > div.ag-body.ag-layout-normal > div.ag-body-clipper.ag-layout-normal > div > div.ag-pinned-left-cols-container > div.ag-row-even.ag-row.ag-row-level-0.ag-row-position-absolute.ag-row-first.ag-row-not-inline-editing.ag-row-focus > div > div:nth-child(1) > div > div > button:nth-child(3)");
    By detailsCancelLocator = new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div > button");

    public CountryDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void clickDetails(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(detailsLocator));
        click(detailsLocator);
    }

    public void clickDetailsCancel() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(detailsCancelLocator));
        click(detailsCancelLocator);
    }




}
