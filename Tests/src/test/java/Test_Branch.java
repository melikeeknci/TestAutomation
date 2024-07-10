import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_Branch extends BaseTest {
    DashboardPage dashboardPage;
    SearchBox searchBox;





    @Test
    @Order(1)
    public void Test_Branch() throws InterruptedException {
        dashboardPage = new DashboardPage(driver);
        searchBox = new SearchBox(driver);
        Thread.sleep(1000);
        try {
            driver.findElement(By.cssSelector("#layout-wrapper > div.main-content > div > div > div:nth-child(1) > div > div > div > nav > ol > b"));
            driver.navigate().refresh();
        } catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException");
        }

        Thread.sleep(2000);
        dashboardPage.searchBox().searchBranch("Branch");
        Thread.sleep(700);

    }
    @Test
    @Order(2)
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
        WebElement branchName = driver.findElement(By.xpath("//*[@id=\"branchName_div\"]/input"));
        branchName.sendKeys(" 1 ");
        Thread.sleep(1000);


        WebElement fieldErrorMessage = driver.findElement(By.xpath("//*[@id=\"branchName_div\"]/div"));
        String errorMessage = fieldErrorMessage.getText().trim();
        System.out.println("Branch Name: "+errorMessage);
        Thread.sleep(1000);

        branchName.sendKeys(Keys.CONTROL + "a");
        branchName.sendKeys(Keys.DELETE);
        Thread.sleep(1000);


        branchName.sendKeys("ascscaascscaascscaascscaascscaascscaascscaakkmlkmlkl");
        WebElement fieldErrorMessage1 = driver.findElement(By.xpath("//*[@id=\"branchName_div\"]/div"));
        String errorMessage1 = fieldErrorMessage1.getText().trim();
        System.out.println("Branch Name: "+errorMessage1);
        Thread.sleep(1000);

        branchName.sendKeys(Keys.CONTROL + "a");
        branchName.sendKeys(Keys.DELETE);
        Thread.sleep(1000);


        branchName.sendKeys("deneme");

        //code
        WebElement branchCode = driver.findElement(By.xpath("//*[@id=\"branchCode_div\"]/input"));
        branchCode.sendKeys("dsdcsdca");
        WebElement fieldErrorMessage2 = driver.findElement(By.xpath("//*[@id=\"branchCode_div\"]/div"));
        String errorMessage2 = fieldErrorMessage2.getText().trim();
        System.out.println("Branch Code: "+errorMessage2);
        Thread.sleep(1000);

        branchCode.sendKeys(Keys.CONTROL + "a");
        branchCode.sendKeys(Keys.DELETE);
        Thread.sleep(1000);

        branchCode.sendKeys("12");



        //country
        driver.findElement(By.xpath("//*[@id=\"countryGuid\"]/div/div/div[2]/div")).click();
        Thread.sleep(2000);
        List<WebElement> countryListboxItems = driver.findElements(By.id("react-select-2-listbox"));
        for (WebElement item : countryListboxItems) {
            System.out.println("Currency verileri: " +item.getText());
        }
        Thread.sleep(3000);


        WebElement country = driver.findElement(By.id("react-select-2-input"));
        country.click();
        Thread.sleep(700);
        country.sendKeys("amerika");
        driver.findElement(By.id("react-select-2-option-4")).click();

        Thread.sleep(1500);

        //Langue

        WebElement adressLine1 =driver.findElement(By.xpath("//*[@id=\"addressLine1_div\"]/textarea"));
        adressLine1.sendKeys("sacacascsasacacascsasacacascsasacacascsasacacascsasacacascsasacacascsasacacascsasaaxasasasassacacascsa");
        Thread.sleep(2000);

        WebElement fieldErrorMessage4 = driver.findElement(By.xpath("//*[@id=\"addressLine1_div\"]/div"));
        String errorMessage4= fieldErrorMessage4.getText().trim();
        System.out.println("Adress Line 1 : "+errorMessage4);
        adressLine1.sendKeys(Keys.CONTROL + "a");
        adressLine1.sendKeys(Keys.DELETE);
        adressLine1.sendKeys("mevlana mah 853 sok/1 no:12");
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();


    }

    @Test
    @Order(4)
    public void addNew_mustUniq() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"branchName_div\"]/input")).sendKeys("deneme");
        driver.findElement(By.xpath("//*[@id=\"branchCode_div\"]/input")).sendKeys("12");
        driver.findElement(By.id("react-select-6-input")).sendKeys("amerika");
        driver.findElement(By.id("react-select-6-option-4")).click();
        driver.findElement(By.xpath("//*[@id=\"addressLine1_div\"]/textarea")).sendKeys("mevlana mah 853 sok/1 no:12");
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div/div[2]/a")).click();
        Thread.sleep(1100);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[3]/div/div/button[2]")).click();///html/body/div[3]/div/div[1]/div/div/div/div[3]/div/div/button[2]


    }


    @Test
    @Order(5)
    public void addNew() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"branchName_div\"]/input")).sendKeys("deneme");
        WebElement branchCode = driver.findElement(By.xpath("//*[@id=\"branchCode_div\"]/input"));
        branchCode.sendKeys("41");


        WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"phoneNumber_div\"]/input"));
        phoneNumber.sendKeys("666222666222666222666222666222666222");
        branchCode.click();
        WebElement fieldErrorMessage= driver.findElement(By.xpath("//*[@id=\"phoneNumber_div\"]/div"));
        String errorMessage= fieldErrorMessage.getText();
        System.out.println("Phone Number: " + errorMessage);

        phoneNumber.sendKeys(Keys.CONTROL + "a");
        phoneNumber.sendKeys(Keys.DELETE);

        phoneNumber.sendKeys("fdsf");
        branchCode.click();

        WebElement fieldErrorMessage1= driver.findElement(By.xpath("//*[@id=\"phoneNumber_div\"]/div"));
        String errorMessage1= fieldErrorMessage1.getText();
        System.out.println("Phone Number: " +errorMessage1);
        phoneNumber.sendKeys(Keys.CONTROL + "a");
        phoneNumber.sendKeys(Keys.DELETE);

        phoneNumber.sendKeys("12");
        branchCode.click();
        WebElement fieldErrorMessage2= driver.findElement(By.xpath("//*[@id=\"phoneNumber_div\"]/div"));
        String errorMessage2= fieldErrorMessage2.getText();
        System.out.println("Phone Number: " +errorMessage2);
        phoneNumber.sendKeys(Keys.CONTROL + "a");
        phoneNumber.sendKeys(Keys.DELETE);

        phoneNumber.sendKeys("545 386 4552");

