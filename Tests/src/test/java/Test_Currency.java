import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Test_Currency extends BaseTest {

    DashboardPage dashboardpage;
    SearchBox searchBox;
    CurrencyPage currencyPage;
    CurrencyAddNewPage currencyAddNewPage;


    @Test
    @Order(1)
    public void Test_Currency() throws InterruptedException {
        dashboardpage = new DashboardPage(driver);

        Thread.sleep(700);
        try {
            driver.findElement(By.cssSelector("#layout-wrapper > div.main-content > div > div > div:nth-child(1) > div > div > div > nav > ol > b"));
            driver.navigate().refresh();
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException");
        }
    }

    @Test
    @Order(2)
    public void search() throws InterruptedException {
        Thread.sleep(700);
        searchBox = new SearchBox(driver);
        dashboardpage.searchBox().searchCurrency("currency");

    }

    @Test
    @Order(3)
    public void export() throws InterruptedException {
        Thread.sleep(500);
        currencyPage = new CurrencyPage(driver);
        currencyPage.currencyExport();
    }

    @Test
    @Order(4)
    public void AddNew() throws InterruptedException {
        currencyPage = new CurrencyPage(driver);
        currencyAddNewPage = new CurrencyAddNewPage(driver);
        Thread.sleep(1000);
        currencyPage.currencyAddNew();
        currencyAddNewPage.clickSave();
        Thread.sleep(1000);


        WebElement currency = driver.findElement(By.cssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(1) > div > div > input"));
        WebElement fieldErrorMessage = driver.findElement(By.cssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(4) > div > div > div"));
        String errorMesage = "This field is required";
        Assertions.assertEquals(fieldErrorMessage.getText(), errorMesage, "hata mesajı doğru değil");
        Thread.sleep(1000);
        currencyAddNewPage.currencyName("sdvsvsdvsdsdvsvsdvsdsdvsvsdvsdsdvsvsdvsdsdvsvsdvsdsdvsvsdvsdsdvsvsdvsdsdvsvsdvsdsdvsvsdvsdsdvsvsdvsdsdvsvsdvsd");
        WebElement click1 = driver.findElement(By.cssSelector("input[name='alphabeticCode']"));
        click1.click();
        WebElement errorMessage = driver.findElement(By.cssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(1) > div > div > div")); // Hata mesajının doğru seçici ile seçilmesi gerekiyor
        String acutalMessage = errorMessage.getText();
        String expectedErrorMessage = "100 maximum character limit exceeded";
        Assertions.assertEquals(expectedErrorMessage, acutalMessage, "Error message is incorrect");
        Thread.sleep(1000);
        currency.sendKeys(Keys.CONTROL + "a");
        currency.sendKeys(Keys.DELETE);
        currencyAddNewPage.currencyName("Turkish Lira");
        Thread.sleep(1000);


        WebElement alphabetic = driver.findElement(By.cssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(2) > div > div > input"));
        alphabetic.sendKeys("123");
        String letterErrorMessage = driver.findElement(By.cssSelector("html > body > div:nth-of-type(3) > div > div:nth-of-type(1) > div > div > div:nth-of-type(2) > form > fieldset > div:nth-of-type(2) > div > div > div")).getText();
        String errorMessagetext = "Can only be letters";
        Assertions.assertEquals(errorMessagetext, letterErrorMessage, "Error message is incorrect");
        Thread.sleep(1000);
        alphabetic.sendKeys(Keys.CONTROL + "a");
        alphabetic.sendKeys(Keys.DELETE);

        alphabetic.sendKeys("M");
        String min = driver.findElement(By.cssSelector("html > body > div:nth-of-type(3) > div > div:nth-of-type(1) > div > div > div:nth-of-type(2) > form > fieldset > div:nth-of-type(2) > div > div > div")).getText();
        String errorMessage2 = "This field must be 3 characters";
        Assertions.assertEquals(errorMessage2, min, "Error message is incorrect");
        Thread.sleep(1000);
        alphabetic.sendKeys(Keys.CONTROL + "a");
        alphabetic.sendKeys(Keys.DELETE);

        alphabetic.sendKeys("MELİKE");
        String max = driver.findElement(By.cssSelector("html > body > div:nth-of-type(3) > div > div:nth-of-type(1) > div > div > div:nth-of-type(2) > form > fieldset > div:nth-of-type(2) > div > div > div")).getText();
        String errorMessage3 = "3 maximum character limit exceeded";
        Assertions.assertEquals(errorMessage3, max, "Error message is incorrect");
        Thread.sleep(1000);
        alphabetic.sendKeys(Keys.CONTROL + "a");
        alphabetic.sendKeys(Keys.DELETE);
        alphabetic.sendKeys("ABC");


        WebElement numeric = driver.findElement(By.cssSelector("input[name='numericCode']"));
        numeric.sendKeys("M");
        String min1 = driver.findElement(By.cssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(3) > div > div > div")).getText();
        String errorMessage4 = "This field must be 3 characters";
        Assertions.assertEquals(errorMessage4, min1, "Error message is incorrect");
        Thread.sleep(1000);
        numeric.sendKeys(Keys.CONTROL + "a");
        numeric.sendKeys(Keys.DELETE);

        numeric.sendKeys("MELİKE");
        String max1 = driver.findElement(By.cssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(3) > div > div > div")).getText();
        String errorMessage5 = "3 maximum character limit exceeded";
        Assertions.assertEquals(errorMessage5, max1, "Error message is incorrect");
        Thread.sleep(1000);
        numeric.sendKeys(Keys.CONTROL + "a");
        numeric.sendKeys(Keys.DELETE);

        numeric.sendKeys("mel");
        String number = driver.findElement(By.cssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(3) > div > div > div")).getText();
        String errorMessage6 = "Can only be numbers";
        Assertions.assertEquals(errorMessage6, number, "Error message is incorrect");
        Thread.sleep(1000);
        numeric.sendKeys(Keys.CONTROL + "a");
        numeric.sendKeys(Keys.DELETE);
        numeric.sendKeys("444");


        WebElement exponent = driver.findElement(By.cssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(4) > div > div > input"));
        exponent.sendKeys("f");
        String num = driver.findElement(By.cssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(4) > div > div > div")).getText();
        String error5 = "Can only be numbers";
        Assertions.assertEquals(error5, num, "Error message is incorrect");
        Thread.sleep(1000);
        exponent.sendKeys(Keys.CONTROL + "a");
        exponent.sendKeys(Keys.DELETE);

        exponent.sendKeys("gg");
        String num1 = driver.findElement(By.cssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(4) > div > div > div")).getText();
        String error6 = "1 maximum character limit exceeded";
        Assertions.assertEquals(error6, num1, "Error message is incorrect");
        Thread.sleep(1000);
        exponent.sendKeys(Keys.CONTROL + "a");
        exponent.sendKeys(Keys.DELETE);
        exponent.sendKeys("4");
        Thread.sleep(1000);

        currencyAddNewPage.clickSave();
        Thread.sleep(1000);

        currencyPage.currencyAddNew();
        currencyAddNewPage.currencyName("Turkish Lira");
        WebElement alphabetic1 = driver.findElement(By.cssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(2) > div > div > input"));
        alphabetic1.sendKeys("ABC");
        WebElement numeric1 = driver.findElement(By.cssSelector("input[name='numericCode']"));
        numeric1.sendKeys("444");
        WebElement exponent1 = driver.findElement(By.cssSelector("#staticBackdrop > div > div.modal-body > form > fieldset > div:nth-child(4) > div > div > input"));
        exponent1.sendKeys("4");
        currencyAddNewPage.clickSave();
        Thread.sleep(1000);
        WebElement details= driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div/div[2]/a"));
        details.click();
        Thread.sleep(1500);
        WebElement oldRecord = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[3]/div/div/button[2]"));
        oldRecord.click();
        currencyPage.currencyAddNew();
        Thread.sleep(1000);
        currencyAddNewPage.clickcancel();

    }

    @Test
    @Order(5)
    public void edit_isCorrect() throws InterruptedException{
        currencyPage = new CurrencyPage(driver);
        Thread.sleep(1000);
        WebElement editb= driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[2]/div/div[1]/div/a/i"));
        editb.click();
        String[] expectedMenu = {"Edit", "Delete", "Details"};
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='dropdown-menu-start dropdown-menu show']//a[@class='dropdown-item' and not(contains(@style, 'display: none'))] | //div[@class='dropdown-menu-start dropdown-menu show']//button[@class='dropdown-item' and not(contains(@style, 'display: none'))]\n"));
        List<String> actualMenuItems = new ArrayList<>();

        for (WebElement element : elements) {
            actualMenuItems.add(element.getText().trim());
        }

        boolean isCorrect = true;
        for (int i = 0; i < expectedMenu.length; i++) {
            if (!expectedMenu[i].equals(actualMenuItems.get(i))) {
                isCorrect = false;
                break;
            }
        }

        if (isCorrect) {
            for (String item : actualMenuItems) {
                System.out.println(item);
            }
        } else {
            System.out.println("Menü öğeleri beklenenle eşleşmiyor.");
        }
        Thread.sleep(1000);
        WebElement edita= driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[2]/div/div[1]/div/a/i"));
        edita.click();
        Thread.sleep(1000);
    }

    @Test
    @Order(7)
    public void edit() throws InterruptedException {
        currencyPage = new CurrencyPage(driver);
        Thread.sleep(1000);
        currencyPage.editCancel();
        Thread.sleep(1000);
        currencyPage.edit();
        String[] expected = {"Algerian Dinar", "DZD", "012", "2"};
        List<WebElement> elements = driver.findElements(By.xpath("//fieldset//input"));
        List<String> actual = new ArrayList<>();
        for (WebElement element : elements) {
            actual.add(element.getAttribute("value").trim());
        }
        boolean isCorrect = true;
        for (int i = 0; i < expected.length; i++) {
            if (!expected[i].equals(actual.get(i))) {
                isCorrect = false;
                break;
            }
        }
        if (isCorrect) {
            for (String item : actual) {
                System.out.println(item);
            }
        } else {
            System.out.println("Menü öğeleri beklenenle eşleşmiyor.");
        }
        Thread.sleep(1000);
        currencyPage.editUpdate();
    }

    @Test
    @Order(6)
    public void delete() throws InterruptedException {
        currencyPage = new CurrencyPage(driver);
        WebElement edit = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[2]/div/div[1]/div/a/i"));
        edit.click();
        Thread.sleep(1000);
        WebElement delete = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[2]/div/div[1]/div/div/button[1]/i"));
        delete.click();
        Thread.sleep(1000);
        WebElement deletebutton = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]"));
        deletebutton.click();
        Thread.sleep(1000);
        WebElement deleteDetails= driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div/div[2]/a"));
        deleteDetails.click();
        Thread.sleep(1000);
        WebElement deleteclose = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[3]/div/div/button[2]"));
        deleteclose.click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        WebElement page = driver.findElement(By.xpath("//*[@id=\"ag-27\"]/span[2]/div[4]/span"));
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();", page);
        Thread.sleep(3000);
        page.click();
        Thread.sleep(1000);

        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(3000);
        WebElement edit1 = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[2]/div/div/div/a/i"));
        edit1.click();
        Thread.sleep(3000);
        WebElement delete1 = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[2]/div/div[1]/div/div/button[1]"));
        delete1.click();
        Thread.sleep(1000);
        WebElement deletebutton1 = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]"));
        deletebutton1.click();
        Thread.sleep(3000);
        WebElement page1 = driver.findElement(By.xpath("//*[@id=\"ag-27\"]/span[2]/div[1]/span"));
        js.executeScript("arguments[0].scrollIntoView();", page1);
        Thread.sleep(3000);
        page1.click();
        js.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(3000);







    }
    @Test
    @Order(8)
    public void details() throws InterruptedException {
        currencyPage = new CurrencyPage(driver);
        Thread.sleep(1000);

        WebElement sleep= driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div/div/a/i"));
        sleep.click();
        WebElement sleep1= driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/a[2]/i"));
        sleep1.click();
        Thread.sleep(1000);
        WebElement sleep2= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[2]/div[2]/div/button"));
        sleep2.click();



    }

    @Test
    @Order(9)
    public void search_Button()  throws InterruptedException{

        currencyPage = new CurrencyPage(driver);
        Thread.sleep(1000);
        currencyPage.currencyClickSearch();
        Thread.sleep(1000);
        currencyPage.currencyLine();
        Thread.sleep(1000);
        String[] expected = {"Pin Column", "Autosize This Column", "Autosize All Columns", "Group by Currency Name", "Reset Columns"};
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ag-menu-option']//span[@class='ag-menu-option-part ag-menu-option-text']"));
        List<String> actual = new ArrayList<>();

        for (WebElement element : elements) {
            actual.add(element.getText().trim());
        }

        boolean isCorrect = true;
        for (int i = 0; i < expected.length; i++) {
            if (!expected[i].equals(actual.get(i))) {
                isCorrect = false;
                break;
            }
        }
        if (isCorrect) {
            for (String item : actual) {
                System.out.println(item);
            }
        } else {
            System.out.println("Menü öğeleri beklenenle eşleşmiyor.");
        }
        Thread.sleep(1000);

        currencyPage.currencyPanel();
        Thread.sleep(1000);
        currencyPage.selectAll();
        Thread.sleep(1000);
        currencyPage.reset();
        Thread.sleep(1000);
        currencyPage.currencyClickSearch();
        Thread.sleep(1000);
        currencyPage.currencyClickButton();
        Thread.sleep(1000);
        currencyPage.apply();
        Thread.sleep(1000);
//        currencyPage.currencyClickSearch();
//        Thread.sleep(1000);
//        currencyPage.currencySearch("deneme");
//      Thread.sleep(500);
//      currencyPage.apply();
    }
    @Test
    @Order(10)
    public void Columns () throws InterruptedException {
        currencyPage = new CurrencyPage(driver);
        Thread.sleep(1000);
        WebElement columns = driver.findElement(By.xpath("//*[@id=\"ag-9-button\"]/div/span"));
        columns.click();
        Thread.sleep(1000);

        String[] expectedMenu = {"","Currency Name", "Alphabetic Code", "Numeric Code", "Currency Exponent", "Update Date"};
        List<WebElement> elements = driver.findElements(By.xpath("//div[@role='treeitem']/div/span[@class='ag-column-select-column-label']"));

        List<String> actualMenuItems = new ArrayList<>();

        for (WebElement element : elements) {
            actualMenuItems.add(element.getText().trim());
        }


        boolean isCorrect = true;
        for (int i = 0; i < expectedMenu.length; i++) {
            if (!expectedMenu[i].equals(actualMenuItems.get(i))) {
                isCorrect = false;
                break;
            }
        }


        if (isCorrect) {
            for (String item : actualMenuItems) {
                System.out.println(item);
            }
        } else {
            System.out.println("Menü öğeleri beklenenle eşleşmiyor.");
        }
        Thread.sleep(1000);
        WebElement columnsSearch = driver.findElement(By.id("ag-16-input"));
        columnsSearch.sendKeys("currency Name");
        Thread.sleep(1000);
        WebElement columnsButton = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div/div/span[2]"));
        columnsButton.click();
    }
    @Test
    @Order(11)
    public void Columns_drop() throws InterruptedException {
        WebElement delete = driver.findElement(By.id("ag-16-input"));
        delete.sendKeys(Keys.CONTROL + "a");
        delete.sendKeys(Keys.DELETE);
        Thread.sleep(3000);

        WebElement slide = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/span[1]"));
        WebElement drop = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[2]/div[2]/span"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(slide, drop).perform();


        WebElement down = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[1]/div[1]/span/span[2]/span"));
        down.click();




    }



}




























