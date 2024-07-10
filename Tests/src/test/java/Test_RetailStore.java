import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test_RetailStore extends BaseTest {
    DashboardPage dashboardPage;
    SearchBox searchBox;


    @Test
    @Order(1)
    public void Test_RetailStore() throws InterruptedException {
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
        dashboardPage.searchBox().searchReatilStore("Retail Store");
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
        WebElement name = driver.findElement(By.xpath("//*[@id=\"name_div\"]/input"));
        name.sendKeys("njkkjnknkknhknjkkjnknkknhknjkkjnknkknhknjkkjnknkknhknjkkjnknkknhk");
        Thread.sleep(1000);


        WebElement fieldErrorMessage = driver.findElement(By.xpath("//*[@id=\"name_div\"]/div"));
        String errorMessage = fieldErrorMessage.getText().trim();
        System.out.println("Name: " + errorMessage);
        Thread.sleep(1000);
        name.sendKeys(Keys.CONTROL + "a");
        name.sendKeys(Keys.DELETE);
        Thread.sleep(1000);
        name.sendKeys("File Genel Merkez");


        //country
        driver.findElement(By.xpath("//*[@id=\"countryGuid\"]/div/div/div[2]/div")).click();
        Thread.sleep(2000);
        List<WebElement> countryListboxItems = driver.findElements(By.id("react-select-2-listbox"));
        for (WebElement item : countryListboxItems) {
            System.out.println("Currency verileri: " + item.getText());
        }
        Thread.sleep(3000);


        WebElement country = driver.findElement(By.id("react-select-2-input"));
        country.click();
        Thread.sleep(700);
        country.sendKeys("amerika");
        driver.findElement(By.id("react-select-2-option-4")).click();

        Thread.sleep(1500);


        WebElement adressLine1 = driver.findElement(By.xpath("//*[@id=\"addressLine1_div\"]/textarea"));
        adressLine1.sendKeys("sdfghjkjhgfdsasdfklkjhgfdssdfghjkjhgfdsasdfklkjhgfdssdfghjkjhgfdsasdfklkjhgfdssdfghjkjhgfdsasdfklkjhgfdssdfghjkjhgfdsasdfklkjhgfd");
        Thread.sleep(2000);

        WebElement fieldErrorMessage4 = driver.findElement(By.xpath("//*[@id=\"addressLine1_div\"]/div"));
        String errorMessage4 = fieldErrorMessage4.getText().trim();
        System.out.println("Adress Line 1 : " + errorMessage4);
        adressLine1.sendKeys(Keys.CONTROL + "a");
        adressLine1.sendKeys(Keys.DELETE);
        adressLine1.sendKeys("mevlana mah 853 sok/1 no:12");
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();


    }

    @Test
    @Order(3)
    public void addNew() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/button")).click();
        WebElement name = driver.findElement(By.xpath("//*[@id=\"name_div\"]/input"));
        name.sendKeys("File Genel Merkez");

//phone number

        WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"phoneNumber_div\"]/input"));
        phoneNumber.sendKeys("dxcdz");
        name.click();
