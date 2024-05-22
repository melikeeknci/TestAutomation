import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddNewPage extends BasePage {

    By CountryNameLocator= new By.ByCssSelector("#countryName_div > input");
    By DescriptionLocator= new By.ByCssSelector("#description_div > textarea");
    By Alpha2CodeLocator= new By.ByCssSelector("#alpha2Code_div > input");
    By Alpha3CodeLocator= new By.ByCssSelector("#alpha3Code_div > input");
    By NumericCodeLocator= new By.ByCssSelector("#numericCode_div > input");
    By saveLocator = new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > button.btn.btn-success.save-event");
    By AddAnotherLocator = new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div > label");
    By cancelLocator= new By.ByCssSelector("#staticBackdrop > div > div.modal-body > form > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div > button.btn.btn-secondary.save-customer");

    public AddNewPage(WebDriver driver) {
        super(driver);
    }

    public void add_countryName(String text){

       type((By) CountryNameLocator, text);
        wait.until(ExpectedConditions.visibilityOfElementLocated(CountryNameLocator));
    }
    public void add_description(String text){
        type((By) DescriptionLocator, text);
        wait.until(ExpectedConditions.visibilityOfElementLocated(DescriptionLocator));
    }
    public void add_alpha2Code(String text){
        type((By) Alpha2CodeLocator, text);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Alpha2CodeLocator));
    }
    public void add_alpha3Code(String text){
        type((By) Alpha3CodeLocator, text);
        wait.until(ExpectedConditions.visibilityOfElementLocated(Alpha3CodeLocator));
    }
    public void add_numericCode(String text){
        type((By) NumericCodeLocator, text);
        wait.until(ExpectedConditions.visibilityOfElementLocated(NumericCodeLocator));
    }

    public void clickOnSaveButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(saveLocator));
        click(saveLocator);

    }
    public void clickOnAddAnotherButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddAnotherLocator));
        click(AddAnotherLocator);
    }
    public void clickOnCancelButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cancelLocator));
        click(cancelLocator);
    }

}
