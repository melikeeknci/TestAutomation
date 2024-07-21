import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_ClientBin extends BaseTest {
    DashboardPage dashboardPage;
    SearchBox searchBox;


    @Test
    @Order(1)
    public void Test_ClientBin() throws InterruptedException {
        dashboardPage = new DashboardPage(driver);
        searchBox = new SearchBox(driver);
        try {
            driver.findElement(By.cssSelector("#layout-wrapper > div.main-content > div > div > div:nth-child(1) > div > div > div > nav > ol > b"));
            driver.navigate().refresh();
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException");
        }

        Thread.sleep(2000);
        dashboardPage.searchBox().searchClientBin("Client Bin");
        Thread.sleep(700);
    }

//
//    @Test
//    @Order(2)
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
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/button[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/button")).click();
//
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/button[2]")).click();
//
//    }
//
//    @Test
//    @Order(3)
//    public void mustAddNewAnduniqAddNew() throws InterruptedException {
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/button")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[7]/div/div/div/div[1]/div[2]/div/button")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();
//        Thread.sleep(100);
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        List<WebElement> errorMessages = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("invalid-feedback")));
//
//        String expectedErrorMessage = "This field is required";
//        boolean allErrorsMatch = true;
//        for (WebElement errorMessage : errorMessages) {
//            String actualErrorMessage = errorMessage.getText().trim();
//            System.out.println("Hata Mesajı: " + actualErrorMessage);
//            Thread.sleep(1000);
//            if (!expectedErrorMessage.equals(actualErrorMessage)) {
//                allErrorsMatch = false;
//                break;
//            }
//        }
//        assertTrue(allErrorsMatch, "Tüm hata mesajları beklenenle eşleşmiyor.");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[1]/div/input")).sendKeys("96666666");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/input")).sendKeys("97666666");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[1]/div/input")).sendKeys("16");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"cardTypeGuid\"]/div/div/div[1]/div[2]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("react-select-2-option-1")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"cardBrandGuid\"]/div/div[1]/div[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.id("react-select-3-option-1")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[1]/input")).sendKeys("11062001");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/input")).sendKeys("11062028");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[1]/div/label/input")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();
//        Thread.sleep(1000);
//
//        //check is uniq
//        WebElement panLenght = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[1]/div/input"));
//        panLenght.sendKeys(Keys.CONTROL + "a");
//        panLenght.sendKeys(Keys.DELETE);
//        panLenght.sendKeys("16");
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/div/div/div[1]/div/div[2]/a")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div/div/div/div[3]/div/div/button[2]")).click();
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[2]")).click();
//
//    }

    @Test
    @Order(4)
    public void addNew() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/button")).click();

//low bin
        WebElement highBin = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/input"));
        WebElement lowbin = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[1]/div/input"));
//      lowbin.sendKeys("dcdsdsds");
//      Thread.sleep(1000);
//      highBin.click();
//      WebElement fieldErrorMessage = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[1]/div/div"));
//      String errorMessage = fieldErrorMessage.getText().trim();
//      System.out.println("Low Bin: " + errorMessage);
//      Thread.sleep(1000);
//      lowbin.sendKeys(Keys.CONTROL + "a");
//      lowbin.sendKeys(Keys.DELETE);
//      Thread.sleep(1000);
//      lowbin.sendKeys("        ");
//      highBin.click();
//      WebElement fieldErrorMessage1 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[1]/div/div"));
//      String errorMessage1 = fieldErrorMessage1.getText().trim();
//      System.out.println("Low Bin: " + errorMessage1);
//      Thread.sleep(1000);
//      lowbin.sendKeys(Keys.CONTROL + "a");
//      lowbin.sendKeys(Keys.DELETE);
//      lowbin.sendKeys("123456789");
//      highBin.click();
//      WebElement fieldErrorMessage2 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[1]/div/div"));
//      String errorMessage2 = fieldErrorMessage2.getText().trim();
//      System.out.println("Low Bin: " + errorMessage2);
//      Thread.sleep(1000);
//      lowbin.sendKeys(Keys.CONTROL + "a");
//      lowbin.sendKeys(Keys.DELETE);
//      lowbin.sendKeys("1234567");
//      Thread.sleep(1000);
//      lowbin.sendKeys("1234567");
//      highBin.click();
//      WebElement fieldErrorMessage3 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[1]/div/div"));
//      String errorMessage3 = fieldErrorMessage3.getText().trim();
//      System.out.println("Low Bin: " + errorMessage3);
//      Thread.sleep(1000);
//      lowbin.sendKeys(Keys.CONTROL + "a");
//      lowbin.sendKeys(Keys.DELETE);
        lowbin.sendKeys("57057057");