//Region



        WebElement region= driver.findElement(By.xpath("//*[@id=\"region_div\"]/input"));
        region.sendKeys("AlmancaAlmancaAlmancaAlmancaAlmancaAlmancaAlmanca");
        branchCode.click();
        WebElement fieldErrorMessage3= driver.findElement(By.xpath("//*[@id=\"region_div\"]/div"));
        String errorMessage3= fieldErrorMessage3.getText();
        System.out.println("Region: " +errorMessage3);
        region.sendKeys(Keys.CONTROL + "a");
        region.sendKeys(Keys.DELETE);

        region.sendKeys("Ege Bölgesi");


//Contact Person

        WebElement contactPerson = driver.findElement(By.xpath("//*[@id=\"contactPerson_div\"]/input"));
        contactPerson.sendKeys("AfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistanAfganistan");
        branchCode.click();
        WebElement fieldErrorMessage4= driver.findElement(By.xpath("//*[@id=\"contactPerson_div\"]/div"));
        String errorMessage4= fieldErrorMessage4.getText();
        System.out.println("Contact Person: " +errorMessage4);
        contactPerson.sendKeys(Keys.CONTROL + "a");
        contactPerson.sendKeys(Keys.DELETE);
        contactPerson.sendKeys("Yetkili Kişi");
