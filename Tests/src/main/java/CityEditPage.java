import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CityEditPage extends BasePage {


    By CityEditLocated= new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/a/i");
    By CityEditButtonLocated= new By.ByCssSelector("#layout-wrapper > div.main-content > div.page-content > div > div > div > div > div > div.ag-theme-alpine > div > div > div.ag-root-wrapper-body.ag-focus-managed.ag-layout-normal > div.ag-root.ag-unselectable.ag-layout-normal > div.ag-body.ag-layout-normal > div.ag-body-clipper.ag-layout-normal > div > div.ag-pinned-left-cols-container > div.ag-row-even.ag-row.ag-row-level-0.ag-row-position-absolute.ag-row-first.ag-row-not-inline-editing.ag-row-focus > div > div:nth-child(1) > div > div > a > i");
    By CityEditUpdateLocator= new By.ByXPath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]");
    By CityEditCancelLocator= new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > button.btn.btn-secondary.save-customer");
    By CityDeleteLocated= new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/button[1]/i");
    By CityDeleteButtonLocated= new By.ByXPath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]");
    By CityDeleteCloseLocated= new By.ByXPath("/html/body/div[3]/div/div[1]/div/div/div/div[3]/div/div/button[2]");
    By CityDeleteCancelLocated = new By.ByXPath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[2]");
    By CityDetailsLocated= new By.ByXPath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/button[2]/i");
    By CityDetailsCancel= new By.ByXPath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[2]/div[2]/div/button");
   // By CityIsEditLocator = new By.ByCssSelector("#cityCode_div > input");

    public CityEditPage(WebDriver driver) {
        super(driver);
    }

    public void clickCityEdit() {
    //    driver.navigate().refresh();
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityEditLocated));
        click(CityEditLocated);
    }
    public void CityEditButton(){
        driver.navigate().refresh();
        click(CityEditLocated);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityEditButtonLocated));
        click(CityEditButtonLocated);
    }
    public void CityEditUpdate(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityEditUpdateLocator));
        click(CityEditUpdateLocator);

    }

    public void clickCityEditCancel(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityEditCancelLocator));
        click(CityEditCancelLocator);
    }
    public void CityDetails(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityDetailsLocated));
        click(CityDetailsLocated);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityDetailsCancel));
        click(CityDetailsCancel);

    }

    public void clickCityDeleteClose(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityEditLocated));
        click(CityEditLocated);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityDeleteLocated));
        click(CityDeleteLocated);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityDeleteButtonLocated));
        click(CityDeleteButtonLocated);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityDeleteCloseLocated));
        click(CityDeleteCloseLocated);

    }

    public void clickCityDeleteCancel(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityEditLocated));
        click(CityEditLocated);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityDeleteLocated));
        click(CityDeleteLocated);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityDeleteCancelLocated));
        click(CityDeleteCancelLocated);

    }

    public void clickCityDetails(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(CityEditLocated));
        click(CityEditLocated);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityDetailsLocated));
        click(CityDetailsLocated);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CityDetailsCancel));
        click(CityDetailsCancel);
    }
//    public void isedittrue(){
//       find(CityIsEditLocator).getText();
//
//
//    }


}
