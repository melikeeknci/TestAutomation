//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//
//import java.time.Duration;
//import java.util.NoSuchElementException;
//
//public class Test_country extends BaseTest {
//
//    DashboardPage dashboardPage;
//    CountryPage countryPage;
//    AddNewPage addNewPage;
//    EditPage editPage;
//    CountryDetailsPage detailsPage;
//    CountryDeletePage deletePage;
//    GridPage gridPage;
//
//    DashboardPage dashboardpage;
//    SearchBox searchBox;
//    CurrencyPage currencyPage;
//    CurrencyAddNewPage currencyAddNewPage;
//
//
//    @Test
//    @Order(1)
//    public void Test_Currency() {
//        dashboardpage = new DashboardPage(driver);
//
//        try {
//            driver.findElement(By.cssSelector("#layout-wrapper > div.main-content > div > div > div:nth-child(1) > div > div > div > nav > ol > b"));
//            driver.navigate().refresh();
//        } catch (NoSuchElementException e) {
//            System.out.println("NoSuchElementException");
//        }
//    }
//
//    @Test
//    @Order(2)
//    public void search() throws InterruptedException {
//        searchBox = new SearchBox(driver);
//        dashboardpage.searchBox().searchCurrency("country");
//
//    }
//
//
//    @Test
//    @Order(2)
//    public void click_export() {
//        countryPage.clickCountryExport();
//
//        countryPage.clickCountryExportExcel();
//    }
//
//    @Test
//    @Order(3)
//    public void click_addnew() {
//        addNewPage = new AddNewPage(driver);
//        countryPage.clickCountryAddNew();
//        addNewPage.clickOnSaveButton();
//        addNewPage.add_countryName("//işlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVC\n");
//        addNewPage.add_description("işlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsa");
//        addNewPage.add_alpha2Code("işlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsa");
//        addNewPage.add_alpha3Code("işlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsa");
//        addNewPage.add_numericCode("işlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsa");
//        addNewPage.clickOnAddAnotherButton();
//        addNewPage.clickOnCancelButton();
//
//    }
//
//    @Test
//    @Order(4)
//    public void click_details() {
//        detailsPage = new CountryDetailsPage(driver);
//        countryPage.clickCountryEdit();
//        detailsPage.clickDetails();
//        detailsPage.clickDetailsCancel();
//
//    }
//
//    @Test
//    @Order(5)
//    public void edit_delete() {
//        deletePage = new CountryDeletePage(driver);
//        countryPage.clickCountryEdit();
//        deletePage.clickDelete();
//        deletePage.clickEditDelete();
//        deletePage.clickDeleteEditClose();
//        countryPage.clickCountryEdit();
//        deletePage.clickDelete();
//        deletePage.clickEditCancel();
//
//    }
//
//    @Test
//    @Order(6)
//    public void click_edit() {
//        editPage = new EditPage(driver);
//
//        countryPage.clickCountryEdit();
//        editPage.clickEditButton();
//        editPage.clickEditCancel();
//        countryPage.clickCountryEdit();
//        editPage.clickEditButton();
//        editPage.clickEditUpdate();
//    }
//
//    @Test
//    @Order(7)
//    public void click_grid_reset() {
//        gridPage = new GridPage(driver);
//        gridPage.clickOnGrid();
//        gridPage.clickReset();
//        gridPage.clickOnGrid();
//        gridPage.clickApply();
//    }
//
//    @Test
//    @Order(8)
//    public void click_grid() {
//        gridPage = new GridPage(driver);
//        gridPage.clickOnGrid();
//        gridPage.clickSelector();
//
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