//*[@id="region_div"]/div
        WebElement fieldErrorMessage = driver.findElement(By.xpath("//*[@id=\"phoneNumber_div\"]/div"));
        String errorMessage = fieldErrorMessage.getText().trim();
        System.out.println("Phone Number Letter: " + errorMessage);
        Thread.sleep(1000);
        phoneNumber.sendKeys(Keys.CONTROL + "a");
        phoneNumber.sendKeys(Keys.DELETE);
        phoneNumber.sendKeys("  ");
        name.click();
        WebElement fieldErrorMessage2 = driver.findElement(By.xpath("//*[@id=\"phoneNumber_div\"]/div"));
        String errorMessage2 = fieldErrorMessage2.getText().trim();
        System.out.println("Phone Number Space: " + errorMessage2);
        phoneNumber.sendKeys(Keys.CONTROL + "a");
        phoneNumber.sendKeys(Keys.DELETE);

        phoneNumber.sendKeys("12");
        name.click();
        WebElement fieldErrorMessage3 = driver.findElement(By.xpath("//*[@id=\"phoneNumber_div\"]/div"));
        String errorMessage3 = fieldErrorMessage3.getText().trim();
        System.out.println("Phone Number Must 3: " + errorMessage3);
        phoneNumber.sendKeys(Keys.CONTROL + "a");
        phoneNumber.sendKeys(Keys.DELETE);
        phoneNumber.sendKeys("454515155454515155454515155454515155");
        name.click();
        WebElement fieldErrorMessage4 = driver.findElement(By.xpath("//*[@id=\"phoneNumber_div\"]/div"));
        String errorMessage4 = fieldErrorMessage4.getText().trim();
        System.out.println("Phone Number 30 Limited: " + errorMessage4);
        phoneNumber.sendKeys(Keys.CONTROL + "a");
        phoneNumber.sendKeys(Keys.DELETE);

        phoneNumber.sendKeys("545 386 4552");
        //Region

        WebElement region = driver.findElement(By.xpath("//*[@id=\"region_div\"]/input"));
        region.sendKeys("ssfdvsssfdvsssfdvsssfdvsssfdvsssfdvsssfdvsssfdvs");
        name.click();
        WebElement fieldErrorMessage5 = driver.findElement(By.xpath("//*[@id=\"region_div\"]/div"));
        String errrorMessage5 = fieldErrorMessage5.getText().trim();
        System.out.println("Region: " + errrorMessage5);
        region.sendKeys(Keys.CONTROL + "a");
        region.sendKeys(Keys.DELETE);
        region.sendKeys("deneme");

//Description

        WebElement description = driver.findElement(By.xpath("//*[@id=\"description_div\"]/textarea"));
        description.sendKeys("  ");
        name.click();

        WebElement fieldErrorMessage6 = driver.findElement(By.xpath("//*[@id=\"description_div\"]/div"));
        String errorMessage6 = fieldErrorMessage6.getText().trim();
        System.out.println("Description Space: " + errorMessage6);
        description.sendKeys(Keys.CONTROL + "a");
        description.sendKeys(Keys.DELETE);

        description.sendKeys("sdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgdvsdgyjygjngsdgdvjg");
        name.click();
        WebElement fieldErrorMessage7 = driver.findElement(By.xpath("//*[@id=\"description_div\"]/div"));
        String errorMessage7 = fieldErrorMessage7.getText().trim();
        System.out.println("Description 400 Limited: " + errorMessage7);

        description.sendKeys(Keys.CONTROL + "a");
        description.sendKeys(Keys.DELETE);
        description.sendKeys("deneme");

//contact person

        WebElement contactPerson = driver.findElement(By.xpath("//*[@id=\"contactPerson_div\"]/input"));
        contactPerson.sendKeys("ssssscdscscdscscdscscdscscdscscdscscdscscdscscdscscdscscdscscdscscdscscdscscdscscdscscdscscdscscdscsc");
        name.click();
        WebElement fieldErrorMessage8 = driver.findElement(By.xpath("//*[@id=\"contactPerson_div\"]/div"));
        String errorMessage8 = fieldErrorMessage8.getText().trim();
        System.out.println("Contact Person: " + errorMessage8);
        contactPerson.sendKeys(Keys.CONTROL + "a");
        contactPerson.sendKeys(Keys.DELETE);
        contactPerson.sendKeys("de");
//contact number

        WebElement contactNumber = driver.findElement(By.xpath("//*[@id=\"contactNumber_div\"]/input"));
        contactNumber.sendKeys("12");
        name.click();
        WebElement fieldErrorMessage9 = driver.findElement(By.xpath("//*[@id=\"contactNumber_div\"]/div"));
        String errorMessage9 = fieldErrorMessage9.getText().trim();
        System.out.println("Contact Number 2 number: " + errorMessage9);
        contactNumber.sendKeys(Keys.CONTROL + "a");
        contactNumber.sendKeys(Keys.DELETE);
        contactNumber.sendKeys("asx");
        name.click();//*[@id="contactNumber_div"]/div
        WebElement fieldErrorMessage10 = driver.findElement(By.xpath("//*[@id=\"contactNumber_div\"]/div"));
        String errorMessage10 = fieldErrorMessage10.getText().trim();
        System.out.println("Contact Number letter: " + errorMessage10);
        contactNumber.sendKeys(Keys.CONTROL + "a");
        contactNumber.sendKeys(Keys.DELETE);
        contactNumber.sendKeys("1235465464646464646664684984968");
        name.click();
        WebElement fieldErrorMessage11 = driver.findElement(By.xpath("//*[@id=\"contactNumber_div\"]/div"));
        String errorMessage11 = fieldErrorMessage11.getText().trim();
        System.out.println("Contact Number Limit: " + errorMessage11);
        contactNumber.sendKeys(Keys.CONTROL + "a");
        contactNumber.sendKeys(Keys.DELETE);
        contactNumber.sendKeys("545 386 4552");

