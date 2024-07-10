import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Test_Mcc extends BaseTest
{

    DashboardPage dashboardPage;
    SearchBox searchBox;


    @Test
    @Order(1)
    public void Test_ClientHsmLmk() throws InterruptedException {
        dashboardPage = new DashboardPage(driver);
        searchBox = new SearchBox(driver);
        try {
            driver.findElement(By.cssSelector("#layout-wrapper > div.main-content > div > div > div:nth-child(1) > div > div > div > nav > ol > b"));
            driver.navigate().refresh();
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException");
        }

        Thread.sleep(2000);
        dashboardPage.searchBox().searchMcc ("Mcc");
        Thread.sleep(700);
    }
//    @Test
//    @Order(2)
//    public void delete() throws InterruptedException {
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/a/i")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/button[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]")).click();
//        Thread.sleep(1000);
//
//    }
//    @Test
//    @Order(3)
//    public void details() throws InterruptedException {
//        Thread.sleep(1000);
//        WebElement editButton = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[2]/div/a/i"));
//        editButton.click();
//        WebElement details = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[2]/div/div/a[2]"));
//        details.click();
//        Thread.sleep(1000);
//
//        WebElement detailsCancel = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[2]/div[2]/div/button"));
//        detailsCancel.click();
//        editButton.click();
//
//        Thread.sleep(700);
//
//        WebElement editMenu1 = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[2]/div/a/i"));
//        String actualMenu = editMenu1.getText().trim();
//        System.out.println(actualMenu);
//        Thread.sleep(1000);
//        WebElement edit = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[2]/div/div/a[1]"));
//        edit.click();
//        Thread.sleep(1000);
//
//        List<WebElement> inputElements = driver.findElements(By.xpath("//input[@value]"));
//
//        for (WebElement element : inputElements) {
//            String value = element.getAttribute("value");
//            System.out.println(value);
//        }
//        List<WebElement> textareaElements = driver.findElements(By.xpath("//textarea"));
//
//        for (WebElement element : textareaElements) {
//            String value = element.getText();
//            if (value == null || value.isEmpty()) {
//                value = element.getText();
//            }
//            System.out.println(value);
//        }
//
//        driver.findElement(By.xpath("//*[@id=\"description_div\"]/textarea")).sendKeys("  sdc");
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();
//
//        Thread.sleep(1000);
//
//    }
//    @Test
//    @Order(4)
//    public void search_Button() throws InterruptedException {
//
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/span/span")).click();
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[1]/div/div[4]/div/div[2]/div[2]/div/div/div[2]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[2]/button[1]")).click();
//        Thread.sleep(1000);//
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/span/span")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[2]/button[2]")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/span/span")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[1]/span[2]/span")).click();
//        String[] expected = {"Pin Column", "Autosize This Column", "Autosize All Columns", "Group by Hsm Dns Name", "Reset Columns"};
//        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div"));//
//        List<String> actual = new ArrayList<>();
//
//        for (WebElement element : elements) {
//            actual.add(element.getText().trim());
//        }
//
//        boolean isCorrect = true;
//        for (int i = 0; i < expected.length; i++) {
//            if (!expected[i].equals(actual.get(i))) {
//                isCorrect = false;
//                break;
//            }
//        }
//        if (isCorrect) {
//            for (String item : actual) {
//                System.out.println(item);
//            }
//        } else {
//            System.out.println("Menü öğeleri beklenenle eşleşmiyor.");
//        }
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/div[2]/span[2]")).click();
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[7]/div/div/div[3]/span[2]")).click();
//
//
//    }
    @Test
    @Order(5)
    public void Columns() throws InterruptedException {


        WebElement columns = driver.findElement(By.id("ag-9-button"));
        columns.click();
        Thread.sleep(1000);
        WebElement columnsButton = driver.findElement(By.id("ag-15-input"));
        columnsButton.click();
        columns.click();
//        Thread.sleep(1000);
//        WebElement search = driver.findElement(By.id("ag-16-input"));
//        search.sendKeys("mcc");
//        Thread.sleep(700);
//        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div[2]"));
//        searchButton.click();
//        Thread.sleep(1500);
//        search.sendKeys(Keys.CONTROL + "a");
//        search.sendKeys(Keys.DELETE);
//        Thread.sleep(1000);
//        columnsButton.click();
//
//
//        WebElement hsmDnsName = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/span[1]"));
//        WebElement port = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div/span[1]"));
//
//
//
//        WebElement drop = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[2]/div[2]"));
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(hsmDnsName, drop).perform();
//        Thread.sleep(1000);
//
//        actions.dragAndDrop(port, drop).perform();
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[1]/div[1]/span/span[2]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[11]/div[1]/span/span[2]/span")).click();
//
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//
//
    }
    @Test
    @Order(6)
    public void edit_isCorrect() throws InterruptedException {
        WebElement slider = driver.findElement(By.xpath("//*[@id='layout-wrapper']/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[6]"));
        int sliderMaxWidth = 900;
        int stepSize = 450;
        Actions actions = new Actions(driver);
        for (int i = 1; i < sliderMaxWidth; i += stepSize) {
            WebElement deneme = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[1]"));
            String denemeYazilari = deneme.getText().trim();
            System.out.println(denemeYazilari);
            actions.dragAndDropBy(slider, stepSize, 0).perform();
            Thread.sleep(3000);
        }

        Thread.sleep(1000);

    }
//    @Test
//    @Order(7)
//    public void export() throws InterruptedException {
//        Thread.sleep(700);
//        WebElement exportButton = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/button"));
//
//        exportButton.click();
//        Thread.sleep(1000);
//
//
//        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div"));
//        List<String> actualMenuItems = new ArrayList<>();
//
//        for (WebElement element : elements) {
//            actualMenuItems.add(element.getText().trim());
//            System.out.println(actualMenuItems);
//        }
//
//
//        Thread.sleep(700);
//
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/button[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/button")).click();
//
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/button[2]")).click();
//
//    }


























}
