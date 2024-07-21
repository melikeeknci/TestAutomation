import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CountryDeletePage extends BasePage {
    By DeleteLocator= new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-root-wrapper-body.ag-focus-managed.ag-layout-normal > div.ag-root.ag-unselectable.ag-layout-normal > div.ag-body.ag-layout-normal > div.ag-body-clipper.ag-layout-normal > div > div.ag-pinned-left-cols-container > div.ag-row-even.ag-row.ag-row-level-0.ag-row-position-absolute.ag-row-first.ag-row-not-inline-editing.ag-row-focus > div > div:nth-child(1) > div > div > button:nth-child(2)");
    By editDeleteLocator= new By.ByCssSelector("body > div:nth-child(4) > div > div.modal.fade.show > div > div > div > div:nth-child(2) > div > div > button.btn.btn-danger.me-2");
    By DeleteEditCloseLocator= new By.ByCssSelector("body > div:nth-child(4) > div > div.modal.fade.show > div > div > div > div:nth-child(3) > div > div > button.btn.btn-secondary.save-customer");
    By editCancelLocator = new By.ByCssSelector("body > div:nth-child(4) > div > div.modal.fade.show > div > div > div > div:nth-child(2) > div > div > button.btn.btn-secondary.me-2");

    public CountryDeletePage(WebDriver driver) {
        super(driver);

    }

    public void clickDelete(){
        wait.until(ExpectedConditions.elementToBeClickable(DeleteLocator));
        driver.findElement(DeleteLocator).click();
    }
    public void clickEditDelete(){
        wait.until(ExpectedConditions.elementToBeClickable(editDeleteLocator));
        driver.findElement(editDeleteLocator).click();
    }
    public void clickDeleteEditClose(){
        wait.until(ExpectedConditions.elementToBeClickable(DeleteEditCloseLocator));
        driver.findElement(DeleteEditCloseLocator).click();
    }
    public void clickEditCancel(){
        wait.until(ExpectedConditions.elementToBeClickable(editCancelLocator));
        driver.findElement(editCancelLocator).click();
    }






}