//country
        driver.findElement(By.xpath("//*[@id=\"addressLine1_div\"]/textarea")).sendKeys("mevlana mah 853 sok/1 no:12");
        WebElement country = driver.findElement(By.id("react-select-6-input"));//react-select-6-input
        country.click();
        Thread.sleep(700);
        country.sendKeys("amerika");
        driver.findElement(By.id("react-select-6-option-4")).click();
//country state

        driver.findElement(By.xpath("//*[@id=\"countryStateGuid\"]/div/div/div[2]/div")).click();
        List<WebElement> countryStatelistBoxItems = driver.findElements(By.xpath("//*[@id=\"react-select-7-listbox\"]/div"));
        for (WebElement countryState : countryStatelistBoxItems) {
            System.out.println(countryState.getText());
        }
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-7-option-1")).click();
        Thread.sleep(1500);

        String stateValue = driver.findElement(By.xpath("//*[@id=\"stateName_div\"]/input")).getAttribute("value");
        System.out.println("State Name verileri: " + stateValue);

        WebElement city = driver.findElement(By.xpath("//*[@id=\"cityGuid\"]/div/div/div[2]/div"));
        city.click();
        List<WebElement> citylistBoxItems = driver.findElements(By.id("react-select-8-option-0"));
        for (WebElement cityBox : citylistBoxItems) {
            System.out.println(cityBox.getText());
        }


        country.sendKeys("Türkiye");
        driver.findElement(By.id("react-select-6-listbox")).click();
        Thread.sleep(700);

        driver.findElement(By.xpath("//*[@id=\"countryStateGuid\"]/div/div/div[2]/div")).click();
        List<WebElement> countryStatelistBoxItems1 = driver.findElements(By.xpath("//*[@id=\"react-select-7-listbox\"]/div"));
        for (WebElement countryState1 : countryStatelistBoxItems1) {
            System.out.println("Country State: " + countryState1.getText());
        }
        driver.findElement(By.id("react-select-7-option-0")).click();
        String stateValue1 = driver.findElement(By.xpath("//*[@id=\"stateName_div\"]/input")).getAttribute("value");
        System.out.println("State Name verileri: " + stateValue1);

