import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EditPage extends BasePage {


    By clickEditButtonLocator = new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-root-wrapper-body.ag-focus-managed.ag-layout-normal > div.ag-root.ag-unselectable.ag-layout-normal > div.ag-body.ag-layout-normal > div.ag-body-clipper.ag-layout-normal > div > div.ag-pinned-left-cols-container > div.ag-row-even.ag-row.ag-row-level-0.ag-row-position-absolute.ag-row-first.ag-row-not-inline-editing.ag-row-focus > div > div:nth-child(1) > div > div > a");
    By clickEditUpdateLocator = new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > button.btn.btn-success.save-event");
    By clickEditCancelLocator = new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > button.btn.btn-secondary.save-customer");

    public EditPage(WebDriver driver) {
        super(driver);
    }


    public void clickEditButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickEditButtonLocator));
        click(clickEditButtonLocator);
    }
    public void clickEditUpdate() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickEditUpdateLocator));
        click(clickEditUpdateLocator);
    }
    public void clickEditCancel() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickEditCancelLocator));
        click(clickEditCancelLocator);
    }





}
