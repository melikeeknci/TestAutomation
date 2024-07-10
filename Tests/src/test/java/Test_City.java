import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.NoSuchElementException;

//public class Test_City extends BaseTest {
//
//    DashboardPage dashboardpage;
//    SearchBox searchBox;
//    CityPage cityPage;
//    CityAddNewPage cityAddNewPage;
//    CitysearchPage citysearchPage;
//    CityEditPage cityEditPage;
//
//
//
//    @Test
//    @Order(1)
//    public void Test(){
//        dashboardpage = new DashboardPage(driver);
//        try {
//            driver.findElement(By.cssSelector("#layout-wrapper > div.main-content > div > div > div:nth-child(1) > div > div > div > nav > ol > b"));
//            driver.navigate().refresh();
//        } catch (NoSuchElementException e) {
//            System.out.println("NoSuchElementException");
//        }
//
//
//    }
//    @Test
//    @Order(2)
//    public void searchCity() {
//        dashboardpage = new DashboardPage(driver);
//        searchBox = new SearchBox(driver);
//        dashboardpage.searchBox().searchCity("City");
//    }

//    @Test
//    @Order(2)
//    public void CityAddNew() {
//        cityPage = new CityPage(driver);
//        cityAddNewPage = new CityAddNewPage(driver);
//        cityAddNewPage = new CityAddNewPage(driver);
//        cityPage.clickCityAddNew();
//        cityAddNewPage.clickCityAddNewSave();
//        cityAddNewPage.clickCityCode("sacsdcsf");
//        cityAddNewPage.clickCityName("sacsdcsfddfvfvsdvfasfcasfcawqerftgyhjkjbvcxsacsdcsfddfvfvsdvfasfcasfcawqerftgyhjkjbvcxsacsdcsfddfvfvsdvfasfcasfcawqerftgyhjkjbvcxsacsdcsfddfvfvsdvfasfcasfcawqerftgyhjkjbvcxsacsdcsfddfvfvsdvfasfcasfcawqerftgyhjkjbvcx");
//        cityAddNewPage.clickCityAddanother();
//        cityAddNewPage.clickCityAddNewCancel();
//    }
//
//    @Test
//    @Order(3)
//    public void cityExport() {
//        cityPage = new CityPage(driver);
//        cityPage.clickCityExport();
//        cityPage.clickCityExportExcel();
//        cityPage.clickCityExport();
//        cityPage.clickCityExportCsv();
//
//    }
//
//    @Test
//    @Order(4)
//    public void cityEdit() {
//        cityPage = new CityPage(driver);
//        cityEditPage = new CityEditPage(driver);
//        //  cityEditPage.clickCityEdit();
//        cityEditPage.CityEditButton();
//        // Elementi CSS seçicisi kullanarak bul ve bir öznitelik değeri al
//        WebElement element = driver.findElement(By.cssSelector("#cityCode_div"));
//        String response = element.getAttribute("textContent"); // Dikkat: "textContent" küçük harfle başlar
//        System.out.println(response + "565");
//        cityEditPage.clickCityEditCancel();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        cityEditPage.clickCityEdit();
//        cityEditPage.CityEditButton();
//        cityEditPage.CityEditUpdate();
//
//    }
//
//    @Test
//    @Order(5)
//    public void cityDelete() {
//        cityPage = new CityPage(driver);
//        cityEditPage = new CityEditPage(driver);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//        cityEditPage.clickCityDeleteClose();
//        cityEditPage.clickCityDeleteCancel();
//    }
//
//    //    @Test
////    @Order(6)
////    public void cityDetails(){
////       cityPage = new CityPage(driver);
////       cityEditPage = new CityEditPage(driver);
////        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
////        cityEditPage.clickCityEdit();
////        cityEditPage.CityDetails();
////        //cityEditPage.clickCityDetails();
////
////    }
////
//    @Test
//    @Order(7)
//    public void grid_search() {
//        cityPage = new CityPage(driver);
//        citysearchPage = new CitysearchPage(driver);
//        citysearchPage.clickCitySearch();
//        // citysearchPage.CitySearch("001");

//    }
////
////    @Test
////    @Order(8)
////    public void click_line_left() {
////        cityPage = new CityPage(driver);
////        citysearchPage = new CitysearchPage(driver);
////        citysearchPage.clickCitySearch();
////       citysearchPage.CityLine();
////        citysearchPage.CityPinColumns();
////        citysearchPage.CityPinLeft();
////
////    }
//    }
