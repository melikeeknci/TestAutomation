import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_District extends BaseTest{

    DashboardPage dashboardPage;
    SearchBox searchBox;
    DistrictPage districtPage;



    @Test
    @Order(1)
    public void searchDistrict() {
        dashboardPage = new DashboardPage(driver);
        searchBox = new SearchBox(driver);
        dashboardPage.searchBox().searchDistrict("Customer Type");
    }

//    @Test
//    @Order(2)
//    public void export() {
//        districtPage = new DistrictPage(driver);
//        districtPage.clickDistrictExport();
//        districtPage.clickDistrictExcelExport();
//        districtPage.clickDistrictExport();
//        districtPage.clickDistrictExcelCsv();
//
//    }

//    @Test
//    @Order(3)
//    public void districtAddNew(){
//        districtPage = new DistrictPage(driver);
//        districtPage.clickDistrictAddNew();
//    }




}
