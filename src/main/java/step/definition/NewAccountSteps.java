package step.definition;

import base.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.NewAccount;
import model.NewCustomer;
import pages.NewAccountPage;

import java.util.List;

/**
 * Created by vietluong on 8/13/2018.
 */
public class NewAccountSteps extends TestBase{
    NewAccountPage newAccountPage = new NewAccountPage();

    @When("^I create a new account with information as following:$")
    public void createNewAccount(DataTable dataTable) throws Exception {
        List<NewAccount> accountList = dataTable.asList(NewAccount.class);
        newAccountPage.createNewAccount(accountList.get(0));
    }
}