//Contact Number

        WebElement contactNumber = driver.findElement(By.xpath("//*[@id=\"contactNumber_div\"]/input"));
        contactNumber.sendKeys("kaliforniya");
        branchCode.click();
        WebElement fieldErrorMessage5= driver.findElement(By.xpath("//*[@id=\"contactNumber_div\"]/div"));
        String errorMessage5= fieldErrorMessage5.getText();
        System.out.println("Contact Number: " +errorMessage5);
        contactNumber.sendKeys(Keys.CONTROL + "a");
        contactNumber.sendKeys(Keys.DELETE);

        contactNumber.sendKeys("kaliforniyakaliforniyakaliforniyakaliforniyakaliforniyakaliforniyakaliforniyakaliforniyakaliforniyakaliforniyakaliforniyakaliforniyakaliforniyakaliforniyakaliforniya");
        branchCode.click();
        WebElement fieldErrorMessage6= driver.findElement(By.xpath("//*[@id=\"contactNumber_div\"]/div"));
        String errorMessage6= fieldErrorMessage6.getText();
        System.out.println("Contact Number: " +errorMessage6);

        contactNumber.sendKeys(Keys.CONTROL + "a");
        contactNumber.sendKeys(Keys.DELETE);

        contactNumber.sendKeys("0545 386 4552");