//State name
        WebElement stateName = driver.findElement(By.xpath("//*[@id=\"stateName_div\"]/input"));
        stateName.sendKeys("dscskdkccsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsxxxxxxxxxxxxxxx");
        name.click();
        WebElement fieldErrorMessage12 = driver.findElement(By.xpath("//*[@id=\"stateName_div\"]/div"));
        String errorMessage12 = fieldErrorMessage12.getText().trim();
        System.out.println("State Name Limit: " + errorMessage12);
        stateName.sendKeys(Keys.CONTROL + "a");
        stateName.sendKeys(Keys.DELETE);
        stateName.sendKeys("deneme");


        //city
        driver.findElement(By.xpath("//*[@id=\"cityGuid\"]/div/div/div[2]/div")).click();

        Thread.sleep(2000);
        List<WebElement> cityListboxItems = driver.findElements(By.id("react-select-8-listbox"));
        for (WebElement citydata : cityListboxItems) {
            System.out.println("City verileri: " + citydata.getText());
        }
        Thread.sleep(3000);
        driver.findElement(By.id("react-select-8-option-1")).click();
        Thread.sleep(1500);
        String cityValue = driver.findElement(By.xpath("//*[@id=\"cityName_div\"]/input")).getAttribute("value");
        System.out.println("City Value: " + cityValue);

        WebElement cityName = driver.findElement(By.xpath("//*[@id=\"cityName_div\"]/input"));
        cityName.sendKeys(Keys.CONTROL + "a");
        cityName.sendKeys(Keys.DELETE);
        cityName.sendKeys("dscskdkccsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsdcdscsxxxxxxxxxxxxxxxdeneme");
        name.click();
        WebElement fieldErrorMessage13 = driver.findElement(By.xpath("//*[@id=\"cityName_div\"]/div"));
        String errorMessage13 = fieldErrorMessage13.getText().trim();
        System.out.println("City Name Limit: " + errorMessage13);
        cityName.sendKeys(Keys.CONTROL + "a");
        cityName.sendKeys(Keys.DELETE);
        cityName.sendKeys("deneme");
        //Dsitrict
        driver.findElement(By.xpath("//*[@id=\"cityGuid\"]/div/div/div[2]/div")).click();
        driver.findElement(By.id("react-select-8-option-1")).click();
        driver.findElement(By.xpath("//*[@id=\"districtGuid\"]/div/div/div[2]/div")).click();
        Thread.sleep(1500);
        List<WebElement> districtListbox1Items = driver.findElements(By.id("react-select-9-listbox"));
        for (WebElement district : districtListbox1Items) {
            System.out.println("District verileri: " + district.getText());
        }
        driver.findElement(By.id("react-select-9-option-2")).click();
        Thread.sleep(1500);

        //dsitrict  name
        WebElement distrcitName = driver.findElement(By.xpath("//*[@id=\"districtName_div\"]/input"));
        distrcitName.sendKeys("cgnfnsssscgnfcgnfncgnfncgnfncgnfncgnfncgnfncgnfncgnfncgnfncgnfncgnfncgnfncgnfncgnfncgnfncgnfncgnfncgnfncgnfncgsssssfncgnfncgnfncgnfncgnfncgnfncgnfncgnfn");
        Thread.sleep(1500);
        name.click();
        WebElement fieldErrorMessage14 = driver.findElement(By.xpath("//*[@id=\"districtName_div\"]/div"));
        String errorMessage14 = fieldErrorMessage14.getText().trim();
        System.out.println("District Name Limit: " + errorMessage14);
        Thread.sleep(1000);
        String districtValue = driver.findElement(By.id("react-select-9-input")).getAttribute("value");
        System.out.println("District Value: " + districtValue);
        Thread.sleep(1500);
        distrcitName.sendKeys(Keys.CONTROL + "a");
        distrcitName.sendKeys(Keys.DELETE);
        Thread.sleep(1500);
        distrcitName.sendKeys("deneme");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"districtGuid\"]/div/div/div[2]/div")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("react-select-9-option-2")).click();
//Street Code
        Thread.sleep(1500);
        WebElement streetCode = driver.findElement(By.xpath("//*[@id=\"streetCode_div\"]/input"));
        streetCode.sendKeys("sdfvdvkhfjdoemckfj");
        name.click();
        WebElement fieldErrorMessage15 = driver.findElement(By.xpath("//*[@id=\"streetCode_div\"]/div"));
        String errorMessage15 = fieldErrorMessage15.getText().trim();
        System.out.println("Street Code Limit: " + errorMessage15);
        streetCode.sendKeys(Keys.CONTROL + "a");
        streetCode.sendKeys(Keys.DELETE);
        streetCode.sendKeys("deneme");


        //Street Name
        WebElement streetName = driver.findElement(By.xpath("//*[@id=\"streetName_div\"]/input"));
        streetName.sendKeys("scdcscs//*[@id=\"streetCode_div\"]/div//*[@id=\"streetCode_div\"]/div//*[@id=\"streetCode_div\"]/div//*[@id=\"streetCode_div\"]/div//*[@id=\"streetCode_div\"]/div//*[@id=\"streetCode_div\"]/div//*[@id=\"streetCode_div\"]/divcsd");
        name.click();
        WebElement fieldErrorMessage16 = driver.findElement(By.xpath("//*[@id=\"streetName_div\"]/div"));
        String errorMessage16 = fieldErrorMessage16.getText().trim();
        System.out.println("Street Name Limit: " + errorMessage16);
        streetName.sendKeys(Keys.CONTROL + "a");
        streetName.sendKeys(Keys.DELETE);
        streetName.sendKeys("deneme");