//highBin
//      highBin.sendKeys("sdsdsdsd");
//      lowbin.click();
//      WebElement fieldErrorMessage4 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/div"));
//      String errorMessage4 = fieldErrorMessage4.getText().trim();
//      System.out.println("High Bin: " + errorMessage4);
//      Thread.sleep(1000);
//      highBin.sendKeys(Keys.CONTROL + "a");
//      highBin.sendKeys(Keys.DELETE);
//      highBin.sendKeys("        ");
//      lowbin.click();
//      WebElement fieldErrorMessage5 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/div"));
//      String errorMessage5 = fieldErrorMessage5.getText().trim();
//      System.out.println("High Bin: " + errorMessage5);
//      Thread.sleep(1000);
//      highBin.sendKeys(Keys.CONTROL + "a");
//      highBin.sendKeys(Keys.DELETE);
//      highBin.sendKeys("1234567");
//      lowbin.click();
//      WebElement fieldErrorMessage6 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/div"));
//      String errorMessage6 = fieldErrorMessage6.getText().trim();
//      System.out.println("High Bin: " + errorMessage6);
//      Thread.sleep(1000);
//      highBin.sendKeys(Keys.CONTROL + "a");
//      highBin.sendKeys(Keys.DELETE);
//      highBin.sendKeys("123456789");
//      lowbin.click();
//      WebElement fieldErrorMessage7 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/div"));
//      String errorMessage7 = fieldErrorMessage7.getText().trim();
//      System.out.println("High Bin: " + errorMessage7);
//      Thread.sleep(1000);
//      highBin.sendKeys(Keys.CONTROL + "a");
//      highBin.sendKeys(Keys.DELETE);
//      highBin.sendKeys("12345678");
//      lowbin.click();
//      WebElement fieldErrorMessage8 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/div"));
//      String errorMessage8 = fieldErrorMessage8.getText().trim();
//      System.out.println("High Bin: " + errorMessage8);
//      Thread.sleep(1000);
//      highBin.sendKeys(Keys.CONTROL + "a");
//      highBin.sendKeys(Keys.DELETE);
//      highBin.sendKeys("58057056");
//      lowbin.click();
//      WebElement fieldErrorMessage9 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/div"));
//      String errorMessage9 = fieldErrorMessage9.getText().trim();
//      System.out.println("High Bin: " + errorMessage9);
//      Thread.sleep(1000);
//      highBin.sendKeys(Keys.CONTROL + "a");
//      highBin.sendKeys(Keys.DELETE);
        highBin.sendKeys("58057058");

        //description

        WebElement description = driver.findElement(By.xpath("//*[@id=\"description_div\"]/textarea"));
//      description.sendKeys("58057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056580570565805705658057056");
//      lowbin.click();
//      WebElement fieldErrorMessage11 = driver.findElement(By.xpath("//*[@id=\"description_div\"]/div"));
//      String errorMessage11 = fieldErrorMessage11.getText().trim();
//      System.out.println("Description: " + errorMessage11);
//      Thread.sleep(1000);
//      description.sendKeys(Keys.CONTROL + "a");
//      description.sendKeys(Keys.DELETE);
        description.sendKeys("deneme");

/// panLenght
        WebElement panLenght = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[1]/div/input"));
//      panLenght.sendKeys("fdvdf");
//      panLenght.sendKeys("1");
//      lowbin.click();
//      WebElement fieldErrorMessage12 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[1]/div/div"));
//      String errorMessage12 = fieldErrorMessage12.getText().trim();
//      System.out.println("Pan Lenght: " + errorMessage12);
//      Thread.sleep(1000);
//      panLenght.sendKeys(Keys.CONTROL + "a");
//      panLenght.sendKeys(Keys.DELETE);
//      panLenght.sendKeys("20");
//      lowbin.click();
//      WebElement fieldErrorMessage13 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[1]/div/div"));
//      String errorMessage13 = fieldErrorMessage13.getText().trim();
//      System.out.println("Pan Lenght: " + errorMessage13);
//      Thread.sleep(1000);
//      panLenght.sendKeys(Keys.CONTROL + "a");
//      panLenght.sendKeys(Keys.DELETE);
        panLenght.sendKeys("16");


