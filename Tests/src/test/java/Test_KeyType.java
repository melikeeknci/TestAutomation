import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_KeyType extends BaseTest{
    DashboardPage dashboardPage;
    SearchBox searchBox;


    @Test
    @Order(1)
    public void Test_KeyType() throws InterruptedException {
        dashboardPage = new DashboardPage(driver);
        searchBox = new SearchBox(driver);
        try {
            driver.findElement(By.cssSelector("#layout-wrapper > div.main-content > div > div > div:nth-child(1) > div > div > div > nav > ol > b"));
            driver.navigate().refresh();
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException");
        }

        Thread.sleep(2000);
        dashboardPage.searchBox().searcKeyType("Key Type");
        Thread.sleep(700);
    }

    @Test
    @Order(2)
    public void addNew() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();
        Thread.sleep(100);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> errorMessages = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("invalid-feedback")));

        String expectedErrorMessage = "This field is required";
        boolean allErrorsMatch = true;
        for (WebElement errorMessage : errorMessages) {
            String actualErrorMessage = errorMessage.getText().trim();
            System.out.println("Hata Mesajı: " + actualErrorMessage);
            Thread.sleep(1000);
            if (!expectedErrorMessage.equals(actualErrorMessage)) {
                allErrorsMatch = false;
                break;
            }
        }
        assertTrue(allErrorsMatch, "Tüm hata mesajları beklenenle eşleşmiyor.");

        //name
        WebElement description = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div/div[2]/div/textarea"));
        WebElement name = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div/div[1]/div/input"));
        name.sendKeys("    ");
        description.click();
        WebElement fieldErrorMessage = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div/div[1]/div/div"));
        String errorMessage = fieldErrorMessage.getText().trim();
        System.out.println("Name: " + errorMessage);
        name.sendKeys(Keys.CONTROL + "a");
        name.sendKeys(Keys.DELETE);

        name.sendKeys("ascascsacascacaascascsacascacaascascsacascacaascazx");
        description.click();
        WebElement fieldErrorMessage1 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div/div[1]/div/div"));
        String errorMessage1 = fieldErrorMessage1.getText().trim();
        System.out.println("Name: " + errorMessage1);
        name.sendKeys(Keys.CONTROL + "a");
        name.sendKeys(Keys.DELETE);
        name.sendKeys("deneme");

        //description
        description.sendKeys("ascascsacascacaascascsacascacaascascsacascacaascazxascascsacascacaascascsacascacaascascsacascacaascazxascascsacascacaascascsacascacaascascsacascacaascazxascascsacascacaascascsacascacaascascsacascacaascazxascascsacascacaascascsacascacaascascsacascacaascazxascascsacascacaascascsacascacaascascsacascacaascazxascascsacascacaascascsacascacaascascsacascacaascazxascascsacascacaascascsacascacaascascsacascacaascazxascascsacascacaascascsacascacaascascsacascacaascazx");
        name.click();
        WebElement fieldErrorMessage2 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div/div[2]/div/div"));
        String errorMessage2 = fieldErrorMessage2.getText().trim();
        System.out.println("Name: " + errorMessage2);
        description.sendKeys(Keys.CONTROL + "a");
        description.sendKeys(Keys.DELETE);
        description.sendKeys("deneme");
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[2]")).click();
    }

    @Test
    @Order(3)
    public void addNew_Uniq() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div/div[2]/div/textarea")).sendKeys("deneme");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div/div[1]/div/input")).sendKeys("deneme");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div/div[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[3]/div/div/button[2]")).click();
    }

    @Test
    @Order(4)
    public void delete() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[7]/div/div/div/a/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[7]/div/div[1]/div/div/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div/div[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[3]/div/div/button[2]")).click();
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scroll(0, 250);");
        Thread.sleep(1000);
        WebElement page = driver.findElement(By.xpath("//*[@id=\"ag-27\"]/span[2]/div[3]"));
        page.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[6]/div/div/div/a/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[6]/div/div[1]/div/div/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]")).click();

        Thread.sleep(1000);
        driver.navigate().refresh();

    }

    @Test
    @Order(5)
    public void details() throws InterruptedException {
        Thread.sleep(1000);
        WebElement editButton = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/a"));
        editButton.click();
        WebElement details = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/a[2]"));
        details.click();
        Thread.sleep(1000);

        WebElement detailsCancel = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[2]/div[2]/div/button"));
        detailsCancel.click();
        editButton.click();

        Thread.sleep(700);

        WebElement editMenu1 = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div"));
        String actualMenu = editMenu1.getText().trim();
        System.out.println(actualMenu);
        Thread.sleep(1000);
        WebElement edit = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/a[1]"));

        edit.click();
        Thread.sleep(1000);

        List<WebElement> inputElements = driver.findElements(By.xpath("//input[@value]"));

        for (WebElement element : inputElements) {
            String value = element.getAttribute("value");
            System.out.println(value);
        }
        List<WebElement> textareaElements = driver.findElements(By.xpath("//textarea"));

        for (WebElement element : textareaElements) {
            String value = element.getText();
            if (value == null || value.isEmpty()) {
                value = element.getText();
            }
            System.out.println(value);
        }

        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div/div[1]/div/input")).sendKeys("sdc");
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();

        Thread.sleep(1000);

    }
    @Test
    @Order(6)
    public void search_Button() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/span/span")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[1]/div/div[4]/div/div[2]/div[2]/div/div/div[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[2]/button[1]")).click();
        Thread.sleep(1000);//
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/span/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[2]/button[2]")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/span/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[1]/span[2]/span")).click();
        String[] expected = {"Pin Column", "Autosize This Column", "Autosize All Columns", "Group by Name", "Reset Columns"};
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div"));//
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

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/div[2]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[7]/div/div/div[3]/span[2]")).click();


    }
    @Test
    @Order(7)
    public void Columns() throws InterruptedException {


        WebElement columns = driver.findElement(By.id("ag-9-button"));
        columns.click();
        Thread.sleep(1000);
        WebElement columnsButton = driver.findElement(By.id("ag-15-input"));
        columnsButton.click();
        Thread.sleep(1000);
        WebElement search = driver.findElement(By.id("ag-16-input"));
        search.sendKeys("description");
        Thread.sleep(700);
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div[2]"));
        searchButton.click();
        Thread.sleep(1500);
        search.sendKeys(Keys.CONTROL + "a");
        search.sendKeys(Keys.DELETE);
        Thread.sleep(1000);
        columnsButton.click();


        WebElement name = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/span[1]"));
        WebElement updateDate = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[4]/div/span[1]"));



        WebElement drop = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[2]/div[2]"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(name, drop).perform();
        Thread.sleep(1000);

        actions.dragAndDrop(updateDate, drop).perform();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[1]/div[1]/span/span[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[11]/div[1]/span/span[2]/span")).click();

        driver.navigate().refresh();
        Thread.sleep(2000);


    }
    @Test
    @Order(8)
    public void edit_isCorrect() throws InterruptedException {
        Thread.sleep(1500);


            WebElement deneme = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[1]"));
            String denemeYazilari = deneme.getText().trim();
            System.out.println(denemeYazilari);
            Thread.sleep(3000);
        }
 }











































