//Postal Code
        WebElement postalCode = driver.findElement(By.xpath("//*[@id=\"postalCode_div\"]/input"));
        postalCode.sendKeys("1zsvcz1zsvcz1zsvcz1zsvcz");
        name.click();
        WebElement fieldErrorMessage17 = driver.findElement(By.xpath("//*[@id=\"postalCode_div\"]/div"));
        String errorMessage17 = fieldErrorMessage17.getText().trim();
        System.out.println("Postal Code Limit: " + errorMessage17);
        postalCode.sendKeys(Keys.CONTROL + "a");
        postalCode.sendKeys(Keys.DELETE);
        postalCode.sendKeys("deneme");

        //Adress Lines


        WebElement adressLine2 = driver.findElement(By.xpath("//*[@id=\"addressLine2_div\"]/textarea"));
        adressLine2.sendKeys(" //*[@id=\"addressLine2_div\"]/textarea//*[@id=\"addressLine2_div\"]/textarea//*[@id=\"addressLine2_div\"]/textarea  ");
        name.click();
        WebElement fieldErrorMessage18 = driver.findElement(By.xpath("//*[@id=\"addressLine2_div\"]/div"));
        String errorMessage18 = fieldErrorMessage18.getText().trim();
        System.out.println("Adress Line2 Limit: " + errorMessage18);
        adressLine2.sendKeys(Keys.CONTROL + "a");
        adressLine2.sendKeys(Keys.DELETE);
        adressLine2.sendKeys("deneme");

        WebElement adreessLine3 = driver.findElement(By.xpath("//*[@id=\"addressLine3_div\"]/textarea"));
        adreessLine3.sendKeys(" //*[@id=\"addressLine2_div\"]/textarea//*[@id=\"addressLine2_div\"]/textarea//*[@id=\"addressLine2_div\"]/textarea  ");
        name.click();
        WebElement fieldErrorMessage19 = driver.findElement(By.xpath("//*[@id=\"addressLine3_div\"]/div"));
        String errorMessage19 = fieldErrorMessage19.getText().trim();
        System.out.println("Adress Line3 Limit: " + errorMessage19);
        adreessLine3.sendKeys(Keys.CONTROL + "a");
        adreessLine3.sendKeys(Keys.DELETE);
        adreessLine3.sendKeys("deneme");

//

        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[2]")).click();

    }

    @Test
    @Order(4)
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

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/button")).click();

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div[1]/div/button[2]")).click();

    }

    @Test
    @Order(5)
    public void delete() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[7]/div/div/div/a/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[7]/div/div[1]/div/div/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[6]/div/div/div/a/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[6]/div/div[1]/div/div/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[2]")).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div/div/a/i")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[1]/div[1]/div/div[1]/div/div/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[2]/div/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[1]/div/div[2]/a")).click();
        Thread.sleep(2000);//
        driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div/div/div[3]/div/div/button[2]")).click();
        Thread.sleep(1000);

    }
    @Test
    @Order(6)
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

        driver.findElement(By.xpath("//*[@id=\"streetName_div\"]/input")).sendKeys("sdc");
        driver.findElement(By.xpath("//*[@id=\"staticBackdrop\"]/div/div[2]/form/div[2]/div[1]/div[2]/div/button[1]")).click();

        Thread.sleep(1000);

    }

    @Test
    @Order(7)
    public void search_Button() throws InterruptedException {

//
//        WebElement slider = driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[6]/div[2]"));
//        int sliderMaxWidth = 600;
//        int stepSize = -550;
//        Actions actions = new Actions(driver);
//        for (int j = 0; j < sliderMaxWidth; j -= stepSize) {
//            actions.dragAndDropBy(slider, stepSize, 0).perform();
//
//        }
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
    @Order(8)
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


        WebElement name = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div/span[1]"));
        WebElement phoneNumber = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[4]/div/span[1]"));
        WebElement cityName = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[1]/div[2]/div/div[2]/div[5]/div/span[1]"));


        WebElement drop = driver.findElement(By.xpath("//*[@id=\"ag-10\"]/div[2]/div[2]/div[2]"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(name, drop).perform();
        Thread.sleep(1000);

        actions.dragAndDrop(phoneNumber, drop).perform();
        Thread.sleep(1000);
        actions.dragAndDrop(cityName, drop).perform();

        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[1]/div[1]/span/span[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[4]/div[1]/span/span[2]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"layout-wrapper\"]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/div/div/div[9]/div[1]/span/span[2]/span")).click();

        driver.navigate().refresh();
        Thread.sleep(2000);


    }

    @Test
    @Order(9)
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





















}