////country
        driver.findElement(By.id("react-select-10-input")).sendKeys("amerika");
        driver.findElement(By.id("react-select-10-option-4")).click();
        //country state
        WebElement countryState = driver.findElement(By.xpath("//*[@id=\"countryStateGuid\"]/div/div/div[2]/div"));
        countryState.click();
        Thread.sleep(2000);
        List<WebElement> countryStateListboxItems = driver.findElements(By.id("react-select-11-listbox"));
        for (WebElement item : countryStateListboxItems) {
            System.out.println("Country State verileri: " +item.getText());
        }
        driver.findElement(By.id("react-select-11-option-1")).click();
        String stateValue= driver.findElement(By.xpath("//*[@id=\"stateName_div\"]/input")).getAttribute("value");
        System.out.println("State Name: "+stateValue);
        Thread.sleep(3000);
        ////*[@id="stateName_div"]/input

        driver.findElement(By.id("react-select-10-input")).click();
        driver.findElement(By.id("react-select-10-option-1")).click();
        Thread.sleep(2000);


        Thread.sleep(1000);
        //
        driver.findElement(By.id("react-select-11-input")).click();
        List<WebElement> countryStateListbox1Items = driver.findElements(By.id("react-select-11-listbox"));
        for (WebElement item : countryStateListbox1Items) {
            System.out.println("Country State verileri1: " +item.getText());
        }


        Thread.sleep(1500);

        String stateValue1= driver.findElement(By.xpath("//*[@id=\"stateName_div\"]/input")).getAttribute("value");
         System.out.println("State Name: "+stateValue1);

        WebElement stateName =driver.findElement(By.name("stateName"));
        stateName.sendKeys("drgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvls");
        branchCode.click();

        WebElement fieldErrorMessage9= driver.findElement(By.xpath("//*[@id=\"stateName_div\"]/div"));
        String errorMessage9= fieldErrorMessage9.getText();
        System.out.println("State Name: " +errorMessage9);

        stateName.sendKeys(Keys.CONTROL + "a");
        stateName.sendKeys(Keys.DELETE);

        stateName.sendKeys("6262");

        driver.findElement(By.xpath("//*[@id=\"cityGuid\"]/div/div[1]/div[2]/div")).click();
        List<WebElement> cityListbox1Items = driver.findElements(By.xpath("//*[@id=\"react-select-12-option-0\"]"));
        for (WebElement item : cityListbox1Items) {
            System.out.println("City verileri1: " +item.getText());
        }


        WebElement cityName = driver.findElement(By.xpath("//*[@id=\"cityName_div\"]/input"));
        cityName.sendKeys("drgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvlsdrgvkmkmvls");
        branchCode.click();

        WebElement fieldErrorMessage11= driver.findElement(By.xpath("//*[@id=\"cityName_div\"]/div"));
        String errorMessage11= fieldErrorMessage11.getText();
        System.out.println("City Name: "+errorMessage11);


        cityName.sendKeys(Keys.CONTROL + "a");
        cityName.sendKeys(Keys.DELETE);

        cityName.sendKeys("6262");


        driver.findElement(By.xpath("//*[@id=\"districtGuid\"]/div/div/div[2]/div")).click();
        List<WebElement> districtListBoxItems = driver.findElements(By.xpath("//*[@id=\"react-select-13-option-0\"]"));
        for (WebElement item : districtListBoxItems) {
            System.out.println("dsitrict verileri: " +item.getText());
        }


        WebElement districtName = driver.findElement(By.xpath("//*[@id=\"districtName_div\"]/input"));
        districtName.sendKeys("66662vc  vvvvfvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvczsc zsczczsczczsczccxsxcccccxcccccccccccccccccccc62626262626262626262222");
        branchCode.click();

        WebElement fieldErrorMessage12= driver.findElement(By.xpath("//*[@id=\"districtName_div\"]/div"));
        String errorMessage12= fieldErrorMessage12.getText();
        System.out.println("Postal Code: " +errorMessage12);

        districtName.sendKeys(Keys.CONTROL + "a");
        districtName.sendKeys(Keys.DELETE);

        districtName.sendKeys("6262");


        WebElement streetCode = driver.findElement(By.xpath("//*[@id=\"streetCode_div\"]/input"));
        streetCode.sendKeys("66662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222222");
        branchCode.click();

        WebElement fieldErrorMessage16= driver.findElement(By.xpath("//*[@id=\"streetCode_div\"]/div"));
        String errorMessage16= fieldErrorMessage16.getText();
        System.out.println("Street Code: " +errorMessage16);

        streetCode.sendKeys(Keys.CONTROL + "a");
        streetCode.sendKeys(Keys.DELETE);

        streetCode.sendKeys("6262");



        WebElement streetName = driver.findElement(By.xpath("//*[@id=\"streetName_div\"]/input"));
        streetName.sendKeys("66662626262666626262626266662626262626262626262622226666262626262626262626262222666626262626262626262626222262626262626222262666626262626262626262626222266662626262626262626262622226666262626262626262626262222626262626262222");
        branchCode.click();

        WebElement fieldErrorMessag17= driver.findElement(By.xpath("//*[@id=\"streetName_div\"]/div"));
        String errorMessage17= fieldErrorMessag17.getText();
        System.out.println("Contact Person: " +errorMessage17);

        streetName.sendKeys(Keys.CONTROL + "a");
        streetName.sendKeys(Keys.DELETE);

        streetName.sendKeys("6262");



        WebElement postalCode = driver.findElement(By.xpath("//*[@id=\"postalCode_div\"]/input"));
        postalCode.sendKeys("666626262626666626262626262626262626222266662626262626262626262622222626262626262222");
        branchCode.click();

        WebElement fieldErrorMessage18= driver.findElement(By.xpath("//*[@id=\"postalCode_div\"]/div"));
        String errorMessage18= fieldErrorMessage18.getText();
        System.out.println("Postal Code: " +errorMessage18);

        postalCode.sendKeys(Keys.CONTROL + "a");
        postalCode.sendKeys(Keys.DELETE);

        postalCode.sendKeys("6262");



        WebElement adressLine1 = driver.findElement(By.xpath("//*[@id=\"addressLine1_div\"]/textarea"));
        adressLine1.sendKeys("66662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222222");
        branchCode.click();

        WebElement fieldErrorMessage19= driver.findElement(By.xpath("//*[@id=\"addressLine1_div\"]/div"));
        String errorMessage19= fieldErrorMessage19.getText();
        System.out.println("Adress Line 1: " +errorMessage19);

        adressLine1.sendKeys(Keys.CONTROL + "a");
        adressLine1.sendKeys(Keys.DELETE);

        adressLine1.sendKeys("mevlana mah. 853/1 sok no: 12");



        WebElement adressLine2 = driver.findElement(By.xpath("//*[@id=\"addressLine2_div\"]/textarea"));
        adressLine2.sendKeys("66662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222222");
        branchCode.click();

        WebElement fieldErrorMessage20= driver.findElement(By.xpath("//*[@id=\"addressLine2_div\"]/div"));
        String errorMessage20= fieldErrorMessage20.getText();
        System.out.println("Adress Line 2: " +errorMessage20);

        adressLine2.sendKeys(Keys.CONTROL + "a");
        adressLine2.sendKeys(Keys.DELETE);

        adressLine2.sendKeys("mevlana mah. 853/1 sok no: 12");


        WebElement adressLine3 = driver.findElement(By.xpath("//*[@id=\"addressLine3_div\"]/textarea"));
        adressLine3.sendKeys("66662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222266662626262626262626262622226666262626262626262626262222666626262626262626262626222222");
        branchCode.click();

        WebElement fieldErrorMessage21= driver.findElement(By.xpath("//*[@id=\"addressLine3_div\"]/div"));
        String errorMessage21= fieldErrorMessage21.getText();
        System.out.println("Adress Line 3: "+errorMessage21);


        adressLine3.sendKeys(Keys.CONTROL + "a");
        adressLine3.sendKeys(Keys.DELETE);

        adressLine3.sendKeys("mevlana mah. 853/1 sok no: 12");

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


        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div"));
        List<String> actualMenuItems = new ArrayList<>();

        for (WebElement element : elements) {
            actualMenuItems.add(element.getText().trim());
            System.out.println(actualMenuItems);
        }


        Thread.sleep(700);

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/button[1]")).click();
         driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/button[2]")).click();

    }

    @Test
    @Order(7)
    public void Columns() throws InterruptedException {


        WebElement columns = driver.findElement(By.xpath("//*[@id=\"ag-9-button\"]"));
        columns.click();
        Thread.sleep(1000);
        WebElement columnsButton = driver.findElement(By.xpath("//*[@id=\"ag-15-input\"]"));
        columnsButton.click();
        Thread.sleep(1000);
        WebElement search = driver.findElement(By.id("ag-16-input"));
        search.sendKeys("branch");
        Thread.sleep(700);
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[1]/div/div/div[2]"));
        searchButton.click();
        Thread.sleep(1500);
        search.sendKeys(Keys.CONTROL + "a");
        search.sendKeys(Keys.DELETE);
        Thread.sleep(1000);


        WebElement branchName = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div/span[1]"));
        WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[4]/div/span[1]"));
        WebElement cityName = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[5]/div/span[1]"));


        WebElement drop = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[2]/div[2]"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(branchName, drop).perform();
        Thread.sleep(1000);

        actions.dragAndDrop(phoneNumber, drop).perform();
        Thread.sleep(1000);
        actions.dragAndDrop(cityName, drop).perform();

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[1]/div[1]/span/span[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[8]/div[1]/span/span[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[9]/div[1]/span/span[2]/span")).click();

        driver.navigate().refresh();
        Thread.sleep(2000);


    }

    @Test
    @Order(8)
    public void edit_isCorrect() throws InterruptedException {
        Thread.sleep(1500);

        driver.findElement(By.id("ag-9-button")).click();
        driver.findElement(By.id("ag-15-input")).click();
        driver.findElement(By.id("ag-9-button")).click();
        Thread.sleep(1500);
        WebElement slider = driver.findElement(By.xpath("//*[@id='layout-wrapper']/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[6]"));
        int sliderMaxWidth = 2200;
        int stepSize = 500;
        Actions actions = new Actions(driver);
        for (int i = 1; i < sliderMaxWidth; i += stepSize) {
            WebElement deneme = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[1]"));
            String denemeYazilari = deneme.getText().trim();
            actions.dragAndDropBy(slider, stepSize, 0).perform();

            System.out.println(denemeYazilari);

            Thread.sleep(3000);
        }

        Thread.sleep(1000);
    }

    @Test
    @Order(9)
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

        driver.findElement(By.xpath("//*[@id=\"branchName_div\"]/input")).sendKeys("sdc");
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();

        Thread.sleep(1000);




    }
//
    @Test
    @Order(9)
    public void delete() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[9]/div/div/div/a/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[9]/div/div[1]/div/div/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[9]/div/div[2]/div/a/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[9]/div/div[2]/div/div/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[2]")).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div/div/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//html/body/div[3]/div/div[1]/div/div/div/div[1]/div/div[2]/a")).click();
        Thread.sleep(2000);//
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[3]/div/div/button[2]")).click();
        Thread.sleep(1000);


    }


    @Test
    @Order(10)
    public void search_Button() throws InterruptedException {


        WebElement slider = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[6]/div[2]"));
        int sliderMaxWidth = 600;
        int stepSize = -550;
        Actions actions = new Actions(driver);
        for (int j = 0; j < sliderMaxWidth; j -= stepSize) {
            actions.dragAndDropBy(slider, stepSize, 0).perform();

        }
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
//

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/span/span")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[6]/div/div[1]/span[2]/span")).click();
        String[] expected = {"Pin Column", "Autosize This Column", "Autosize All Columns", "Group by Branch Code", "Reset Columns"};
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
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[7]/div/div/div[3]")).click();


    }
}



