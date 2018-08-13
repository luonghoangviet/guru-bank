package step.definition;

import base.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import model.NewCustomer;
import pages.NewCustomerPage;

import java.util.List;

/**
 * Created by vietluong on 8/12/2018.
 */
public class NewCustomerSteps extends TestBase {
    NewCustomerPage newCustomerPage = new NewCustomerPage();

    @Then("^I create a new customer with information as following:$")
    public void createNewCustomer(DataTable dataTable) {
        List<NewCustomer> customerList = dataTable.asList(NewCustomer.class);
        newCustomerPage.createNewCustommer(customerList.get(0));
    }


}
