package step.definition;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.When;
import model.NewAccount;
import pages.NewAccountPage;

import java.util.List;
import java.util.Map;

/**
 * Created by vietluong on 8/13/2018.
 */
public class NewAccountSteps extends TestBase {
    NewAccountPage newAccountPage = new NewAccountPage();

    @DataTableType
    public NewAccount newAccountEntry(Map<String, String> entry) {
        return new NewAccount(entry.get("customerId"), entry.get("accountType"), entry.get("initialDeposit"));
    }

    @When("^I create a new account with information as following:$")
    public void createNewAccount(List<NewAccount> accountList) throws Exception {
        newAccountPage.createNewAccount(accountList.get(0));
    }
}