//card type
        Thread.sleep(1000);
        WebElement cardType = driver.findElement(By.xpath("//*[@id=\"cardTypeGuid\"]/div/div/div[2]/div"));
        cardType.click();
//      Thread.sleep(1000);
//      WebElement carddata= driver.findElement(By.xpath("//*[@id=\"react-select-2-listbox\"]/div"));
//      String expectedcardType = carddata.getText();
//      System.out.println(expectedcardType);
//      Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]")).sendKeys("a");
        driver.findElement(By.id("react-select-2-option-1")).click();


//card brand

        WebElement cardBrand = driver.findElement(By.xpath("//*[@id=\"cardBrandGuid\"]/div/div/div[2]/div"));
        cardBrand.click();
//      Thread.sleep(1000);
//      WebElement cardBrandData= driver.findElement(By.xpath("//*[@id=\"react-select-3-listbox\"]/div"));
//      String expectedcardBrand = cardBrandData.getText();
//      System.out.println(expectedcardBrand);
//      Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]")).sendKeys("mc");
        driver.findElement(By.id("react-select-3-option-1")).click();

        // calidity start date and end date
//      driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[1]/input")).sendKeys("dfdfs");
//      driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/input")).sendKeys("dfdfs");
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[1]/input")).sendKeys("11062001");
//      Thread.sleep(1000);
//      driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/input")).sendKeys("11062000");
//      Thread.sleep(1000);
//
//      WebElement fieldErrorMessage14 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[1]/div"));
//      String errorMessage14 = fieldErrorMessage14.getText().trim();
//      System.out.println("validity start date: " + errorMessage14);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/input")).sendKeys("11062020");


//active acs notify
//      driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[4]/div[1]/div/label")).click();
//      Thread.sleep(1000);
//      driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[4]/div[2]/div/label")).click();


