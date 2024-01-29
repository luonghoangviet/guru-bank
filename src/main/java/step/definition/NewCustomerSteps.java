package step.definition;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Then;
import model.NewCustomer;
import pages.NewCustomerPage;

import java.util.List;
import java.util.Map;

/**
 * Created by vietluong on 8/12/2018.
 */
public class NewCustomerSteps extends TestBase {
    NewCustomerPage newCustomerPage = new NewCustomerPage();
@DataTableType
public NewCustomer newCustomertEntry(Map<String, String> entry) {
    return new NewCustomer(entry.get("customerName"), entry.get("gender"), entry.get("dob"), entry.get("address"), entry.get("city"), entry.get("state"), entry.get("pin"), entry.get("mobileNumber"), entry.get("email"), entry.get("password"));
}
    @Then("^I create a new customer with information as following:$")
    public void createNewCustomer(List<NewCustomer> customerList) {
        newCustomerPage.createNewCustommer(customerList.get(0));
    }

}
