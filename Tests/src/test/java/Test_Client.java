import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_Client extends BaseTest {

    DashboardPage dashboardpage;
    SearchBox searchBox;


    @Test
    @Order(1)
    public void Test_Client() throws InterruptedException {
        dashboardpage = new DashboardPage(driver);

        Thread.sleep(1000);
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
        dashboardpage.searchBox().searchClient("Client");
        Thread.sleep(700);

    }


    @Test
    @Order(3)
    public void addNew_requiredField() throws InterruptedException {

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
        //ıd
        WebElement clientID = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[1]/div/input"));
        clientID.sendKeys("fv");
        Thread.sleep(1000);


        WebElement fieldErrorMessage = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[1]/div/div"));
        String errorMessage = fieldErrorMessage.getText().trim();
        System.out.println(errorMessage);
        Thread.sleep(1000);

        clientID.sendKeys(Keys.CONTROL + "a");
        clientID.sendKeys(Keys.DELETE);
        Thread.sleep(1000);


        clientID.sendKeys("12345678901");
        WebElement fieldErrorMessage1 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[1]/div/div"));
        String errorMessage1 = fieldErrorMessage1.getText().trim();
        System.out.println(errorMessage1);
        Thread.sleep(1000);

        clientID.sendKeys(Keys.CONTROL + "a");
        clientID.sendKeys(Keys.DELETE);
        Thread.sleep(1000);


        clientID.sendKeys("    ");
        WebElement fieldErrorMessage2 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[1]/div/div"));
        String errorMessage2 = fieldErrorMessage2.getText().trim();
        System.out.println(errorMessage2);
        Thread.sleep(1000);

        clientID.sendKeys(Keys.CONTROL + "a");
        clientID.sendKeys(Keys.DELETE);
        clientID.sendKeys("41");

        //name
        WebElement clientName = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/input"));
        clientName.sendKeys("   ");
        WebElement fieldErrorMessage3 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/div"));
        String errorMessage3 = fieldErrorMessage3.getText().trim();
        System.out.println(errorMessage3);
        Thread.sleep(1000);

        clientName.sendKeys(Keys.CONTROL + "a");
        clientName.sendKeys(Keys.DELETE);
        Thread.sleep(1000);

        clientName.sendKeys("acadvajjjjjczdcsadvacaczdcsadvacaczdcsadvacaczdcsadvacaczdcsadvacaczdcsadvacaczdcsadvacaczdcsadvacaczdcsadvacaczdcsadvacaczdcsadvacaczdcsadvacaczdcccac");
        WebElement fieldErrorMessage4 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/div"));
        String errorMessage4 = fieldErrorMessage4.getText().trim();
        System.out.println(errorMessage4);
        Thread.sleep(1000);

        clientName.sendKeys(Keys.CONTROL + "a");
        clientName.sendKeys(Keys.DELETE);
        Thread.sleep(1000);

        clientName.sendKeys("melike");


        //currency
        driver.findElement(By.xpath("//*[@id=\"currencyGuid\"]/div/div/div[2]/div")).click();
        Thread.sleep(2000);
        List<WebElement> currencyListboxItems = driver.findElements(By.className("css-10wo9uf-option"));
        for (WebElement item : currencyListboxItems) {
            System.out.println("Currency verileri:" +item.getText());
        }
        Thread.sleep(3000);


        WebElement currency = driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]"));
        currency.click();
        Thread.sleep(700);
        currency.sendKeys("Afghanin");
        driver.findElement(By.xpath("//*[@id=\"react-select-2-option-1\"]")).click();

        Thread.sleep(1500);

    //Langue

    driver.findElement(By.xpath("//*[@id=\"languageGuid\"]/div/div[1]/div[2]")).click();
    Thread.sleep(2000);
    List<WebElement> languageListboxItems = driver.findElements(By.id("react-select-3-listbox"));
        for(
    WebElement item :languageListboxItems)

    {
        System.out.println("Language verileri:" +item.getText());
    }
        Thread.sleep(2000);


    WebElement language = driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]"));
        language.click();
        Thread.sleep(700);
        language.sendKeys("Almanca");
        driver.findElement(By.xpath("//*[@id=\"react-select-3-option-1\"]")).click();
        //save
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();

}

    @Test
    @Order(4)
    public void addNew_mustUniq() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[1]/div/input")).sendKeys("41");
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/input")).sendKeys("melike");

        WebElement currency = driver.findElement(By.id("react-select-8-input"));
        currency.click();
        currency.sendKeys("Afghanin");
        driver.findElement(By.xpath("//*[@id=\"react-select-8-option-1\"]")).click();
        driver.findElement(By.id("react-select-9-input")).click();

        WebElement language = driver.findElement(By.xpath("//*[@id=\"react-select-9-input\"]"));
        language.click();
        language.sendKeys("Almanca");
        driver.findElement(By.xpath("//*[@id=\"react-select-9-option-1\"]")).click();

        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div/div[2]/a")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[3]/div/div/button[2]")).click();

}


    @Test
    @Order(5)
    public void addNew() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[1]/div/input")).sendKeys("63");
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[1]/div[2]/div/input")).sendKeys("melike");
        driver.findElement(By.xpath("//*[@id=\"react-select-14-input\"]")).sendKeys("Afghanin");
        driver.findElement(By.xpath("//*[@id=\"react-select-14-option-1\"]")).click();




        WebElement bankCode = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[1]/div/input"));
        bankCode.sendKeys("666222");

        WebElement taxNumber = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[2]/div/input"));
        taxNumber.click();
        WebElement fieldErrorMessage5= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[1]/div/div"));
        String errorMessage5= fieldErrorMessage5.getText();
        System.out.println("Tax Number: " +errorMessage5);

        bankCode.sendKeys(Keys.CONTROL + "a");
        bankCode.sendKeys(Keys.DELETE);

        bankCode.sendKeys("6262");
        taxNumber.sendKeys("6666262626262626262626262222");

        bankCode.click();
        WebElement fieldErrorMessage6= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[2]/div/div"));
        String errorMessage6= fieldErrorMessage6.getText();
        System.out.println("Bank Code: " +errorMessage6);

        taxNumber.sendKeys(Keys.CONTROL + "a");
        taxNumber.sendKeys(Keys.DELETE);

        taxNumber.sendKeys("6262");


        driver.findElement(By.id("react-select-15-input")).sendKeys("Almanca");
        driver.findElement(By.xpath("//*[@id=\"react-select-15-option-1\"]")).click();
        Thread.sleep(1500);



        driver.findElement(By.xpath("//*[@id=\"countryGuid\"]/div/div[1]/div[2]/div")).click();
        Thread.sleep(700);
        List<WebElement> CountryListboxItems = driver.findElements(By.xpath("//*[@id=\"react-select-16-listbox\"]"));
        for (WebElement item : CountryListboxItems) {
            System.out.println("Country Verileri:" +item.getText());
       }
        Thread.sleep(2000);

        WebElement country = driver.findElement(By.xpath("//*[@id=\"react-select-16-input\"]"));
        country.sendKeys("Afganistan");
        driver.findElement(By.id("react-select-16-option-1")).click();


        driver.findElement(By.xpath("//*[@id=\"countryStateGuid\"]/div/div/div[2]/div")).click();
        List<WebElement>CountryStateListboxItems= driver.findElements(By.xpath("//*[@id=\"react-select-17-listbox\"]"));
        for (WebElement item : CountryStateListboxItems) {
            System.out.println("Country State Verileri:" +item.getText());
        }
        Thread.sleep(2000);


        country.sendKeys("amerika birleşik devletleri");
        Thread.sleep(1500);
        country.sendKeys(Keys.ENTER);


        driver.findElement(By.xpath("//*[@id=\"countryStateGuid\"]/div/div/div[2]/div")).click();
        List<WebElement>CountryStateListboxItems1= driver.findElements(By.xpath("//*[@id=\"react-select-17-listbox\"]"));
        for (WebElement item : CountryStateListboxItems1) {
            System.out.println("Country State Verileri:" +item.getText());
        }
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"react-select-17-listbox\"]/div"));
       WebElement countryState = driver.findElement(By.id("react-select-17-input"));
       countryState.sendKeys("kaliforniya");
       countryState.sendKeys(Keys.ENTER);



        WebElement stateName = driver.findElement(By.xpath("//*[@id=\"stateName_div\"]/input"));
        stateName.sendKeys("drgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvls");
        taxNumber.click();

        WebElement fieldErrorMessage9= driver.findElement(By.xpath("//*[@id=\"stateName_div\"]/div"));
        String errorMessage9= fieldErrorMessage9.getText();
        System.out.println("State Name: " +errorMessage9);

        stateName.sendKeys(Keys.CONTROL + "a");
        stateName.sendKeys(Keys.DELETE);

        stateName.sendKeys("6262");

        WebElement city = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[2]/div/input"));
        city.sendKeys("6666262626262626262626262222");
        WebElement fieldErrorMessage10= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[2]/div/div"));
        String errorMessage10= fieldErrorMessage10.getText();
        System.out.println(errorMessage10);
        city.sendKeys(Keys.CONTROL + "a");
        city.sendKeys(Keys.DELETE);
        city.sendKeys("6262");

        WebElement cityName = driver.findElement(By.xpath("//*[@id=\"cityName_div\"]/input"));
        cityName.sendKeys("drgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvls");
       taxNumber.click();

        WebElement fieldErrorMessage11= driver.findElement(By.xpath("//*[@id=\"cityName_div\"]/div"));
        String errorMessage11= fieldErrorMessage11.getText();
        System.out.println("City Name: "+errorMessage11);


        cityName.sendKeys(Keys.CONTROL + "a");
        cityName.sendKeys(Keys.DELETE);

        cityName.sendKeys("6262");


        WebElement postalCode = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[2]/div[3]/div/input"));
        postalCode.sendKeys("6666262626262626262626262222");
        taxNumber.click();

        WebElement fieldErrorMessage12= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[2]/div[3]/div/div"));
        String errorMessage12= fieldErrorMessage12.getText();
        System.out.println("Postal Code: " +errorMessage12);

        postalCode.sendKeys(Keys.CONTROL + "a");
        postalCode.sendKeys(Keys.DELETE);

        postalCode.sendKeys("6262");

        WebElement district = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[2]/div/input"));
        district.sendKeys("6666262626262626262626262222");
        WebElement fieldErrorMessage13= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[2]/div[2]/div/div"));
        String errorMessage13= fieldErrorMessage13.getText();
        System.out.println(errorMessage13);
        district.sendKeys(Keys.CONTROL + "a");
        district.sendKeys(Keys.DELETE);
        district.sendKeys("6262");

        WebElement districtName = driver.findElement(By.xpath("//*[@id=\"districtName_div\"]/input"));
        districtName.sendKeys("666626262sjbsajchswalhcıah626262xxacascacxsacsacadxdawcx6262626262222666626262sjbsajchswalhcıah626262xxacascacxsacsacadxdawcx6262626262222666626262sjbsajchswalhcıah626262xxacascacxsacsacadxdawcx6262626262222666626262sjbsajchswalhcıah626262xxacascacxsacsacadxdawcx6262626262222666626262sjbsajchswalhcıah626262xxacascacxsacsacadxdawcx6262626262222");
        taxNumber.click();

        WebElement fieldErrorMessage14= driver.findElement(By.xpath("//*[@id=\"districtName_div\"]/div"));
        String errorMessage14= fieldErrorMessage14.getText();
        System.out.println("District Name: " +errorMessage14);

        districtName.sendKeys(Keys.CONTROL + "a");
        districtName.sendKeys(Keys.DELETE);

        districtName.sendKeys("6262");



        WebElement streetCode = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[3]/div[3]/div/input"));
        streetCode.sendKeys("66662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222222");
        taxNumber.click();

        WebElement fieldErrorMessage15= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[3]/div[3]/div/div"));
        String errorMessage15= fieldErrorMessage15.getText();
        System.out.println("Street Code: " +errorMessage15);

        streetCode.sendKeys(Keys.CONTROL + "a");
        streetCode.sendKeys(Keys.DELETE);

        streetCode.sendKeys("6262");



        WebElement streetName = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[4]/div[1]/div/input"));
        streetName.sendKeys("66662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222222");
        taxNumber.click();

        WebElement fieldErrorMessage16= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[4]/div[1]/div/div"));
        String errorMessage16= fieldErrorMessage16.getText();
        System.out.println("Street Name: " +errorMessage16);

        streetName.sendKeys(Keys.CONTROL + "a");
        streetName.sendKeys(Keys.DELETE);

        streetName.sendKeys("6262");



        WebElement contactPerson = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[4]/div[2]/div/input"));
        contactPerson.sendKeys("6666262626262666626262626262626262626222266662626262626262626262622226666262626262626262626262222626262626262222");
        taxNumber.click();

        WebElement fieldErrorMessag17= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[4]/div[2]/div/div"));
        String errorMessage17= fieldErrorMessag17.getText();
        System.out.println("Contact Person: " +errorMessage17);

        contactPerson.sendKeys(Keys.CONTROL + "a");
        contactPerson.sendKeys(Keys.DELETE);

        contactPerson.sendKeys("6262");



        WebElement contactNumber = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[4]/div[3]/div/input"));
        contactNumber.sendKeys("666626262626666626262626262626262626222266662626262626262626262622222626262626262222");
        taxNumber.click();

        WebElement fieldErrorMessage18= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[4]/div[3]/div/div"));
        String errorMessage18= fieldErrorMessage18.getText();
        System.out.println("Contact Number: " +errorMessage18);

        contactNumber.sendKeys(Keys.CONTROL + "a");
        contactNumber.sendKeys(Keys.DELETE);

        contactNumber.sendKeys("6262");



        WebElement adressLine1 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[5]/div[1]/div/textarea"));
        adressLine1.sendKeys("66662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222222");
        taxNumber.click();

        WebElement fieldErrorMessage19= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[5]/div[1]/div/div"));
        String errorMessage19= fieldErrorMessage19.getText();
        System.out.println("Adress Line 1: " +errorMessage19);

        adressLine1.sendKeys(Keys.CONTROL + "a");
        adressLine1.sendKeys(Keys.DELETE);

        adressLine1.sendKeys("6262");



        WebElement adressLine2 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[5]/div[2]/div/textarea"));
        adressLine2.sendKeys("66662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222222");
        taxNumber.click();

        WebElement fieldErrorMessage20= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[5]/div[2]/div/div"));
        String errorMessage20= fieldErrorMessage20.getText();
        System.out.println("Adress Line 2: " +errorMessage20);

        adressLine2.sendKeys(Keys.CONTROL + "a");
        adressLine2.sendKeys(Keys.DELETE);

        adressLine2.sendKeys("6262");


        WebElement adressLine3 = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[5]/div[3]/div/textarea"));
        adressLine3.sendKeys("66662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222222");
        taxNumber.click();

        WebElement fieldErrorMessage21= driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/fieldset/div[3]/div[2]/div/div[5]/div[3]/div/div"));
        String errorMessage21= fieldErrorMessage21.getText();
        System.out.println("Adress Line 3: "+errorMessage21);


        adressLine3.sendKeys(Keys.CONTROL + "a");
        adressLine3.sendKeys(Keys.DELETE);

        adressLine3.sendKeys("6262");

        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();



   }

    @Test
    @Order(6)
    public void export() throws InterruptedException {
        Thread.sleep(700);
        WebElement exportButton = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/button"));

        exportButton.click();
        Thread.sleep(1000);

        String[] expectedMenu = {"Excel Export", "CSV Export"};
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div"));
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
        }
        else {
            System.out.println("Menü öğeleri beklenenle eşleşmiyor.");
        }
        Thread.sleep(700);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/button[1]")).click();

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/button[2]")).click();

    }

    @Test
    @Order(7)
    public void Columns() throws InterruptedException {


        WebElement columns = driver.findElement(By.xpath("//*[@id=\"ag-8-button\"]"));
        columns.click();
        Thread.sleep(1000);
        WebElement columnsButton = driver.findElement(By.xpath("//*[@id=\"ag-14-input\"]"));
        columnsButton.click();
        Thread.sleep(1000);
        WebElement search = driver.findElement(By.id("ag-15-input"));
        search.sendKeys("Client");
        Thread.sleep(700);
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"ag-9\"]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div"));
        searchButton.click();
        Thread.sleep(1500);
        search.sendKeys(Keys.CONTROL + "a");
        search.sendKeys(Keys.DELETE);
        Thread.sleep(1000);


        WebElement clientName = driver.findElement(By.xpath("//*[@id=\"ag-9\"]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div/span[1]"));
        WebElement currencyName = driver.findElement(By.xpath("//*[@id=\"ag-9\"]/div[2]/div[1]/div[2]/div/div[2]/div[4]/div/span[1]"));
        WebElement bankCode = driver.findElement(By.xpath("//*[@id=\"ag-9\"]/div[2]/div[1]/div[2]/div/div[2]/div[5]/div/span[1]"));


        WebElement drop = driver.findElement(By.xpath("//*[@id=\"ag-9\"]/div[2]/div[2]/div[2]"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(clientName, drop).perform();
        Thread.sleep(1000);
        actions.dragAndDrop(currencyName, drop).perform();
        Thread.sleep(1000);
        actions.dragAndDrop(bankCode, drop).perform();

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[2]/div[1]/span/span[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[4]/div[1]/span/span[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[5]/div[1]/span/span[2]/span")).click();

        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"ag-8-button\"]")).click();
        driver.findElement(By.id("ag-14-input")).click();
        driver.findElement(By.xpath("//*[@id=\"ag-8-button\"]")).click();
        Thread.sleep(1500);

    }

    @Test
    @Order(8)
    public void edit_isCorrect() throws InterruptedException {

        WebElement slider = driver.findElement(By.xpath("//*[@id='layout-wrapper']/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[6]"));
        int sliderMaxWidth = 2200;
        int stepSize = 550;
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

    @Test
    @Order(9)
    public void details() throws InterruptedException {
        Thread.sleep(1000);
        WebElement editButton = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/a/i"));
        editButton.click();
        WebElement details = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/a[2]"));
        details.click();
        Thread.sleep(1000);

        WebElement detailsCancel = driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[2]/div[2]/div/button"));
        detailsCancel.click();

        WebElement editMenu = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[7]/div/div/div/a/i"));
        editMenu.click();
        WebElement edit = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[7]/div/div[1]/div/div/a[1]"));
        edit.click();

        Thread.sleep(1000);

        List<WebElement> inputElements = driver.findElements(By.xpath("//input[@value]"));

        for (WebElement element : inputElements) {
            String value = element.getAttribute("value");
            System.out.println(value);
        }

        // Tüm textarea elementlerini seç
        List<WebElement> textareaElements = driver.findElements(By.xpath("//textarea"));

        for (WebElement element : textareaElements) {
            String value = element.getText();
            if (value == null || value.isEmpty()) {
                value = element.getText();
            }
            System.out.println(value);
        }

        driver.findElement(By.xpath("//*[@id=\"stateName_div\"]/input")).sendKeys("sdc");
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/a/i")).click();


        Thread.sleep(700);

        WebElement editMenu1 = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div"));
        String actualMenu = editMenu1.getText().trim();
        System.out.println(actualMenu);
        Thread.sleep(1000);

        WebElement edit1 = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/a[1]/i"));
        edit1.click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[2]")).click();


    }

    @Test
    @Order(9)
    public void delete() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[8]/div/div/div/a/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[8]/div/div[1]/div/div/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div/div/a/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div/div[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[3]/div/div/button[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[2]/div/div/div/a/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[2]/div/div[1]/div/div/button[1]")).click();
        Thread.sleep(1000);//
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[2]")).click();
        Thread.sleep(1000);


    }


    @Test
    @Order(10)
    public void search_Button() throws InterruptedException {


        WebElement slider = driver.findElement(By.xpath("//*[@id='layout-wrapper']/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[6]"));
        int sliderMaxWidth = 600;
        int stepSize = -550;
        Actions actions = new Actions(driver);
        for (int j = 0; j < sliderMaxWidth; j -= stepSize) {
            actions.dragAndDropBy(slider, stepSize, 0).perform();

        }
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/span")).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[1]/div/div[4]/div/div[2]/div[2]/div/div/div[2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[2]/button[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/span/span")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[2]/div/form/div[2]/button[2]")).click();
            Thread.sleep(2000);


            driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/span/span")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[1]/span[2]/span")).click();
            String[] expected = {"Pin Column", "Autosize This Column", "Autosize All Columns", "Group by Client ID", "Reset Columns"};
            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ag-menu-option']"));//
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
    }