//export
//      Thread.sleep(700);
//        WebElement exportButton = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[7]/div/div/div/div[1]/div[2]/div/div[1]/button"));
//        exportButton.click();
//        Thread.sleep(1000);
//
//        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[7]/div/div/div/div[1]/div[2]/div/div[1]/div"));
//        List<String> actualMenuItems = new ArrayList<>();
//
//        for (WebElement element : elements) {
//            actualMenuItems.add(element.getText().trim());
//            System.out.println(actualMenuItems);
//        }
//
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[7]/div/div/div/div[1]/div[2]/div/div[1]/div/button[1]")).click();
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[7]/div/div/div/div[1]/div[2]/div/div[1]/button")).click();
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[7]/div/div/div/div[1]/div[2]/div/div[1]/div/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[7]/div/div/div/div[1]/div[2]/div/button")).click();

        WebElement lowBinRange = driver.findElement(By.cssSelector(".form-control[name='lowBinRange']"));
        lowBinRange.click();
        Thread.sleep(1000);
        WebElement highBinRange = driver.findElement(By.cssSelector(".form-control[name='highBinRange']"));
        highBinRange.click();
        Thread.sleep(1000);
        WebElement fieldErrorMessage15 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div/div/div"));
        String errorMessage15 = fieldErrorMessage15.getText().trim();
        System.out.println("Low Bin Range: "+errorMessage15);
        Thread.sleep(1000);
        lowBinRange.sendKeys("ghngngfff");
        highBinRange.click();
        Thread.sleep(1000);
        WebElement fieldErrorMessage16 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div/div/div"));
        String errorMessage16 = fieldErrorMessage16.getText().trim();
        System.out.println("Low Bin Range: "+errorMessage16);
        Thread.sleep(1000);
        lowBinRange.sendKeys(Keys.CONTROL+"a");
        lowBinRange.sendKeys(Keys.DELETE);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='modal-header']/h4[text()='New Client Bin Range']/following-sibling::button[@type='button' and @class='close' and @aria-label='Close']")).click();
        panLenght.sendKeys(Keys.CONTROL+"a");
        panLenght.sendKeys(Keys.DELETE);
        Thread.sleep(1000);


        for (int panlength = 13; panlength < 20; panlength++) {
            WebElement panLenghtInput = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[1]/div/input"));
            panLenghtInput.sendKeys(String.valueOf(panlength));
            driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[7]/div/div/div/div[1]/div[2]/div/button")).click();
            WebElement lowBinRangeInput = driver.findElement(By.cssSelector(".form-control[name='lowBinRange']"));
            int expectedLowBinRangeLength = panlength - 6;  // Panlength değerine göre beklenen low bin range uzunluğu
            String lowBinRangeValue = generateLowBinRangeValue(expectedLowBinRangeLength);  // Beklenen low bin range değerini oluştur
            WebElement highBinRangeInput = driver.findElement(By.cssSelector(".form-control[name='highBinRange']"));
            int expectedHighBinRangeLength = panlength - 6;  // Panlength değerine göre beklenen low bin range uzunluğu
            String highBinRangeValue = generateLowBinRangeValue(expectedHighBinRangeLength);

            if (expectedLowBinRangeLength == lowBinRangeValue.length()) {
                lowBinRangeInput.sendKeys(lowBinRangeValue);
                Thread.sleep(1000);
                driver.findElement(By.cssSelector(".form-control[name='highBinRange']")).click();
                Thread.sleep(1000);
                WebElement fieldErrorMessage17 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div/div/div"));
                String errorMessage17 = fieldErrorMessage17.getText().trim();
                System.out.println("low bin range: " + errorMessage17);
                highBinRangeInput.sendKeys(highBinRangeValue);
                lowBinRangeInput.click();
                Thread.sleep(1000);
                WebElement fieldErrorMessage18 = driver.findElement(By.xpath("//div[@class='mb-3'][.//label[text()='High Bin Range']]//div[@class='invalid-feedback']"));
                String errorMessage18 = fieldErrorMessage18.getText().trim();
                System.out.println("high bin range: " + errorMessage18);
                Thread.sleep(1000);

            } else {
                System.out.println("Panlength: " + panlength + " - Hata: Beklenen low bin range uzunluğu (" + expectedLowBinRangeLength + ") ve girilen değer uzunluğu (" + lowBinRangeValue.length() + ") uyuşmuyor.");
            }

            // İkinci pop-up'ı kapatın (örnek olarak 'Close' butonuna tıklama)
            driver.findElement(By.xpath("//div[@class='modal-header']/h4[text()='New Client Bin Range']/following-sibling::button[@type='button' and @class='close' and @aria-label='Close']")).click();
            panLenghtInput.sendKeys(Keys.CONTROL + "a");
            panLenghtInput.sendKeys(Keys.DELETE);




        }
        panLenght.sendKeys("13");
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[7]/div/div/div/div[1]/div[2]/div/button")).click();
        driver.findElement(By.cssSelector(".form-control[name='lowBinRange']")).sendKeys("123456");
        driver.findElement(By.cssSelector(".form-control[name='highBinRange']")).click();

        Thread.sleep(1000);
        WebElement fieldErrorMessage17 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div/div/div"));
        String errorMessage17 = fieldErrorMessage17.getText().trim();
        System.out.println("low bin range: " + errorMessage17);
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".form-control[name='highBinRange']")).click();
        driver.findElement(By.cssSelector(".form-control[name='lowBinRange']")).click();
        driver.findElement(By.cssSelector(".form-control[name='highBinRange']")).sendKeys("dccdd");
        Thread.sleep(1000);
        WebElement fieldErrorMessage18 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div/div/div"));
        String errorMessage18 = fieldErrorMessage18.getText().trim();
        System.out.println("low bin range: " + errorMessage18);



    }


    // Beklenen uzunluğa sahip bir low bin range değeri oluşturur
    private static String generateLowBinRangeValue(int length) {
        StringBuilder sb = new StringBuilder();

        // İlk iki haneyi 57 olarak ayarla
        sb.append("57");

        // Kalan haneleri 0-9 arasında rakamlarla doldur
        for (int i = 2; i < length; i++) {
            sb.append(i % 10);
        }

        return sb.toString();
    }


//new client Bin Range addNew





//    @Test()
//    @Order(5)
//    public void edit() throws InterruptedException {
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div/div/a/i")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/a[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"description_div\"]/textarea")).sendKeys("dvcd");
//        Thread.sleep(1000);
////        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[7]/div/div/div/div[1]/div[2]/div/button")).click();
////        Thread.sleep(1000);
////        driver.findElement(By.cssSelector("[name='lowBinRange']")).sendKeys("001100000");
////        Thread.sleep(1000);
////        driver.findElement(By.cssSelector("[name='highBinRange']")).sendKeys("002222222");
////        Thread.sleep(1000);
////        driver.findElement(By.xpath("//*[@id=\"rangeGenerationType\"]/div/div/div[1]/div[2]")).click();
////        Thread.sleep(1000);
////        driver.findElement(By.id("react-select-4-option-1")).click();
////        Thread.sleep(1000);
////        driver.findElement(By.xpath("//div/button[contains(text() , 'Save')]")).click();
////        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div/div/a/i")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[2]/div/div/a[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[2]")).click();
//        Thread.sleep(2000);
//
//
////*[@id="staticBackdrop"]/div/div[2]/form/div/div[1]/div[2]/div/button[1]
//
//    }


