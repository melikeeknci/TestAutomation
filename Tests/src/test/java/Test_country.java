import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class Test_country extends BaseTest {

    DashboardPage dashboardPage;
    CountryPage countryPage;
    AddNewPage addNewPage;
    EditPage editPage;
    CountryDetailsPage detailsPage;
    CountryDeletePage deletePage;
    GridPage gridPage;


    @Test
    @Order(1)
    public void search_country() {
        dashboardPage = new DashboardPage(driver);
        countryPage = new CountryPage(driver);
        dashboardPage.searchBox().searchCountry("Country");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    @Order(2)
    public void click_export() {
        countryPage.clickCountryExport();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        countryPage.clickCountryExportExcel();
    }

    @Test
    @Order(3)
    public void click_addnew() {
        addNewPage = new AddNewPage(driver);
        countryPage.clickCountryAddNew();
        addNewPage.clickOnSaveButton();
        addNewPage.add_countryName("//işlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVC\n");
        addNewPage.add_description("işlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsa");
        addNewPage.add_alpha2Code("işlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsa");
        addNewPage.add_alpha3Code("işlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsa");
        addNewPage.add_numericCode("işlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsaĞPOIUYTREWQ.ÇÖMNBVCXZŞÇLÖMNBVCişlkjhgfdsa");
        addNewPage.clickOnAddAnotherButton();
        addNewPage.clickOnCancelButton();

    }

    @Test
    @Order(4)
    public void click_details() {
        detailsPage = new CountryDetailsPage(driver);
        countryPage.clickCountryEdit();
        detailsPage.clickDetails();
        detailsPage.clickDetailsCancel();

    }
    @Test
    @Order(5)
    public void edit_delete(){
        deletePage = new CountryDeletePage(driver);
        countryPage.clickCountryEdit();
        deletePage.clickDelete();
        deletePage.clickEditDelete();
        deletePage.clickDeleteEditClose();
        countryPage.clickCountryEdit();
       deletePage.clickDelete();
        deletePage.clickEditCancel();

    }

    @Test
    @Order(6)
    public void click_edit() {
        editPage=new EditPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        countryPage.clickCountryEdit();
        editPage.clickEditButton();
        editPage.clickEditCancel();
        countryPage.clickCountryEdit();
        editPage.clickEditButton();
        editPage.clickEditUpdate();
    }

    @Test
    @Order(7)
    public void click_grid_reset() {
        gridPage = new GridPage(driver);
        gridPage.clickOnGrid();
        gridPage.clickReset();
        gridPage.clickOnGrid();
        gridPage.clickApply();
    }
    @Test
    @Order(8)
    public void click_grid() {
        gridPage = new GridPage(driver);
        gridPage.clickOnGrid();
        gridPage.clickSelector();

    }


}

