//    @Test
//    @Order(6)
//    public void delete() throws InterruptedException {
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div/div/a/i")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/button[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]")).click();
//        Thread.sleep(1000);
//
//        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div/div[2]/a")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[3]/div/div/button[2]")).click();
//        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("scroll(0, 250)");
//        Thread.sleep(1000);
//        WebElement page = driver.findElement(By.xpath("//*[@id=\"ag-27\"]/span[2]/div[3]"));
//        page.click();
//        js.executeScript("scroll(0, 0)");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/a/i")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/button[1]")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]")).click();
//
//        Thread.sleep(1000);
//        js.executeScript("scroll(0, 250)");
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("//*[@id=\"ag-27\"]/span[2]/div[1]/span")).click();
//
//    }

//    @Test
//    @Order(7)
//    public void details() throws InterruptedException {
//        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("scroll(0, 0)");
//        Thread.sleep(1000);
//        WebElement editButton = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div/div/a/i"));
//        editButton.click();
//        WebElement details = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/a[2]"));
//        details.click();
//        Thread.sleep(1000);
//
//        WebElement detailsCancel = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[2]/div[2]/div/button"));
//        detailsCancel.click();
//        editButton.click();
//
//        Thread.sleep(700);
//
//        WebElement editMenu1 = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div"));
//        String actualMenu = editMenu1.getText().trim();
//        System.out.println(actualMenu);
//        Thread.sleep(1000);
//        WebElement edit = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/a[2]"));
//
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
//                System.out.println("null");
//
//            } else {
//                System.out.println(value);
//            }
//
//        }
//        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[2]/div[2]/div/button")).click();
//        Thread.sleep(1000);
//
//    }

//    @Test
//    @Order(8)
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
//        String[] expected = {"Pin Column", "Autosize This Column", "Autosize All Columns", "Group by Low Bin", "Reset Columns"};
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

//    @Test
//    @Order(9)
//    public void Columns() throws InterruptedException {
//
//
//        WebElement columns = driver.findElement(By.id("ag-9-button"));
//        columns.click();
//        Thread.sleep(1000);
//        WebElement columnsData = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div"));
//        String expectedColumns = columnsData.getText();
//        System.out.println(expectedColumns);
//        Thread.sleep(2000);
//        WebElement columnsButton = driver.findElement(By.id("ag-15-input"));
//        columnsButton.click();
//        Thread.sleep(1000);
//        WebElement search = driver.findElement(By.id("ag-16-input"));
//        search.sendKeys(" ");
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
//        WebElement lowBin = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/span[1]"));
//        WebElement description = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[4]/div/span[1]"));
//        WebElement cardType = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[5]/div/span[1]"));
//        WebElement highBin = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div/span[1]"));
//
//
//        WebElement drop = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[2]/div[2]"));
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(lowBin, drop).perform();
//        Thread.sleep(1000);
//
//        actions.dragAndDrop(description, drop).perform();
//        Thread.sleep(1000);
//
//        actions.dragAndDrop(highBin, drop).perform();
//        Thread.sleep(1000);
//        actions.dragAndDrop(cardType, drop).perform();
//        Thread.sleep(1000);
//
//
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[1]/div[1]/span/span[2]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[11]/div[1]/span/span[2]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[12]/div[1]/span/span[2]/span")).click();
//        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[13]/div[1]/span/span[2]/span")).click();
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//
//
//    }

//    @Test
//    @Order(9)
//    public void edit_isCorrect() throws InterruptedException {
//
//        Thread.sleep(1500);
//        WebElement slider = driver.findElement(By.xpath("//*[@id='layout-wrapper']/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[6]"));
//        int sliderMaxWidth = 1000;
//        int stepSize = 500;
//        Actions actions = new Actions(driver);
//        for (int i = 0; i < sliderMaxWidth; i += stepSize) {
//            WebElement deneme = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[1]"));
//            String denemeYazilari = deneme.getText().trim();
//            actions.dragAndDropBy(slider, stepSize, 0).perform();
//
//            System.out.println(denemeYazilari);
//
//            Thread.sleep(3000);
//        }
//
//        Thread.sleep(1000);
//    }

}





